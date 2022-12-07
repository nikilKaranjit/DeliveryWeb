package com.kawarides.admin.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="kwd_customerorder")
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customerorder_id")
	private Long customerOrderId;
	@Column(name="order_totalprice")
	private double orderTotalPRice;
	@Column(name="order_date")
	private Date OrderDate;
	@Column(name="deliver_date")
	private Date deliveryDate;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private DeliveryAddress deliveryaddress;
    
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customers customers;
	
	@ManyToOne
	@JoinColumn(name="products_id")
	private Products products;
	
	
	public CustomerOrder(){
		
		
	}

	public CustomerOrder(Long customerOrderId, double orderTotalPRice, DeliveryAddress deliveryaddress,
			Customers customers, Products products) {
		super();
		this.customerOrderId = customerOrderId;
		this.orderTotalPRice = orderTotalPRice;
		this.deliveryaddress = deliveryaddress;
		this.customers = customers;
		this.products = products;
	}

	public Long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(Long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public double getOrderTotalPRice() {
		return orderTotalPRice;
	}

	public void setOrderTotalPRice(double orderTotalPRice) {
		this.orderTotalPRice = orderTotalPRice;
	}

	public DeliveryAddress getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(DeliveryAddress deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	
	
	
}
