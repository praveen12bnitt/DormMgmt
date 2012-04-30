<%@page import="com.smartworks.dorm.exportimport.*"%>
<%@page import="com.smartworks.dummy.*"%>
<%@page import="java.util.*"%>

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

//DataExporter.exportData("employee");

TDataList dataList = DataExporter.importData("employee");
out.println(dataList.getListObjects().size());

%>
</body>
Data Exported sucessfully
</html>