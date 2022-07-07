package financeapp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import financeapp.models.Expense;
import financeapp.models.FilteredExpense;
import financeapp.models.Income;
import financeapp.models.User;
import financeapp.services.ExpenseService;
import financeapp.services.IncomeService;
import financeapp.services.UserService;

@RestController
public class BarChartController {
	@Autowired
	private UserService userService;
	@Autowired
	private ExpenseService expenseService;
	@Autowired
	private IncomeService incomeService;
	
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
	
	@GetMapping("/api/barexpense")
	public ArrayList<FilteredExpense> filteredChartExpense()
	{
	
		
		ArrayList<Expense>expenses=(ArrayList<Expense>) expenseService.findAll();
		ArrayList<Income>incomes=(ArrayList<Income>) incomeService.findAll();
		ArrayList<FilteredExpense>filtered=new ArrayList<FilteredExpense>();
		String month[]={"January", "Feburary", "March", "April", "May","June", "July","August","September","October","November","December"};			
		for(int i=1;i<=12;i++) {
			double sum=sumMonth(i,expenses);
			double sum1=sumIncomes(i,incomes);
			filtered.add(new FilteredExpense(month[i-1],sum,sum1));
		}
		
			return filtered;
	}





}

