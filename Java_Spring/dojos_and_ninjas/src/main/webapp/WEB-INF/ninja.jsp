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
	<h1>I'm a Template</h1>
	<form:form action="/ninja/new" method="POST" modelAttribute="newNinja">
	<form:errors path ="firstName"></form:errors>
	<form:input path="firstName" placeholder="firstName"/>
	<form:errors path ="lastName"></form:errors>
	<form:input path="lastName" placeholder="lastName"/>
	<form:errors path ="lastName"></form:errors>
	<form:errors path ="age"></form:errors>
	<form:input path="age" type="number" placeholder="age"></form:input>
	<form:select path="dojo">
	<c:forEach var="dojo" items="${dojos}">
	<form:option value="${dojo.id}">${dojo.id}-${dojo.dojo}</form:option>
	</c:forEach>
	</form:select>
	<input type="submit" value="Create a Ninja">
	</form:form>
</body>
</html>