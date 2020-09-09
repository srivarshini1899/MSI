package com.bank.group7.composite.service.model;

public class Order {
	
	private int orderId;
	private int orderQuantity;
	private int orderAmount;
		
	
	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Order() {
		
	}

	public Order(int orderId, int orderQuantity, int orderAmount) {
		super();
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		this.orderAmount = orderAmount;
		
	}

	

}
