package financeapp.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import financeapp.models.Expense;
import financeapp.models.User;
import financeapp.services.ExpenseService;
import financeapp.services.UserService;


@Controller
@RequestMapping("/expense")
public class ExpenseController {
	@Autowired
	UserService userService;
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/new")
	public String createExpense (Model model, HttpSession session)

	{
		User user=(User) session.getAttribute("user");
		if(user==null) return "redirect:/";
		model.addAttribute("expense", new Expense());
		return "expense";
	}
	@PostMapping("/create")
	public String insertExpense(@Valid @ModelAttribute("expense")Expense expense, BindingResult res, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
	if(res.hasErrors()) {
		return "expense";
	}
	
	expenseService.create(expense);
	return"redirect:/dashboard/expense";
	}
	@GetMapping("/{id}/edit")
	public String edit(@PathVariable("id")Long expenseId, Model model, HttpSession session)
	{
		User user=(User) session.getAttribute("user");
		if(user==null) return "redirect:/";
		Expense expense=expenseService.findById(expenseId);
		if(user.getId()!=expense.getUser().getId()) return "redirect:/dashboard/expense";
		model.addAttribute("expense",expense);
		return "edit_expense";
	}
	@PostMapping("/{id}/edit")
	public String update(@Valid @ModelAttribute("expense")Expense expense, BindingResult res, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		if(res.hasErrors())
		{
		return "edit_expense";
		}
	expenseService.update(expense);
	return"redirect:/dashboard/expense";
	}
	@PostMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id")Long expenseId, Model model, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		expenseService.deleteById(expenseId);
		return "redirect:/dashboard/expense";
	}
}
