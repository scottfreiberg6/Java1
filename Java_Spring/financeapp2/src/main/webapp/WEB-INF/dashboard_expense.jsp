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
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
<div class="container">
<h1 class="teal-text">Expenses</h1>
   <nav>
                <div class="nav-wrapper teal accent-4">
                  <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="/main">Home</a></li>
                    <li><a href="/dashboard/expense">Expenses</a></li>
                    <li><a href="/dashboard/income">Income</a></li>
                  </ul>
                </div>
              </nav>
  <div class="chart-container" style="height:300px; width:300px">
                 <canvas id="canvas"></canvas>
              </div> 
<a href="/expense/new" class="waves-effect waves-light btn"><i class="material-icons left">Create a Expense</i></a>
<a href="/logout" class="waves-effect waves-light btn"><i class="material-icons left">Logout</i></a>
<table class="striped teal">
        <thead>
          <tr>
              <th>Expense Date</th>
              <th>Expense Name</th>
              <th>Expense Price</th>
              <th>Category</th>
              <th>Actions</th>
          </tr>
        </thead>
<tbody>
<c:forEach var="expense" items="${user.expense}"> 
<tr>
<td>${expense.date}</td>
<td>${expense.name}</td>
<td>${expense.amount}</td>
<td>${expense.category}
<td>
<a href="/expense/${expense.id}/edit">Edit</a>
<form class="flex gap2" action="/expense/delete/${expense.id}" method="POST">
<input type="submit" value="Delete" />
</form>
</td>
</tr>
</c:forEach>
               <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.js"></script>
              <script type="text/javascript" src="/js/main.js"></script>
      </tbody>
      </table>
</body>
</html>