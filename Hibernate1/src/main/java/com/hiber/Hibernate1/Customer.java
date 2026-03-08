package com.hiber.Hibernate1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column
	private int customerId;
	
	@Column
	private String customerName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_details")		//foreign key
	private CustomerDetails customer_details;	//Object of another class
	
	
	public CustomerDetails getCustomer_details() {
		return customer_details;
	}

	public void setCustomer_details(CustomerDetails customer_details) {
		this.customer_details = customer_details;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
