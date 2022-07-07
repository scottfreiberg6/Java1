package financeapp1.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import financeapp1.models.Income;
import financeapp1.models.User;
import financeapp1.services.IncomeService;
import financeapp1.services.UserService;


@RestController
public class ChartIncomeController {
	@Autowired
	private IncomeService incomeService;
	@Autowired
	private UserService userService;
	@GetMapping("/api/income")
	public ArrayList<Income>findall()
	{
		return (ArrayList<Income>) incomeService.findAll();
	}
	@GetMapping("/api/income/user")
	public List<Income> findUserIncome(HttpSession session){
		User session_user=(User) session.getAttribute("user");
		if(session_user==null) return null;
		return userService.findOne(session_user.getId()).getIncome();
	}
}
