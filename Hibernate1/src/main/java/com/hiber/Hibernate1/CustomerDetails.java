package com.hiber.Hibernate1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer Details")
public class CustomerDetails {

	@Id
	@Column
	private int id;
	
	@Column
	private String address;
	
	@Column
	private int mobNo;
	
	@Column
	private String email;
	
	@OneToOne(mappedBy="customer_details")
	private Customer customer;
	
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(int id, int mobNo, String address, String email) {
		super();
		this.id = id;
		this.address = address;
		this.mobNo = mobNo;
		this.email = email;
	}


	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

}
