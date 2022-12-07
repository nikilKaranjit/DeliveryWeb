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
@Table(name="kwd_brands")
public class Brands {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="brand_id")
	private Long id;
	@Column(name="brand_name")
	private String name;
	
	@OneToMany(targetEntity=Products.class,mappedBy="brands",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Products> products;
	
	
	public Brands(){
		
	}


	public Brands(Long id, String name, Set<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Products> getProducts() {
		return products;
	}


	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	
	

}
