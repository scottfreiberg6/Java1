package financeapp.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import financeapp.models.Income;
import financeapp.models.User;
import financeapp.services.IncomeService;
@RestController
public class ChartIncomeController {
	@Autowired
	private IncomeService incomeService;
	@GetMapping("/api/income")
	public ArrayList<Income>findall()
	{
		return (ArrayList<Income>) incomeService.findAll();
	}
	@GetMapping("/api/income/user")
	public List<Income> findUserIncomes(HttpSession session){
		User user=(User) session.getAttribute("user");
		return (List<Income>) user.getIncome();
	}
}
