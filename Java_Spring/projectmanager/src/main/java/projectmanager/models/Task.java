package projectmanager.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Task {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
//
//@Size(min=1, max=255, message="Description must be filled out")
//private String description;
//
//@DateTimeFormat(pattern="yyyy-MM-dd")
//private Date created_at;
//@DateTimeFormat(pattern="yyyy-MM-dd")
//private Date updated_at;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
//public String getDescription() {
//	return description;
//}
//public void setDescription(String description) {
//	this.description = description;
//}
//public Date getCreated_at() {
//	return created_at;
//}
//public void setCreated_at(Date created_at) {
//	this.created_at = created_at;
//}
//public Date getUpdated_at() {
//	return updated_at;
//}
//public void setUpdated_at(Date updated_at) {
//	this.updated_at = updated_at;
//}
//public User getUser() {
//	return user;
//}
//public void setUser(User user) {
//	this.user = user;
//}
//public Project getProject() {
//	return project;
//}
//public void setProject(Project project) {
//	this.project = project;
//}
//@ManyToOne(fetch=FetchType.LAZY)
//@JoinColumn(name="taskowner_id")
//private User taskowner;
//
//@ManyToOne(fetch=FetchType.LAZY)
//@JoinColumn(name="project_id")
//private Project project;
//
//
//@PrePersist()
//public void OnCreate()
//{
//	created_at=new Date();
//	updated_at=new Date();
//	
//	
//}
//@PreUpdate()
//public void OnUpdate()
//{
//	updated_at=new Date();
//}
public Task()
{
	
}


}
