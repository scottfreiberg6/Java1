package financeapp1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import financeapp1.models.Income;



public interface IncomeRepository extends CrudRepository<Income,Long> {
List<Income> findAll();
List<Income> findAllByOrderByDateAsc();
}