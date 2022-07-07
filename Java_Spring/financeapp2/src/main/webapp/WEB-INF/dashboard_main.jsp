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
		<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/1.0.0-alpha.1/axios.min.js" integrity="sha512-xIPqqrfvUAc/Cspuj7Bq0UtHNo/5qkdyngx6Vwt+tmbvTLDszzXM0G6c91LXmGrRx8KEPulT+AfOOez+TeVylg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	
</head>
<body>
            <div class="container">
            <h1 class="teal-text">Dashboard</h1>
              <nav>
                <div class="nav-wrapper teal accent-4">
                  <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="/main">Home</a></li>
                    <li><a href="/dashboard/expense">Expenses</a></li>
                    <li><a href="/dashboard/income">Income</a></li>
                  </ul>
                </div>
              </nav>
              <div>
                 <canvas id="canvas"></canvas>
              </div> 
              <table class="striped teal">
        <thead>
          <tr>
              <th>Month</th>
              <th>Expense</th>
              <th>Income</th>
              <th>Profit</th>
          </tr>
        </thead>
<tbody>
              	<c:forEach var="expense" items="${filteredExpenses}">
              	<tr>
          		<td>${expense.month}</td>
          		<td>${expense.total}</td>
          		<td>${expense.income}</td>
          		<td>${expense.income-expense.total}</td>
          		</tr>
                </c:forEach>
                </tbody>
                </table>
             </div>
               <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.js"></script>
              <script type="text/javascript" src="/js/main2.js"></script>
</body>
</html>
