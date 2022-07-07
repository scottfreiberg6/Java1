package financeapp2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import financeapp2.models.Expense;



public interface ExpenseRepository extends CrudRepository<Expense,Long> {
List<Expense> findAll();

List<Expense> findAllByOrderByDateAsc();
}