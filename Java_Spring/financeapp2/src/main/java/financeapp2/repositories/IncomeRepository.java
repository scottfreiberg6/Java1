package financeapp2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import financeapp2.models.Income;



public interface IncomeRepository extends CrudRepository<Income,Long> {
List<Income> findAll();
List<Income> findAllByOrderByDateAsc();
}