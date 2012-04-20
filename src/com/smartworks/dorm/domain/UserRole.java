package com.smartworks.dorm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="USER_ROLES")
@Proxy(lazy=false)
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;

	public UserRole() {
		
	}
	
	public UserRole(String roleName) {
		this.roleName = roleName;		
	}
	
	@Id
	@GeneratedValue
	@Column(name="USER_ROLE_ID")
	private Integer userRoleId;
	
	
	@Column(name="AUTHORITY")
	private String roleName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	@JsonIgnore
	private User user;
	
	@JsonIgnore
	public User getUser() {
		return user;
	}
	
	@JsonIgnore
	public void setUser(User user) {
		this.user = user;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
