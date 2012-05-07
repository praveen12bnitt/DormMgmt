<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Request Management</title>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/css/reset-min.css" />' />
<link type="text/css" rel="stylesheet"
	href='<c:url value="/css/reset-min.css" />' />
<link rel="stylesheet" type="text/css"
	href='<c:url value="/css/style.css" />' />
<script type="text/javascript"
	src='<c:url value="/js/jquery-1.5.1.min.js" />'></script>
<script type="text/javascript"
	src='<c:url value="/js/home.1334201885.js" />'></script>
<script type="text/javascript">
	$(function() {
		$('#sr-lookup').click(function() {
			var url = $(this).attr('url');
			var srNum = $('#sr-num').val();
			url = url + "?srNumber=" + srNum;
			window.location.href = url;
			return false;
		});
	});
</script>
</head>
<body>
	<div id="menu">
		<div class="max-width container">
			<a id="main-logo" href="http://www.srm-group.com">DORM</a>
			<div id="menu-nav" class="container">
				<ul>
					<li><a href="reservation.htm">Reservation</a></li>
					<li><a href="housekeeping.html">House Keeping</a></li>
					<li><a class="selected-menu" id="customers-tab"
						href='<c:url value="/SR.form" />'>Service Request</a></li>
					<li><a href="#">Reports</a></li>

				</ul>
			</div>
		</div>
	</div>
	<div class="max-width">
		<div class="container">
			<h1>Service Request Management</h1>
			<div id="line"></div>
			<div class="grouped_elements">
				<a href='<c:url value="/SR/create.form" />'>Create New Service
					Request</a>
			</div>

			<div class="grouped_elements">
				<table>
					<tbody>
						<tr>
							<td>Edit Service Request</td>
							<td><input id="sr-num" type="text"></td>
							<td><input id="sr-lookup" type="submit"
								url='<c:url value="/SR/edit.form" />'></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="grouped_elements">
			<a href='<c:url value="/SR/list.form" />'>List Service request</a>
			
			</div>


		</div>
	</div>


</body>
</html>