package com.smartworks.dorm.service;

import java.util.List;

import com.smartworks.dorm.domain.Dormitory;

public interface DormService {

	public void create(Dormitory dorm);
	
	public List<Dormitory> getAllDorms();
}
