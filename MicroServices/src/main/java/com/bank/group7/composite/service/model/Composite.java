package com.bank.group7.composite.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Composite")
public class Composite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	@Column(name="customerID")
	private int custId;
	@Column(name="productID")
	private String prodId;
	@Column(name="cartID")
	private int cartId;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Composite(int custId, String prodId, int cartId) {
		super();
		this.custId = custId;
		this.prodId = prodId;
		this.cartId = cartId;
	}
	
	public Composite() {
		
	}
}
