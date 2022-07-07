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
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
	<div class="container">
<nav>
    <div class="nav-wrapper teal accent-4">
      <a href="#" class="brand-logo">Logo</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
      </ul>
    </div>
  </nav>
	<h1>Register</h1>
	<div class="row">
    <form:form class="col s12" action="/register" method="POST" modelAttribute="userRegister">
      <div class="row">
        <div class="input-field col s6">
        <form:errors path="firstName" class="red-text"></form:errors>
          <form:input placeholder="Firstname" path="firstName"></form:input>
          <label for="first_name">First Name</label>
        </div>
        <div class="input-field col s6">
          <form:errors path="lastName" class="red-text"></form:errors>
          <form:input id="last_name" type="text" path="lastName"></form:input>
          <label for="last_name">Last Name</label>
        </div>
      </div>
       <div class="row">
        <div class="input-field col s12">
        <form:errors path="email" class="red-text"></form:errors>
          <form:input id="email" path="email" type="email"></form:input>
          <label for="email">Email</label>
        </div>
      <div class="row">
        <div class="input-field col s12">
        <form:errors  path="password" class="red-text"></form:errors>
          <form:input type="password" placeholder="Password" path="password"></form:input>	
          <label for="password">Password</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
        <form:errors  path="confirm" class="red-text"></form:errors>
          <form:input id="Confirm password" path="confirm" type="password"></form:input>
          <label for=" Confirm password">Confirm Password</label>
        </div>
      </div>
      </div>
      <input type="Submit" class="btn waves-effect waves-light teal accent-4 mb5">
    </form:form>
    <form:form action="/login" method="POST" modelAttribute="userLogin">
    <h1>Login</h1>
    <div class="row">
        <div class="input-field col s12">
          <form:errors path="email" class="red-text"></form:errors>
          <form:input id="email" type="email" placeholder="email" path="email"></form:input>
          <label for="email">Email</label>
        </div>
        <div class="row">
        <div class="input-field col s12">
        <form:errors path="password" class="red-text"></form:errors>
          <form:input id="password" type="password" placeholder="password" path="password"></form:input>
        </div>
      </div>
      <input type="Submit" class="btn waves-effect waves-light">
      </div>
    </form:form>
  </div>
	</div>
</body>
</html>
