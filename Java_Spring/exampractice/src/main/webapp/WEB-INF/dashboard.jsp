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
	<a href="/logout">Logout</a>
	<h1>Welcome, ${user.name} ${user.email}</h1>
	<a href="/books/book">Add Book to my shelf</a>
	<table>
<thead>
<tr>
<th>Id</th>
<th>title</th>
<th>author</th>
<th>Posted By</th>
<th>actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="exam" items="${exam}">
<tr>
<td>${exam.id}
<td> <a href="/books/show/${exam.id}">${exam.title}</a></td>
<td>${exam.author}</td>
<td>${exam.user.name}</td>
<td>
<a href="/books/edit/${exam.id}">Edit</a>
<form class="flex gap2" action="/books/delete/${exam.id}" method="POST">
<input type="submit" value="Delete" />
</form>
</td>
</tr>
</c:forEach>
</tbody>
</table>
	
</body>
</html>