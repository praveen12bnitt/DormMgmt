package com.smartworks.dorm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="USERS")
@Proxy(lazy=false)

public class User implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	Integer userid;
	
	@Column(name="USERNAME", length=100)
	String userName;
	@Column(name="PASSWORD", length=100)
	String password;
	@Column(name="ENABLED", length=1)
	Boolean enabled;
	
	@Transient
	String[] userRoles;
	
	public List<UserRole> getListRoles() {
		return listRoles;
	}
	public void setListRoles(List<UserRole> listRoles) {
		this.listRoles = listRoles;
	}
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, orphanRemoval=true, mappedBy="user")
	private List<UserRole> listRoles = new ArrayList<UserRole>();
	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	public String[] getUserRoles() {
		String[] roles = new String[listRoles.size()];
		int j = 0;
		for(UserRole role: listRoles) {
			roles[j++] = role.getRoleName();
		}
		return roles;
		
	}
	public void setUserRoles(String[] userRoles) {
		this.userRoles = userRoles;
		for(String role: userRoles) {
			UserRole userRole = new UserRole(role);
			userRole.setUser(this);
			listRoles.add(userRole);
		}
	}
	
	public String[] selectedRoles() {
		return this.userRoles;
	}
	
}
