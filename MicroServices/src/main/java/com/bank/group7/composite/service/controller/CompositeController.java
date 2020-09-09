package com.bank.group7.composite.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bank.group7.composite.service.model.Cart;
import com.bank.group7.composite.service.model.Composite;
import com.bank.group7.composite.service.model.Customer;
import com.bank.group7.composite.service.model.Order;
import com.bank.group7.composite.service.model.Product;
import com.bank.group7.composite.service.service.CompositeService;

@RestController
public class CompositeController {

	@Autowired
	private RestTemplate template;

	@Autowired
	private CompositeService service;

	@PostMapping("/Customer/{id}/CreateCart")
	public int createCart(@PathVariable(value = "id") int id) {
		Cart cart = new Cart();
		Customer cust = template.getForObject("http://localhost:8081/api/customer/getCustomer/" + id, Customer.class);
		if (cust != null) {

			cart = template.postForObject("http://localhost:9091/createCart", cart, Cart.class);
			Composite comp = new Composite();
			comp.setCustId(id);
			comp.setCartId(cart.getCartId());
			service.createCart(comp);
		}
		return cart.getCartId();
	}

	@PostMapping("/Customer/{id}/AddToCart/{cartId}/Products/{prodId}")
	public String createCart(@PathVariable(value = "id") int id, @PathVariable(value = "cartId") int cartId,
			@PathVariable(value = "prodId") String prodId) {

		Composite comp = new Composite();

		Customer cust = template.getForObject("http://localhost:8081/api/customer/getCustomer/" + id, Customer.class);
		Cart cart = template.getForObject("http://localhost:9091/getCart/" + id, Cart.class);

		if (cust != null && cart != null) {

			Product prod = template.getForObject("http://localhost:8081/api/product/getProduct/" + prodId,
					Product.class);
			if (prod != null) {
				cart.setCartAmount(prod.getPrice());
				cart.setQuantity(1);
				// update cart with customerId and productId
				template.put("http://localhost:9091/updateCart/" + cartId, cart);

				comp.setCustId(id);
				comp.setCartId(cart.getCartId());
				comp.setProdId(prod.getProdId());
				service.updateCart(comp);
			}

		}
		return comp.getProdId();
	}

	@PostMapping("/Customer/{id}/placeOrder/{cartId}")
	public String createOrder(@PathVariable(value = "id") int id, @PathVariable(value = "cartId") int cartId) {
		Customer cust = template.getForObject("http://localhost:8081/api/customer" + "/getCustomer/" + id,
				Customer.class);
		Cart cart = template.getForObject("http://localhost:9091/getCart/" + cartId, Cart.class);

		Order order = new Order();
		if (cust != null && cart != null) {

			order.setOrderQuantity(1);
			order.setOrderAmount(cart.getCartAmount());
			order = template.postForObject("http://localhost:9093/createOrder", order, Order.class);

		}
		Order createdOrder = template.getForObject("http://localhost:9093/getOrder/" + order.getOrderId(), Order.class);
		return "order placed with " + createdOrder.getOrderId() + " of amount " + createdOrder.getOrderAmount();
	}

}
