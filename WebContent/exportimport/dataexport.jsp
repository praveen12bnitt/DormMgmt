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

<body>
	<div id="menu">		
		<div class="max-width container">
			<a id="main-logo" href="http://www.srm-group.com">DORM</a>
			<div id="menu-nav" class="container">		
				<ul>
								<li>
						<a href="reservation.htm">Reservation</a>
					</li>
					<li>
						<a  href="housekeeping.html">House Keeping</a>
					</li>
					<li>
						<a  href="service_request.html">Service Request</a>
					</li>			
					<li>
						<a  href="#">Reports</a>
					</li>
										
				</ul>
			</div>
		</div>
		
	</div>
	<br>
	<br>
	<div class="max-width">
		<div class="container">
			<h3>Data Export</h3>
			<div id="line">
			</div>			
	<div style="color: red;"></div>	
	<form id="reservationform" method="post" action="#" autocomplete="off">
		<div class="grouped_elements">
			<table>
				<tr>
					<td id="reservation_info_left_td">
						<table>
							<tr>
								<td width="135px">
									
									<!-- used to pass selling date to booking_form.js -->
									<input id="selling_date" type="hidden" value="2012-04-12" /> 
									
									<label for="check_in_date">Check-in date</label>
																								</td>
								<td>
									<input id="check_in_date" name="check_in_date" type="text" maxlength="10" size="10" autocomplete="off"
											class="enter "
																						value="" />
								</td>
							</tr>
							<tr>
								<td>
									<label for="check_out_date">Check-out date</label>
								</td>
								<td>
									<input id="check_out_date" name="check_out_date" type="text" maxlength="10" size="10" autocomplete="off"
											class="enter"
											value=""	/>
								</td>
							</tr>
							<tr>
								<td>
									<label for="room_type">Dorm #</label>
								</td>
								<td >
									<select

									name="sel_dorm"

									id="sel_dorm"

									onchange="javascript:f_itemchanged();"

									>
									<option value="" >-choose dorm #-</option>
									<option value='B185' >Building 185</option>
									<option value='B186' >Building 186</option>
									<option value='B187' >Building 187</option>
									<option value='B71' >Building 71</option>
									<option value='B95' >Building 95</option>
									<option value='B196' >Building 196</option>
									<option value='B270' >Building 270</option>
									<option value='B275' >Building 275</option>
									<option value='B277' >Building 277</option>
									</select>
								</td>
							</tr>
							<tr>
								<td width="150px">
									<label for="room_type">Room #</label>
								</td>
								<td>
									<input id="room" name="room" type="text" maxlength="10" size="10" autocomplete="off"
											class="enter"
											value=""	/>
								</td>
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
						<table>
							<tr>
								<td width="150px">
									<span id="customer_name_label">First Name</span>							
								</td>
								<td width="350px">
									<input id="fname" name="fname" type="text" maxlength="20" size="20" autocomplete="off"
											class="enter"
											value=""	/>
								</td>
							</tr>
							<tr>
								<td width="150px">
									<span id="customer_name_label">Last Name</span>							
								</td>
								<td width="350px">
									<input id="lname" name="lname" type="text" maxlength="20" size="20" autocomplete="off"
											class="enter"
											value=""	/>
								</td>
							</tr>
							<tr>
								<td width="150px">
									Agency Details								</td>
								<td width="350px">
									<input id="email" name="email" type="text" maxlength="20" size="20" autocomplete="off"
											class="enter"
											value=""	/>
								</td>
							</tr>
							<tr>
								<td>Email								</td>
								<td>
									<input id="email" name="email" type="text" maxlength="20" size="20" autocomplete="off"
											class="enter"
											value=""	/>									
								</td>
							</tr>
							<tr>
								<td>									
									Phone number								</td>
								<td>
									<input id="phone" name="phone" type="text" maxlength="20" size="20" autocomplete="off"
											class="enter"
											value=""	/>
								</td>
							</tr>
							<tr>
								<td>									
									Address								</td>
								<td>
									<input id="address" name="address" type="text" maxlength="30" size="30" autocomplete="off"
											class="enter"
											value=""	/>									
								</td>
							</tr>
							<tr>
								<td>									
									City								</td>
								<td>
									<input id="city" name="city" type="text" maxlength="30" size="30" autocomplete="off"
											class="enter"
											value=""	/>									
								</td>
							</tr>
							
							
							<tr>
								<td>									
									Postal Code								</td>
								<td>
									<input id="zip" name="zip" type="text" maxlength="5" size="5" autocomplete="off"
											class="enter"
											value=""	/>									
								</td>
							</tr>							
						</table>
					</td>
				</tr>
			</table>
		
		</div>
	
		
		<div class="grouped_elements">
			<span id="booking_notes_label">
				Other information				
			</span>
			<textarea id="booking_notes" name="booking_notes" autocomplete="off"></textarea>
			
		</div>
		
			<input type="submit" value="Cancel">	
			<input type="submit" id="create-reservation"  value="Create Reservation">
			
		
	
		
</div>			
				
			
			</div>
		</div>		
	</form>	
</body>