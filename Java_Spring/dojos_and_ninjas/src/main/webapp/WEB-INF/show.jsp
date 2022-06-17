<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<%-- <c:forEach var="ninja" items="${ninja}">
	<p>Ninja firstName: ${ninja.firstName}</p>
	<p>Ninja lastName: ${ninja.lastName}</p>
	<p>Ninja Age: ${ninja.age }</p>
	<p>Dojo: ${ninja.dojo.dojo}</p>
	</c:forEach> --%>
	
	<table>
<thead>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Age</th>
<th>Dojo</th>
</tr>
</thead>
<tbody>
<c:forEach var="ninja" items="${ninja}">
<tr>
<td>${ninja.firstName}</td>
<td>${ninja.lastName}</td>
<td>${ninja.age}</td>
<td>${ninja.dojo.dojo}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>