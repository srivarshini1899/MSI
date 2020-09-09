package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_details")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="OrderId")
	private int orderId;
	@Column(name="NoOfOrders")
	private int orderQuantity;
	@Column(name="OrderAmount")
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
