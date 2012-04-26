package com.smartworks.dorm.dao;

import org.springframework.stereotype.Repository;

import com.smartworks.dorm.domain.ServiceRequest;

@Repository
public class ServiceRequestDao extends AbstractDao {

	public Integer create(ServiceRequest servRequest) {
		servRequest.setCreatedDttm(DaoHelper.getCurrentTimeStamp());
		return (Integer) sessionFactory.getCurrentSession().save(servRequest);
	}
	
	public void update(ServiceRequest sr) {
		sessionFactory.getCurrentSession().update(sr);
	}
}
