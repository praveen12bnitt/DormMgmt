<%@page import="com.smartworks.dorm.domain.Dormitory"%>
<%@page import="com.smartworks.dorm.service.DormService"%>
<%@page import="com.smartworks.dorm.domain.UserRole"%>
<%@page import="com.smartworks.dorm.domain.User"%>
<%@page import="com.smartworks.dorm.service.UserRoleService"%>
<%@page import="com.smartworks.test.TestBean"%>
<%@page import="com.smartworks.platform.AppContextUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Seed Data</title>
</head>
<body>
<%

User user = new User();
user.setUserName("system");
user.setPassword("password");
user.setEnabled(true);

UserRoleService userServ = AppContextUtil.getBean("userRoleService");
Integer userId = userServ.addUser(user);
user.setUserid(userId);

UserRole userRole = new UserRole();
userRole.setRoleName("AUTHENTICATED");
userRole.setUser(user);

userServ.addUserRole(userRole);

DormService dormServ = AppContextUtil.getBean("dormServiceImpl");

Dormitory dorm = new Dormitory();
dorm.setCode("B185");
dorm.setName("Building 185");
dormServ.create(dorm);


dorm = new Dormitory();
dorm.setCode("B186");
dorm.setName("Building 186");
dormServ.create(dorm);

dorm = new Dormitory();
dorm.setCode("B187");
dorm.setName("Building 187");
dormServ.create(dorm);


dorm = new Dormitory();
dorm.setCode("B71");
dorm.setName("Building 71");
dormServ.create(dorm);


%>
</body>
</html>