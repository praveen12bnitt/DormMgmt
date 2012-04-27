<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SRM Group Dorm management system</title>
<link type="text/css" rel="stylesheet" href='<c:url value="/css/reset-min.css" />' />
<link rel="stylesheet" type="text/css" href='<c:url value="/css/style.css" />' />
<script type="text/javascript" src='<c:url value="/js/jquery-1.5.1.min.js" />'></script>
<script type="text/javascript" src='<c:url value="/js/home.1334201885.js" />'></script>
</head>

<%

String msg = "";
String type = request.getParameter("type");
if(type != null && type.equals("fail")) {
	msg = "<div style=\"color: red;\">Failed to authenticate. Username/Password combination is not correct</div>";
} else if(type != null && type.equals("logout")) {
	msg = "<div style=\"color: green;\">Successfully logged out of the system</div>";
}
%>
<body>

	<div id="menu">
		<div class="max-width container">
			<a id="logo" href="http://www.srm-group.com">SRM</a>
			<div id="signup_links"></div>
			<div id="primary_nav"></div>
		</div>
		<div>
			<div id="container_top"></div>
			<div id="content_container">

				<div id="content">
					<div id="login-form">
						<div class="max-width">
							<div class="container">
								<h1>Log in to Dorm</h1>
								<h3>
									Dorm works best with the latest version of <a
										href="http://www.mozilla.org/firefox">Firefox</a> or <a
										href="http://www.google.com/chrome">Chrome.</a>
								</h3>
								<div id="line"></div>

								<div style="color: red;"></div>
								<form action="<c:url value='/j_spring_security_check' />" method="post" accept-charset="utf-8">

									<label for="login">Username</label>
									<div>
										<input type="text" name="j_username" value="" id="login"
											maxlength="80" size="30" />
									</div>
									<div style="color: red;"></div>

									<br /> <label for="password">Password</label>
									<div>
										<input type="password" name="j_password" value="" id="password"
											size="30" />
									</div>
									<%= msg %>

									<table>


									</table>
									<br /> <input type="submit" name="submit" value="Log In" />

								</form>

							</div>
						</div>
					</div>
				</div>

			</div>
			<div id="policy-links">
				<p>
					<a id="footer-terms" href="#">Terms of Service</a> | <a
						id="footer-privacy" href="#">Privacy Policy</a>
				</p>
				<p>Copyright 2012 (c) SRM Group Inc. All Rights Reserved.</p>
			</div>
		</div>
	</div>
</body>
</html>