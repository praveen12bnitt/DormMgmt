package com.smartworks.dorm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="DORMITORY")
@Proxy(lazy=false)
public class Dormitory {

	@Id
	String name;
	
	@Column(name="LOCATION")
	String location;
	
	@Column(name="ADDRESS")
	String address;
	
	@Column(name="NO_OF_ROOMS")
	Integer numberOfRooms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(Integer numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}	
	
}
