package com.kawarides.admin.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="kwd_product")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private Long productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="added_date")
	private String addedDate;
	@Column(name="modified_date")
	private String modifiedDate;
	@Column(name="image")
	private String imageURl;
	@Column(name="product_price")
	private float productPrice;
	@Column(name="product_quantity")
	private Integer productQuantity;
	
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Categories categories;
	
	
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brands brands;
	

	
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	
	@OneToMany(targetEntity=CustomerOrder.class,mappedBy="products",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<CustomerOrder> customerOrder;
	
	
	public Products(){
		
	}





	public Products(Long productId, String productName, String addedDate, String modifiedDate, String imageURl,
			float productPrice, Integer productQuantity, Categories categories, Brands brands) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.addedDate = addedDate;
		this.modifiedDate = modifiedDate;
		this.imageURl = imageURl;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.categories = categories;
		this.brands = brands;
	}





	public Long getProductId() {
		return productId;
	}





	public void setProductId(Long productId) {
		this.productId = productId;
	}





	public String getProductName() {
		return productName;
	}





	public void setProductName(String productName) {
		this.productName = productName;
	}





	public String getAddedDate() {
		return addedDate;
	}





	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}





	public String getModifiedDate() {
		return modifiedDate;
	}





	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}





	public String getImageURl() {
		return imageURl;
	}





	public void setImageURl(String imageURl) {
		this.imageURl = imageURl;
	}





	public float getProductPrice() {
		return productPrice;
	}





	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}





	public Integer getProductQuantity() {
		return productQuantity;
	}





	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}





	public Categories getCategories() {
		return categories;
	}





	public void setCategories(Categories categories) {
		this.categories = categories;
	}





	public Brands getBrands() {
		return brands;
	}





	public void setBrands(Brands brands) {
		this.brands = brands;
	}




	
	

	
	
	
	

}
