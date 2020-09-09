package com.bank.group5.zuulservice.model;

public class Customer {

	
	private int custId;
	private int age;
	private String state;
	private String lastName;
	private String firstName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer(int custId, int age, String state, String lastName, String firstName) {
		super();
		this.custId = custId;
		this.age = age;
		this.state = state;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Customer() {

	}

}
