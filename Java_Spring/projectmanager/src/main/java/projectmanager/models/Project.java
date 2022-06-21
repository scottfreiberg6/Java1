package projectmanager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Project {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
@Size(min=1, max=255, message="Title must be provided")

private String title;
@Size(min=3, max=255, message="Description must be at least 3 characters")

private String description;
@NotNull(message="Due Date Must beProvided")
@DateTimeFormat(pattern="yyyy-MM-dd")

//@NotEmpty(message="Due Date must be provided")
private Date due_date;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="owner_id")
private User owner;

@ManyToMany(fetch=FetchType.LAZY)
@JoinTable
(
		name="user_projects",
		joinColumns=@JoinColumn(name="project_id"),
		inverseJoinColumns=@JoinColumn(name="user_id")
		)
private List<User> users;
//@OneToMany(mappedBy="project",fetch=FetchType.LAZY)
//private List<Task> tasks;
public User getOwner() {
	return owner;
}

public void setOwner(User owner) {
	this.owner = owner;
}

public List<User> getUsers() {
	return users;
}

public void setUsers(List<User> users) {
	this.users = users;
}

//public List<Task> getTasks() {
//	return tasks;
//}

//public void setTasks(List<Task> tasks) {
//	this.tasks = tasks;
//}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Date getDue_date() {
	return due_date;
}

public void setDue_date(Date due_date) {
	this.due_date = due_date;
}

public Project()
{
	
}
}
