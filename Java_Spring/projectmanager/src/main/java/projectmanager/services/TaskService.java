package projectmanager.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.models.Task;
import projectmanager.repositories.TaskRepository;

@Service
public class TaskService
{
@Autowired


private TaskRepository taskRepository;
{
	
}
	
public TaskService
(TaskRepository taskRepository)	
{
	this.taskRepository=taskRepository;
}
public void create(Task task)
{
	taskRepository.save(task);
}
public Task findOne(Long task_id)
{
	Optional<Task> task=taskRepository.findById(task_id);
	return task.isPresent()?task.get():null;
}
public ArrayList<Task> findAll()
{
	return (ArrayList<Task>) taskRepository.findAll();
}
public void DeleteById(Long task_id)
{
	taskRepository.deleteById(task_id);
{
	
}


}
}
