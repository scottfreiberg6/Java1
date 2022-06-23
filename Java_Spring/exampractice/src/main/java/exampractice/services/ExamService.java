package exampractice.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exampractice.models.Exam;
import exampractice.repositories.ExamRepository;



@Service
public class ExamService {
	@Autowired
	private ExamRepository examRepository;
	
	public void create(Exam exam)
	{
examRepository.save(exam);
}
public Exam findById(Long id)
{
	return examRepository.findById(id).orElse(null);
}
public ArrayList<Exam> findAll()
{
	return examRepository.findAll();
	
}
public void update(Exam exam)
{
	examRepository.save(exam);
}
public void deleteById(Long id)
{
	examRepository.deleteById(id);
}
}

