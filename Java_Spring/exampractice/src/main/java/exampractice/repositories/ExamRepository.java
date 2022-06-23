package exampractice.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import exampractice.models.Exam;

public interface ExamRepository extends CrudRepository<Exam,Long> {
ArrayList<Exam> findAll();
}
