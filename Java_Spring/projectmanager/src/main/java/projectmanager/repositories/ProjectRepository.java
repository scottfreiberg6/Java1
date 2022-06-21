package projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projectmanager.models.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

}
