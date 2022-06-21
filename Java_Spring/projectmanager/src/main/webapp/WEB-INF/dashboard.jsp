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

	<h1>Welcome, ${user.name} ${user.email}</h1>
	<h1>Hi, I'm a template</h1>
		<table>
<thead>
<tr>
<th>Project</th>
<th>Lead</th>
<th>DueDate</th>
</tr>
</thead>
<tbody>
<c:forEach var="project" items="${project}">
<tr>
<td> <a href="/books/show/${project.id}">${project.title}</a></td>
<td>${project.title}</td>
<td>${user.name}</td>
<td>${project.due_date}</td>
<td>
<a href="/project/edit/${project.id}">Edit</a>
<form class="flex gap2" action="/project/delete/${project.id}" method="POST">
<input type="submit" value="Delete" />
</form>
</td>
</tr>
</c:forEach>
	
</body>
</html>