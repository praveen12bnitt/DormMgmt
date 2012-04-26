package com.smartworks.dorm.dao;

import java.sql.Timestamp;
import java.util.Date;

public class DaoHelper {

	public static Timestamp getCurrentTimeStamp() {
		Date date= new java.util.Date();
		return new Timestamp(date.getTime());
	}
}
