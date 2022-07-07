package financeapp.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import financeapp.models.Expense;
import financeapp.models.User;
import financeapp.services.ExpenseService;
import financeapp.services.UserService;

@RestController

public class ChartController {
	@Autowired
	private ExpenseService expenseService;
	@Autowired
	private UserService userService;
	@GetMapping("/api/expense")
	public ArrayList<Expense>findall()
	{
		return (ArrayList<Expense>) expenseService.findAll();
	}
	@GetMapping("/api/expense/user")
	public List<Expense> findUserExpenses(HttpSession session){
		User session_user=(User) session.getAttribute("user");
		if(session_user==null) return null;
		return userService.findOne(session_user.getId()).getExpense();
	}
}
