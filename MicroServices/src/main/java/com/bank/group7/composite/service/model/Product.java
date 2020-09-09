package com.bank.group7.composite.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prodId")
	private String prodId;
	@Column(name="productNamed")
	private String prodName;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="price")
	private int price;
	
	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(String prodId, String prodName, int quantity, int price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}

	public Product() {
		
	}



}
