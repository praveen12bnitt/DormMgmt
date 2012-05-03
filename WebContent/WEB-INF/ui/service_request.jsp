<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
			<c:if test='${SRForm.mode == "new"}'>
   				 <h1>Create new service request</h1>
			</c:if>
			<c:if test='${SRForm.mode == "edit"}'>
   				 <h1>Edit service request</h1>
			</c:if>			
			<div id="line"></div>
			<form:form id="reservationform" method="post" commandName="SRForm">
				<form:hidden path="mode" />
				<div class="grouped_elements">
					<table>
						<tr>
							<td id="reservation_info_left_td">Service Request
								Information
								<table>
									<c:if test='${SRForm.mode == "edit"}'>
   				 						<tr>
										<td><label for="check_in_date">Service Request
												Number</label></td>
										<td><form:input id="check_in_date" name="check_in_date"
												type="text" size="25" class="enter " value=""
												path="srNumber" disabled="true" /></td>
									</tr>
									</c:if>
									<c:if test='${SRForm.mode == "edit"}'>
									<tr>
										<td><label for="check_in_date">Service Request
												date</label></td>
										<td><form:input id="check_in_date" name="check_in_date"
												type="text" size="25" class="enter " path="date" disabled="true" /></td>
									</tr>
									</c:if>
									<tr>
										<td><label for="room_type">Dorm #</label></td>
										<td>
										<form:select name="sel_dorm" id="sel_dorm" path="dorm">
												  <form:options items="${dorms}" itemValue="code" itemLabel="name"/>
											</form:select></td>
									</tr>

									<tr>
										<td><label for="room_type">Room #</label></td>
										<td>
										<form:input id="room" name="room" type="text"
												maxlength="10" size="10" class="enter" path="room" /></td>
									</tr>
									</table>
							</td>
							</tr>
					</table>
				</div>

				<div class="grouped_elements">
					<table>
						<tr>
							<td>
								<table border="0" style="border-color: orange;" cellpadding="0"
									cellspacing="0" id="Table17">
									<tr>
									<td><span style="color: #000000;">Choose a general
												category</span> <br /> <form:select name="sel_category"
												id="sel_category" path="category">
												<form:option value="">-choose category-</form:option>
												<form:option value='S000000001'>Appliance</form:option>
												<form:option value='S000000003' selected='selected'>Doors and locks</form:option>
												<form:option value='S000000004'>Electrical and lighting</form:option>
												<form:option value='S000000005'>Flooring</form:option>
												<form:option value='S000000006'>General</form:option>
												<form:option value='S000000008'>Heating and cooling</form:option>
												<form:option value='S000000010'>Plumbing and bath</form:option>
												<form:option value='S000000017'>Preventative maintenance</form:option>
												<form:option value='S000000012'>Safety equipment</form:option>
											</form:select></td>
										<td>&nbsp;&nbsp;&nbsp;</td>
										<td><span style="color: #000000;">Choose a
												location</span> <br /> <form:select name="sel_location"
												id="sel_location" path="location">
												<option value="">-choose location-</option>
												<option value='9' selected='selected'>Bathroom</option>
												<option value='10'>Bedroom</option>
												<option value='11'>Exterior</option>
												<option value='12'>Garage</option>
												<option value='13'>Kitchen</option>
												<option value='14'>Living area</option>
												<option value='18'>Master Bathroom</option>
												<option value='17'>Master Bedroom</option>
												<option value='15'>Patio/Balcony</option>
												<option value='19'>Resident Support</option>
												<option value='16'>Storage room</option>
											</form:select></td>


										<td>&nbsp;&nbsp;&nbsp;</td>


										<td><span style="color: #ff0000;">Choose the item</span><br />
											<form:select name="sel_item" id="sel_item" path="item">
												<option value="">-choose item-</option>
												<option value='S000000026'>Exterior door</option>
												<option value='S000000027'>Garage door</option>
												<option value='S000000028'>Garage door opener</option>
												<option value='S000000029'>Interior door</option>
												<option value='S000000030'>Lock</option>
												<option value='S000000031'>Mail door</option>
												<option value='U000000005'>Mailbox Lock</option>
												<option value='S000000117'>Other</option>
												<option value='S000000032'>Patio door</option>
												<option value='S000000034'>Screen/storm door</option>
												<option value='U000000004'>Storage Gate / Door</option>
											</form:select></td>
									</tr>
								</table>
							</td>
						</tr>

					</table>

				</div>

				<div class="grouped_elements">
					<table>
						<tr>
							<td><label for="check_in_date">Assign To</label>&nbsp;&nbsp;
							</td>
							<td><form:select name="sel_item" id="sel_item"
									path="assignedResource">
									<option value="">-choose support resource-</option>
									<option value='S000000026'>Joe</option>
									<option value='S000000027'>Bob</option>
								</form:select><br /></td>
						</tr>
						<tr>
							<td><label for="check_in_date">Remarks</label>&nbsp;&nbsp;</td>
							<td><form:textarea id="booking_notes" name="booking_notes"
									path="remarks"></form:textarea></td>
						</tr>
					</table>
					<br />
				</div>
				<input value="Cancel" type="reset" />
				<input type="submit" id="create-reservation"
					value="Submit Service Request" />
			</form:form>
		</div>
	</div>
</body>
</html>