package com.smartworks.dorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.smartworks.dorm.dao.ServiceRequestDao;
import com.smartworks.dorm.domain.ServiceRequest;

@Component
@Transactional
public class SRServiceImpl implements SRService {

	@Autowired
	ServiceRequestDao serviceRequestDao;
	
	public Integer createSR(ServiceRequest sr) {
		return serviceRequestDao.create(sr);
	}
	
	public void update(ServiceRequest sr) {
		serviceRequestDao.update(sr);
	}
	
	public ServiceRequest load(Integer srNumber) {
		return serviceRequestDao.load(srNumber);
	}
	
	public List<ServiceRequest> loadAll() {
		return serviceRequestDao.loadAll();
	}
}
