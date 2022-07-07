package financeapp1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import financeapp1.models.Expense;



public interface ExpenseRepository extends CrudRepository<Expense,Long> {
List<Expense> findAll();

List<Expense> findAllByOrderByDateAsc();
}