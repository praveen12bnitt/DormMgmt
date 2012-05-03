package com.smartworks.dorm.web.form;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SRForm {
	
	String mode="new";
	
	Integer srNumber;	
	String date;
	String dorm;
	String room;
	String category;
	String location;
	String item;
	String assignedResource;
	String remarks;
	
	
	public SRForm() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a"); 
		Date dateObj = new Date();
		date = sdf.format(dateObj);
	}
	public Integer getSrNumber() {
		return srNumber;
	}
	public void setSrNumber(Integer srNumber) {
		this.srNumber = srNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDorm() {
		return dorm;
	}
	public void setDorm(String dorm) {
		this.dorm = dorm;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
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
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
