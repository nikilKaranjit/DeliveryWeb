package com.kawarides.admin.model;

import java.sql.Date;
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
@Table(name="kwd_categories")
public class Categories {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="category_id")
	private Long id;
	@Column(name="category_name")
	private String name;
	@Column(name="category_description")
	private String description;
	@Column(name="added_date")
	private Date addedDate;
	@Column(name="modified_date")
	private Date modifiedDate;
	
	
	@OneToMany(targetEntity=Products.class,mappedBy="categories",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Products> products;
	
	
	public Categories(){
		
	}


	public Categories(Long id, String name, String description, Date addedDate, Date modifiedDate,
			Set<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.addedDate = addedDate;
		this.modifiedDate = modifiedDate;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public Set<Products> getProducts() {
		return products;
	}


	public void setProducts(Set<Products> products) {
		this.products = products;
	}
	
	
	
	
	
	
}
