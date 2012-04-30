package com.smartworks.dummy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="ADDRESS")
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Address")
@Proxy(lazy=false)
public class TAddress implements Serializable {
	
	@Column(name="addressTypeId")
	@XmlAttribute(name = "addressTypeId", required = true)
	private Integer addressTypeId;
	
	@Column(name="streetName")
	@XmlAttribute(name = "streetName", required = true)
	private String streetName;
	
	@Column(name="city")
	@XmlAttribute(name = "city", required = true)
	private String city;
	
	@Column(name="state")
	@XmlAttribute(name = "state", required = true)
	private String state;
	
	@Column(name="zipCode")
	@XmlAttribute(name = "zipCode", required = true)
	private String zipCode;
	
	@Column(name="country")
	@XmlAttribute(name = "country", required = true)
	private String country;	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="employeeId")
	private TEmployee employee;
	
	public Integer getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(Integer addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TEmployee getEmployee() {
		return employee;
	}

	public void setEmployee(TEmployee employee) {
		this.employee = employee;
	}



}
