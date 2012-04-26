package com.smartworks.dorm.db.util;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.smartworks.platform.AppContextUtil;

public class DateUtil {
	
	public static Timestamp getCurrentDBTimeStamp() {
		SessionFactory sessionFactory = AppContextUtil.getBean("sessionFactory");
		Session s = sessionFactory.getCurrentSession();
		SQLQuery sqlQuery = s.createSQLQuery("select CURRENT_TIMESTAMP");
		List<Timestamp> l = sqlQuery.list();
		return l.get(0);		
	}
}
