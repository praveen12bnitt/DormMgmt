package com.smartworks.dorm.dao;

import java.util.List;

import org.hibernate.Query;
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
	
	public ServiceRequest load(Integer srNumber) {
		return (ServiceRequest) sessionFactory.getCurrentSession().load(ServiceRequest.class, srNumber);
	}
	
	public List<ServiceRequest> loadAll() {
		String sql = "from ServiceRequest";		
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		return query.list();
	}
}
