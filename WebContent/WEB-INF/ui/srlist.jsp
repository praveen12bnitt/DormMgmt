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

<script type="text/javascript" src='<c:url value="/DataTables-1.9.1/media/js/jquery.js" />'></script>
<link type="text/css" rel="stylesheet" href='<c:url value="/css/reset-min.css" />' />
<link type="text/css" rel="stylesheet" href='<c:url value="/DataTables-1.9.1/extras/TableTools/media/css/TableTools.css" />' />
<link type="text/css" rel="stylesheet" href='<c:url value="/DataTables-1.9.1/media/css/dt_style.css" />' />



<script type="text/javascript"
	src='<c:url value="/DataTables-1.9.1/media/js/jquery.dataTables.js" />'></script>
	
<script type="text/javascript"
	src='<c:url value="/DataTables-1.9.1/extras/TableTools/media/js/TableTools.js" />'></script>
	
<script type="text/javascript"
	src='<c:url value="/DataTables-1.9.1/extras/TableTools/media/js/ZeroClipboard.js" />'></script>
	
<script type="text/javascript">
	$(function() {
		$(document).ready(function() {
		    $('#SR').dataTable({
		    	"sPaginationType": "full_numbers",
		    	"sDom": 'T<"clear">lfrtip',
		        "oTableTools": {
		            "sSwfPath": '<c:url value="/DataTables-1.9.1/extras/TableTools/media/swf/copy_csv_xls_pdf.swf"/>'
		        }
		    });
		} );
	});
</script>
</head>
<body>
<div id="container">
<table id="SR" border="0" cellpadding="0" cellspacing="0" class="pretty">
					<thead>					 
						<tr>
							<th>Created Time</th>
							<th>Room Number</th>
							<th>Category</th>
							<th>Location</th>
							<th>Item</th>
							<th>Assigned Resource</th>
							<th>Remarks</th>
							<th>Dormitory</th>
							<th>Last Updated Time</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="sr" items="${srList}">
				        <tr>
				          <td>${sr.createdDttm}</td>
				          <td>${sr.roomNumber}</td>
				          <td>${sr.category}</td>
				          <td>${sr.location}</td>
				          <td>${sr.item}</td>
				          <td>${sr.assignedResource}</td>
				          <td>${sr.remarks}</td>
				          <td>${sr.dormitory.name}</td>
				          <td>${sr.lastUpdateDttm}</td>
				        </tr>
				      </c:forEach>						
					</tbody>
				</table>
</div>

</body>
</html>