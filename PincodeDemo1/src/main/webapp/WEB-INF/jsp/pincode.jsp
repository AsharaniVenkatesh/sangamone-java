<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pincodes</title>
<style>
table{
background-color:white;
}
th{
background-color:sykblue;
}

tr:nth-child(even){
background-color:gray;

}
</style>
</head>
<body>
<h2>List of Pincodes</h2>
<table border="1">
<tr>
<th>S.NO</th>
<th>Circlename</th>
<th>RegionName</th>
<th>DivisionName</th>
<th>OfficeName</th>
<th>Pincode</th>
<th>OfficeType</th>
<th>Delivery</th>
<th>District</th>
<th>StateName</th>
</tr>

<c:forEach var="pincodes" items="${pincode}">
<tr>
<td>${pincodes.id}</td>
<td>${pincodes.circlename}</td>
<td>${pincodes.regionname}</td>
<td>${pincodes.divisionname}</td>
<td>${pincodes.officename}</td>
<td>${pincodes.pincode}</td>
<td>${pincodes.officetype}</td>
<td>${pincodes.delivery}</td>
<td>${pincodes.district}</td>
<td>${pincodes.statename}</td>
</tr>
</c:forEach>
</table>
</body>
</html>