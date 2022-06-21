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
	<a href="/books/book">Add Book to MyShelf</a>
	<h1>Welcome, ${user.name} ${user.email}</h1>
	<h2>Hi, I'm a Template</h2>
	
	
	
	<table>
<thead>
<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Posted By</th>
<th>Actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="book" items="${book}">
<tr>
<td>${book.id}</td>
<td> <a href="/books/show/${book.id}">${book.title}</a></td>
<td>${book.author}</td>
<td>${book.user.name}</td>
<td>
<a href="/books/edit/${book.id}">Edit</a>
<form class="flex gap2" action="/books/delete/${book.id}" method="POST">
<input type="submit" value="Delete" />
</form>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
