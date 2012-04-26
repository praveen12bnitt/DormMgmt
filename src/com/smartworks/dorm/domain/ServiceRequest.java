package com.smartworks.dorm.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="SERVICE_REQUEST")
@Proxy(lazy=false)
public class ServiceRequest {

	@Id
	@GeneratedValue
	@Column(name="ID")
	Integer id;
	
	@Column(name="CREATED_DTTM")
	Timestamp createdDttm;
	
	@Version
	@Column(name="LASTUPDATE_DTTM")
	Timestamp lastUpdateDttm;
	
	@Column(name="ROOM_NUMBER")
	String roomNumber;
	
	@Column(name = "CATEGORY")
	String category;
	
	@Column(name = "LOCATION")
	String location;
	
	@Column(name="ITEM")
	String item;
	
	@Column(name = "ASSIGNED_RESOURCE")
	String assignedResource;
	
	@Lob
	@Column(name="REMARKS")
	String remarks;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="DORM_NAME")
	Dormitory dormitory;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedDttm() {
		return createdDttm;
	}

	public void setCreatedDttm(Timestamp createdDttm) {
		this.createdDttm = createdDttm;
	}

	public Timestamp getLastUpdateDttm() {
		return lastUpdateDttm;
	}

	public void setLastUpdateDttm(Timestamp lastUpdateDttm) {
		this.lastUpdateDttm = lastUpdateDttm;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getAssignedResource() {
		return assignedResource;
	}

	public void setAssignedResource(String assignedResource) {
		this.assignedResource = assignedResource;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Dormitory getDormitory() {
		return dormitory;
	}

	public void setDormitory(Dormitory dormitory) {
		this.dormitory = dormitory;
	}
	
	
	
}
