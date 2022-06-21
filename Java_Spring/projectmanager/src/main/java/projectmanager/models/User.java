package projectmanager.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=3,max=30,message="Name must be between 3-30 characters.")
	private String name;
	
//	@NotNull(message="Email Required")
	@NotEmpty(message="Email Required")
	@Email(message="Invalid Email. Example: example@example.com")
	private String email;

	@Size(min=8,max=128,message="Password must be between 8-128 characters")
	private String password;

//	@NotNull(message="Age must be between 18-60")
//	@Min(value=18,message="Age must be between 18-60")
//	@Max(value=60,message="Age must be between 18-60")
//	private Integer age;
	
    @Transient
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirm;	
    @OneToMany(mappedBy="owner", fetch=FetchType.LAZY)
    
    private List<Project> ownedProject;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable
    (
    		name="user_projects",
    		joinColumns=@JoinColumn(name="user_id"),
    		inverseJoinColumns=@JoinColumn(name="project_id")
    		)
    private List<Project> project;
    
//    @OneToMany(mappedBy="taskowner", fetch=FetchType.LAZY)
//    private List<Task> tasks;
    @OneToMany(mappedBy="owner", fetch=FetchType.LAZY)
    private List<Project> projects;
	
	public Long getId() {
		return id;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

//	public List<Task> getTasks() {
//		return tasks;
//	}
//
//	public void setTasks(List<Task> tasks) {
//		this.tasks = tasks;
//	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public User()
	{
		
	}

	public List<Project> getOwnedProject() {
		return ownedProject;
	}

	public void setOwnedProject(List<Project> ownedProject) {
		this.ownedProject = ownedProject;
	}
};