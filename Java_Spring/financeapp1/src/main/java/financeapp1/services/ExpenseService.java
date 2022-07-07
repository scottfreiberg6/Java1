package financeapp1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import financeapp1.models.Expense;
import financeapp1.repositories.ExpenseRepository;



@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public void create(Expense expense)
	{
expenseRepository.save(expense);
}
public Expense findById(Long id)
{
	return expenseRepository.findById(id).orElse(null);
}
public List<Expense> findAll()
{
	return expenseRepository.findAll();
	
}
public void update(Expense expense)
{
	expenseRepository.save(expense);
}
public void deleteById(Long id)
{
	expenseRepository.deleteById(id);
}
public ArrayList<Expense> findByDate(){
	return (ArrayList<Expense>) expenseRepository.findAllByOrderByDateAsc();	
}

}

