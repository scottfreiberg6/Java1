<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        <%@ page isErrorPage="true" %>
          <!DOCTYPE html>
          <html>

          <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title></title>
            <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
            <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            <link rel="stylesheet" type="text/css" href="/css/style.css">
            <script type="text/javascript" src="/js/main.js"></script>
          </head>

          <body>
            <div class="container">
            <h1 class="teal-text">Create Income</h1>
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
              	<form:form class="col s12" action="/income/create" method="POST" modelAttribute="income">
              	<div class="row">
              	<div class="input-field col s6">
					<form:errors path="name" class="red-text"></form:errors>
					<form:input path="name" placeholder="Name"></form:input>
					</div>
				
					<div>
					<div class="input-field col s6">
					<form:errors path="amount" class="red-text"></form:errors>
					<form:input path="amount" type="number" placeholder="Amount" ></form:input>
				</div>
				</div>
				</div>
					<div class="row">
					<div class="input-field col s6">
					<form:errors path="date" class="red-text"></form:errors>
					<form:input path="date" type ="date" placeholder="date"></form:input>
					</div>
					<div class="input-field col s6">
					<form:errors path="source" class="red-text"></form:errors>
					<form:input path="source" placeholder="source"></form:input>
					<form:hidden path="user" value="${user.id}"/>
              		</div>
              		</div>
              		 <input type="submit" class="btn waves-effect waves-light teal accent-4">
              	</form:form>
              	</div>
          </body>

          </html>