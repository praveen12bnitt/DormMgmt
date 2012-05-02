package com.smartworks.dummy;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="EMPLOYEE")
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Employee")
@Proxy(lazy=false)
public class TEmployee implements Serializable {
	
	@Id
	@XmlAttribute(name = "employeeId", required = true)
	private Integer employeeId;
	
	@Column(name="firstName")
	@XmlAttribute(name = "firstName", required = true)
	String firstName;
	
	@Column(name="lastName")
	@XmlAttribute(name = "lastName", required = true)
	String lastName;
	
	@Column(name="position")
	@XmlAttribute(name = "position", required = true)
	String position;
	
	@Column(name="salary")
	@XmlAttribute(name = "salary", required = true)
	String salary;
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy="employee")
	@XmlElementWrapper(name = "addressList")
    @XmlElement(name = "address", required = true)
	private List<TAddress> addressList;
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public List<TAddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<TAddress> addressList) {
		this.addressList = addressList;
	}

		
}
