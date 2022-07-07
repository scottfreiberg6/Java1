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

import financeapp.models.Income;
import financeapp.models.User;
import financeapp.services.IncomeService;
import financeapp.services.UserService;

@Controller
@RequestMapping("/income")
public class IncomeController {
	@Autowired
	UserService userService;
	@Autowired
	IncomeService incomeService;
	
	@GetMapping("/new")
	public String createIncome (Model model, HttpSession session)

	{
		User user=(User) session.getAttribute("user");
		if(user==null) return "redirect:/";
		model.addAttribute("income", new Income());
		return "income";
	}
	@PostMapping("/create")
	public String insertIncome(@Valid @ModelAttribute("income")Income income, BindingResult res, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
	if(res.hasErrors()) {
		return "income";
	}
	
	incomeService.create(income);
	return"redirect:/dashboard/income";
	}
	
	@GetMapping("/{id}/edit")
	public String edit(@PathVariable("id")Long incomeId, Model model, HttpSession session)
	{
		User user=(User) session.getAttribute("user");
		if(user==null) return "redirect:/";
		Income income=incomeService.findById(incomeId);
		if(user.getId()!=income.getUser().getId()) return "redirect:/home";
		model.addAttribute("income",income);
		return "edit_income";
	}
	@PostMapping("/{id}/edit")
	public String update(@Valid @ModelAttribute("income")Income income, BindingResult res, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		if(res.hasErrors())
		{
		return "edit_income";
		}
	incomeService.update(income);
	return"redirect:/dashboard/income";
	}
	@PostMapping("/delete/{id}")
	public String deleteIncome(@PathVariable("id")Long incomeId, Model model, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		incomeService.deleteById(incomeId);
		return "redirect:/dashboard/income";
	}
}
