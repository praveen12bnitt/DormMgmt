package com.smartworks.dorm.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.smartworks.dorm.domain.ServiceRequest;

@Transactional
public interface SRService {

	public Integer createSR(ServiceRequest sr);
	
	public void update(ServiceRequest sr);
	
	public ServiceRequest load(Integer srNumber);
	
	public List<ServiceRequest> loadAll();
	
}
