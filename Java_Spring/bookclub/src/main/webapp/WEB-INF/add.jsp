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
	<h1>Hi, I'm a Template</h1>
	<p>${postedBy.id}</p>
		<form:form class="grid" action="/books/create" method="POST" modelAttribute="book">
		
		<form:errors class="col_red" path="title"></form:errors>
		<form:input placeholder="Book Title" path="title"></form:input>
		
		<form:errors class="col_red" path="author"></form:errors>
		<form:input placeholder="Book Author" path="author"></form:input>
		
		<form:errors class="col_red" path="myThoughts"></form:errors>
	<form:textarea placeholder="My Thoughts" path="myThoughts"></form:textarea>
	<form:hidden path="user" value="${postedBy.id}"/>
	<input type="submit" value="Create Book!" />
		
		</form:form>
</body>
</html>
