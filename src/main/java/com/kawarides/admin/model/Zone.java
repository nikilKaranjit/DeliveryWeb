package com.kawarides.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kwd_address_zone")
public class Zone {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="zone_id")
	 private Long zoneId;
	 @Column(name="zone")
	 private String  Zone;
	 
	 public Zone(){
		 
	 }
	 
	public Zone(Long zoneId, String zone) {
		super();
		this.zoneId = zoneId;
		Zone = zone;
	}

	public Long getZoneId() {
		return zoneId;
	}

	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}

	public String getZone() {
		return Zone;
	}

	public void setZone(String zone) {
		Zone = zone;
	}
	 
	 
	
}
