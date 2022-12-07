package com.kawarides.admin.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="kwd_store")
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="store_id")
	private Long storeId;
	@Column(name="store_name")
	private String storeName;
	@Column(name="store_number")
	private int storeNumber;

	@OneToMany(targetEntity=Products.class,mappedBy="store",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Products> products;

	public Store() {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeNumber = storeNumber;
		this.products = products;
	}

	

	
	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}
	
	
}
