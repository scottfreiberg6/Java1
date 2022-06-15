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

<table>
<thead>
<tr>
<th>Title</th>
<th>Vendor</th>
<th>amount</th>
<th>description</th>
</tr>
</thead>
<tbody>
<c:forEach var="expense" items="${expenses}">
<tr>
<td> <a href="/show/${expense.id}">${expense.title}</a></td>
<td>${expense.vendor}</td>
<td>${expense.amount}</td>
<td>${expense.description}</td>
<td>
<a href="/edit/${expense.id}">Edit</a>
<form class="flex gap2" action="/delete/${expense.id}" method="POST">
<input type="submit" value="Delete" />
</form>
</td>
</tr>
</c:forEach>
</tbody>
</table>
	<form:form class="grid" action="/create" method="POST" modelAttribute="expense">
	
	<form:input placeholder="Expense" path="title"></form:input>
	<form:errors class="col_red" path="title"></form:errors>
	
	<form:errors class="col_red" path="vendor"></form:errors>
	<form:input placeholder="Vendor" path="vendor"></form:input>
	
	<form:errors class="col_red" path="amount"></form:errors>
	<form:input placeholder="Amount" path="amount"></form:input>
	
	<form:errors class="col_red" path="description"></form:errors>
	<form:textarea placeholder="description" path="description"></form:textarea>
	
	<input type="submit" value="Create Expense!" />
	</form:form>
</body>
</html>