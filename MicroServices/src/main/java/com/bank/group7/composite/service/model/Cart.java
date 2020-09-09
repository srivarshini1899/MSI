package com.bank.group7.composite.service.model;

public class Cart {
	
	private int cartId;
	private int cartAmount;
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
