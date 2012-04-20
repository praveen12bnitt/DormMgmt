package com.smartworks.dorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.smartworks.dorm.dao.UserRoleDao;
import com.smartworks.dorm.domain.User;

@Component
@Transactional
public class UserRoleService {
	
	@Autowired
	UserRoleDao userRoleDao;
	
	public User getUser(Integer userId) {
		return userRoleDao.loadUser(userId);
	}

}
