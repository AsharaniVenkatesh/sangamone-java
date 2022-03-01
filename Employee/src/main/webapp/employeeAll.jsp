<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<table border="1">

<tr>
<th>Id</th>
<th>Name</th>
<th>Place</th>
<th>Date</th>

</tr>

<c:forEach var="employee" items="${employee }">

<tr>
<td>${employee.id}</td>
<td>${employee.name}<td>
<td>${employee.place}</td>
<td>${employee.date}</td>

</tr>

</c:forEach>

</table>
</body>
</html>