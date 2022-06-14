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
	<h1>Send an Omikuji</h1>
	<form action="/submit" method="POST">
	<div>
	<p>Enter a number between 5-25:</p>
	<input type="number"min="5" max="25" name="number" placeholder="number">
	</div>
	<div>
	<p>Enter the name of any city</p>
	<input type="text" name="city" placeholder="city">
	</div>
	<div>
	<p>Enter the name of any real person</p>
	<input type="text" name ="person" placeholder="person">
	</div>
	<div>
	<p> Enter professional endeavor or hobby</p>
	<input type="text" name ="hobby" placeholder="hobby">
	</div>
	<div>
	<p> Enter any living thing</p>
	<input type="text" name="living_thing" placeholder="living_thing">
	</div>
	<div>
	<p>Say something nice to someone:</p>
	<textarea rows="3" cols="3"name="nice" placeholder="nice"></textarea>
	</div>
	<input type="submit" Value="Create Fortune">
	</form>
	
</body>
</html>