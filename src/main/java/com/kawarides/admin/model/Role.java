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
@Table(name="role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private Long roleId;
	@Column(name="role_type")
	private String roleType;
	
	
	@OneToMany(targetEntity=User.class,mappedBy="role",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<User> users;
	
	
	public Role(){
		
	}
	
	public Role(Long roleId, String roleType) {
		
		this.roleId = roleId;
		this.roleType = roleType;
	}
	
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	
	
	
	
}
