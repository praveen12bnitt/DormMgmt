package com.smartworks.dorm.dao;

import org.springframework.stereotype.Repository;

import com.smartworks.dorm.domain.User;
import com.smartworks.dorm.domain.UserRole;

@Repository
public class UserRoleDao extends AbstractDao {

	
	public User loadUser(Integer id) {
		User user = (User) sessionFactory.getCurrentSession().load(User.class, id);
		return user;
	}
	
	public Integer addUser(User user) {
		Integer userId = (Integer) sessionFactory.getCurrentSession().save(user);
		return userId;
	}
	
	public void addUserRole(UserRole role) {
		sessionFactory.getCurrentSession().save(role);
	}
	
}
