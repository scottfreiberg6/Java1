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
	<a href="/logout">Logout</a>

	<h1>Welcome, I am a template</h1>
	<form action="/projects" method="POST" modelAttribute="project">
	<h1>Create a Project</h1>
	<form:errors class="col_red" path="title"></form:errors>
	<form:input path="title" placeholder="title"/>
		<form:errors class="col_red" path="description"></form:errors>
	<form:textarea path="description" placeholder="description"/>
	<form:errors class="col_red" path="due_date"></form:errors>
	<form:input type="date" path="due_date"></form:input>
	
	<input type="submite" value="Submit Project">
	</form>
</body>
</html>