package com.kawarides.admin.model;

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
@Table(name="kwd_address")
public class DeliveryAddress {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="address_id")
	private Long id;
    @Column(name="house_address")
	private String houseAddress;
    @Column(name="landmark")
	private String landMark;
    @Column(name="phone_number")
	private Integer phone;
    
    @ManyToOne
	@JoinColumn(name="zone_id")
	private Zone zone;
    
    @OneToOne
    @JoinColumn(name="customerorder_id")
    private CustomerOrder customerOrder;
    
    
    public DeliveryAddress(){
    	
    }

	public DeliveryAddress(Long id, String houseAddress, String landMark, Integer phone, Zone zone,
			CustomerOrder customerOrder) {
		super();
		this.id = id;
		this.houseAddress = houseAddress;
		this.landMark = landMark;
		this.phone = phone;
		this.zone = zone;
		this.customerOrder = customerOrder;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
    

	
    
    
}
