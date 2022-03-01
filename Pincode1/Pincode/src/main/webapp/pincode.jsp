<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
th,td{
padding:15px;
text-align:left;
}
tr:hover{
background-color:blue;
}
</style>
</head>
<body>
<h1>List of Pincodes</h1>

<table border="1px">
<tr>
<th>S.No</th>
<th>Circle Name</th>
<th>Region Name</th>
<th>Division Name</th>
<th>Office Name</th>
<th>Pincode</th>
<th>Office Type</th>
<th>Delivery</th>
<th>District</th>
<th>State Name</th>
</tr>
<c:forEach var="allpincodes" items="${allpincodes }">
<tr>
<td>${allpincodes.id}</td>
<td>${allpincodes.circlename}</td>
<td>${allpincodes.regionname}</td>
<td>${allpincodes.divisionname}</td>
<td>${allpincodes.officename}</td>
<td>${allpincodes.pincode}</td>
<td>${allpincodes.officetype}</td>
<td>${allpincodes.delivery}</td>
<td>${allpincodes.district}</td>
<td>${allpincodes.statename}</td>

</tr>
</c:forEach>
</table>

</body>
</html>