package com.smartworks.dorm.converter;

import com.smartworks.dorm.domain.Dormitory;
import com.smartworks.dorm.domain.ServiceRequest;
import com.smartworks.dorm.web.form.SRForm;

public class SRServiceConverter {

	public static ServiceRequest convert(SRForm srForm) {
		ServiceRequest sr = new ServiceRequest();
		sr.setAssignedResource(srForm.getAssignedResource());
		sr.setCategory(srForm.getCategory());
		Dormitory dorm = new Dormitory();
		dorm.setCode(srForm.getDorm());
		sr.setDormitory(dorm);
		sr.setItem(srForm.getItem());
		sr.setLocation(srForm.getLocation());
		sr.setRemarks(srForm.getRemarks());
		sr.setRoomNumber(srForm.getRoom());
		sr.setId(srForm.getSrNumber());
		return sr;
	}
	
	public static SRForm convert(ServiceRequest sr) {
		SRForm srForm = new SRForm();		
		srForm.setAssignedResource(sr.getAssignedResource());
		srForm.setCategory(sr.getCategory());		
		srForm.setDate(sr.getCreatedDttm().toString());		
		srForm.setDorm(sr.getDormitory().getName());
		srForm.setItem(sr.getItem());
		srForm.setLocation(sr.getLocation());
		srForm.setRemarks(sr.getRemarks());
		srForm.setRoom(sr.getRoomNumber());
		srForm.setSrNumber(sr.getId());
		return srForm;
	}
	
	
}
