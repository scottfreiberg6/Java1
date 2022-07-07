package financeapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import financeapp.models.Expense;
import financeapp.models.Income;
import financeapp.repositories.IncomeRepository;

@Service
public class IncomeService {
	@Autowired
	private IncomeRepository incomeRepository;
	
	public void create(Income income)
	{
incomeRepository.save(income);
}
public Income findById(Long id)
{
	return incomeRepository.findById(id).orElse(null);
}
public List<Income> findAll()
{
	return incomeRepository.findAll();
	
}
public void update(Income income)
{
	incomeRepository.save(income);
}
public void deleteById(Long id)
{
	incomeRepository.deleteById(id);
}
public ArrayList<Income> findByDate(){
	return (ArrayList<Income>) incomeRepository.findAllByOrderByDateAsc();	
}
}