<%@page import="com.smartworks.dorm.domain.ServiceRequest"%>
<%@page import="com.smartworks.platform.AppContextUtil"%>
<%@page import="com.smartworks.dorm.service.ServiceRequestService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

ServiceRequest sr = new ServiceRequest();
sr.setAssignedResource("prajan");
sr.setRemarks("Test Service Request");

ServiceRequestService srService = AppContextUtil.getBean("serviceRequestService");
srService.createSR(sr);


%>
</body>
Service Request created sucessfully
</html>