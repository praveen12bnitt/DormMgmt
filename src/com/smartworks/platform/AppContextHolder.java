package com.smartworks.platform;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContextHolder implements ApplicationContextAware {

	private static ApplicationContext appCtx = null;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		appCtx = ctx;
	}

	public static ApplicationContext getAppCtx() {
		return appCtx;
	}
	

}
