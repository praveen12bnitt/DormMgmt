package com.smartworks.dorm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;



@Entity
@Table(name="ROLES")
@Proxy(lazy=false)

public class Role implements Serializable {
	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Id
	@Column(name="ROLE_ID")
	private Integer roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="ROLE_DESC")
	private String roleDesc;
}
