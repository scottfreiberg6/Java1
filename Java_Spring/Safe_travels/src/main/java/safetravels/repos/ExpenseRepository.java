package safetravels.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import safetravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense,Long> 
{
 public ArrayList<Expense> findAll();
 
}