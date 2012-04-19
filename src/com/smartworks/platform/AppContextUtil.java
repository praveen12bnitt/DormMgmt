package com.smartworks.platform;


import org.springframework.context.ApplicationContext;

import com.smartworks.platform.AppContextHolder;

public class AppContextUtil {

	public static <T> T getBean(String beanName) {
		return (T) AppContextHolder.getAppCtx().getBean(beanName);
	}
	
	public static ApplicationContext getApplicationContext() {
		return AppContextHolder.getAppCtx();
	}
}
