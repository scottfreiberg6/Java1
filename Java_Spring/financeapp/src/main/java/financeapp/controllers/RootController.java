package financeapp.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import financeapp.models.Expense;
import financeapp.models.FilteredExpense;
import financeapp.models.Income;
import financeapp.models.TempUser;
import financeapp.models.User;
import financeapp.services.ExpenseService;
import financeapp.services.IncomeService;
import financeapp.services.UserService;

@Controller
public class RootController
{
	@Autowired
	private UserService userService;
	@Autowired
	private ExpenseService expenseService;
	@Autowired
	private IncomeService incomeService;

	
	@GetMapping("")
	public String login_register( Model model )
	{
		model.addAttribute("userRegister",new User());
		model.addAttribute("userLogin",new TempUser());
		return "login_register";
	}
	
	@PostMapping("/register")
	public String register
	(
		@Valid @ModelAttribute("userRegister") User form_user,
		BindingResult res,
		Model model
	)
	{
		if(res.hasErrors())
		{
			model.addAttribute("userLogin",new TempUser());
			return "login_register";
		}
		User db_user=userService.register(form_user,res);
		if(db_user==null)
		{
			model.addAttribute("userLogin",new TempUser());	
			return "login_register";
		}
		
		return "redirect:/";
	}
	
	
	@GetMapping("/dashboard/expense")
	public String dashboard(HttpSession session,Model model)
	{
		User user=(User) session.getAttribute("user");
		
				
		if(user==null) return "redirect:/";
		Long Id=user.getId();
		user=userService.findOne(Id);
		model.addAttribute("user",user);
		
		return "dashboard_expense";
	}
	@GetMapping("/dashboard/income")
	public String dashboard1(HttpSession session,Model model)
	{
		User user=(User) session.getAttribute("user");
		
				
		if(user==null) return "redirect:/";
		Long Id=user.getId();
		user=userService.findOne(Id);
		model.addAttribute("user",user);
		return "dashboard_income";
	}
	@SuppressWarnings("deprecation")
	public double sumMonth (int month, ArrayList<Expense> expenses ) {
		double sum=0;
				for(Expense e:expenses) {
					if(e.getDate().getMonth()==month)
						sum+=e.getAmount();
						
				}
		return sum;
	}
	@SuppressWarnings("deprecation")
	public double sumIncomes (int month, ArrayList<Income> incomes) {
		double sum=0;
				for(Income e:incomes) {
					if(e.getDate().getMonth()==month)
						sum+=e.getAmount();
						
				}
		return sum;
	}
	
	
	@GetMapping("/main")
	public String dashboard2(HttpSession session,Model model)
	{
		User user=(User) session.getAttribute("user");
		
				
		if(user==null) return "redirect:/";
		Long Id=user.getId();
		user=userService.findOne(Id);
		model.addAttribute("user",user);
//		model.addAttribute("expenses", expenseService.findByDate());
		model.addAttribute("incomes", incomeService.findByDate());
		ArrayList<Expense>expenses=(ArrayList<Expense>) expenseService.findAll();
		ArrayList<Income>incomes=(ArrayList<Income>) incomeService.findAll();
		ArrayList<FilteredExpense>filtered=new ArrayList<FilteredExpense>();
		String month[]={"January", "Feburary", "March", "April", "May","June", "July","August","September","October","November","December"};			
		for(int i=0;i<12;i++) {
			double sum=sumMonth(i,expenses);
			double sum1=sumIncomes(i,incomes);
			filtered.add(new FilteredExpense(month[i],sum,sum1));
		}
		model.addAttribute("filteredExpenses", filtered);
		return "dashboard_main";
	}
	
	@PostMapping("/login")
	public String login
	(
		@Valid @ModelAttribute("userLogin") TempUser tempUser,
		BindingResult res,
		Model model,
		HttpSession session
	)
	{
		if(res.hasErrors())
		{
			model.addAttribute("userRegister",new User());
			return "login_register";
		}
		User db_user=userService.login(tempUser,res);
		if(db_user==null)
		{
			model.addAttribute("userRegister",new User());
			return "login_register";
		}
		if(res.hasErrors())
		{
			model.addAttribute("userRegister",new User());
			return "login_register";
		}
		session.setAttribute("user",db_user);
		return "redirect:/main";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		userService.logout(session);
		return "redirect:/";
	}
};