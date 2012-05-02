package com.smartworks.dorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartworks.dorm.dao.DormDao;
import com.smartworks.dorm.domain.Dormitory;

@Service
@Transactional
public class DormServiceImpl implements DormService {

	@Autowired
	DormDao dormDao;
	
	@Override
	public void create(Dormitory dorm) {
		dormDao.create(dorm);		
	}

	@Override
	public List<Dormitory> getAllDorms() {
		return dormDao.loadAll();
	}

}
