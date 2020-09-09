package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CartId")
	private int cartId;
	@Column(name="cartAmount")
	private int cartAmount;
	@Column(name="Quantity")
	private int quantity;
	
	
	public int getCartId() {
		return cartId;
	}


	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public int getCartAmount() {
		return cartAmount;
	}


	public void setCartAmount(int cartAmount) {
		this.cartAmount = cartAmount;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public Cart(int cartId, int cartAmount, int quantity) {
		super();
		this.cartId = cartId;
		this.cartAmount = cartAmount;
		this.quantity = quantity;
	}


	public Cart() {
		
	}



}
