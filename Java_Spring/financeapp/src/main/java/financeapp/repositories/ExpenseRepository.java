package financeapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import financeapp.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense,Long> {
List<Expense> findAll();

List<Expense> findAllByOrderByDateAsc();
}