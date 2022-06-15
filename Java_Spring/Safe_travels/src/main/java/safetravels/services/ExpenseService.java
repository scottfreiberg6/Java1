package safetravels.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import safetravels.models.Expense;
import safetravels.repos.ExpenseRepository;

@Service
public class ExpenseService {
@Autowired
private ExpenseRepository expenseRepository;

public void Create(Expense expense)
{
expenseRepository.save(expense);
}
public void update(Expense expense)
{
	
	expenseRepository.save(expense);
}
public ArrayList<Expense> findAll()
{
return expenseRepository.findAll();
}
public Expense findOne(Long id)

{

Optional<Expense> expense=expenseRepository.findById(id);
return expense.isPresent()?expense.get():null;
}

public void deleteOne(Long id)
{
expenseRepository.deleteById(id);
}
}