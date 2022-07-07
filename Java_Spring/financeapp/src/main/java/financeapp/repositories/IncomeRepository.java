package financeapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import financeapp.models.Expense;
import financeapp.models.Income;

public interface IncomeRepository extends CrudRepository<Income,Long> {
List<Income> findAll();
List<Income> findAllByOrderByDateAsc();
}