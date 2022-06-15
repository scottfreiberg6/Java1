package safetravels.controllers;

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

import safetravels.models.Expense;
import safetravels.services.ExpenseService;

@Controller
public class RootController {
	@Autowired
	private ExpenseService expenseService;
	@GetMapping("/expense")
	public String index(Model model)
	{
		model.addAttribute("expense",new Expense());
		model.addAttribute("expenses",expenseService.findAll()); 
		return "index";
	}
	@PostMapping("/create")
	public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult res)
	{
		if(res.hasErrors())
		{
			return "index";
		}
		expenseService.Create(expense);
		return "redirect:/expense";
		
	}
	@GetMapping("/show/{id}")
	public String show( @PathVariable("id") Long expenseId, Model model )
	{
		model.addAttribute("expense",expenseService.findOne(expenseId));
		return "show";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id")Long expenseId, Model model)
	{
		model.addAttribute("expense",expenseService.findOne(expenseId));
		return "edit";
	}
	@PostMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute("expense")Expense expense, BindingResult res)
	{
		if(res.hasErrors())
		{
		return "edit";
		}
	expenseService.update(expense);
	return"redirect:/expense";
	}
		
	@PostMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id")Long expenseId, Model model)
	{
		expenseService.deleteOne(expenseId);
		return "redirect:/expense";
	}
};
	
