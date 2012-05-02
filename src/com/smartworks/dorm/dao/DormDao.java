package com.smartworks.dorm.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.smartworks.dorm.domain.Dormitory;

@Repository
public class DormDao extends AbstractDao {

	public void create(Dormitory dorm) {
		sessionFactory.getCurrentSession().save(dorm);
	}
	
	public List<Dormitory> loadAll() {		
		String sql = "from Dormitory";		
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		return query.list();
	}
}
