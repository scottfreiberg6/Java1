package projectmanager.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectmanager.models.Project;
import projectmanager.repositories.ProjectRepository;

@Service
public class ProjectService
{
@Autowired


private ProjectRepository projectRepository;
{
	
}
	
public ProjectService
(ProjectRepository projectRepository)	
{
	this.projectRepository=projectRepository;
}
public void create(Project project)
{
	projectRepository.save(project);
}
public Project findOne(Long project_id)
{
	Optional<Project> project=projectRepository.findById(project_id);
	return project.isPresent()?project.get():null;
}
public ArrayList<Project> findAll()
{
	return (ArrayList<Project>) projectRepository.findAll();
}
public void DeleteById(Long project_id)
{
	projectRepository.deleteById(project_id);
{
	
}


}
public void setOwner() {
	// TODO Auto-generated method stub
	
}
}

