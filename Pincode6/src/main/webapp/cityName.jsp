<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pincode</title>
</head>
<body>
<h3>Pincode Of Your City</h3>

<table border="1">

<tr>
<th>S.no</th>
<th>CircleName</th>
<th>RegionName</th>
<th>DivisionName</th>
<th>OfficeName</th>
<th>Pincode</th>
<th>OfficeType</th>
<th>Delivery</th>
<th>District</th>
<th>StateName</th>

</tr>

<c:forEach var="pincode" items="${pincode}">
<tr>
<td>${pincode.id}</td>
<td>${pincode.circleName}</td>
<td>${pincode.regionName}</td>
<td>${pincode.divisionName}</td>
<td>${pincode.officeName}</td>
<td>${pincode.pincode}</td>
<td>${pincode.officeType}</td>
<td>${pincode.delivery}</td>
<td>${pincode.district}</td>
<td>${pincode.stateName}</td>

</tr>
</c:forEach>
</table>

</body>
</html>