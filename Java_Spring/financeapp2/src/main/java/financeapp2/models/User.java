package financeapp2.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	@JsonManagedReference
	private List<Expense> expense;

	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	@JsonManagedReference
	private List<Income> income;
	
	@Size(min=3,max=30,message="First Name must be between 3-30 characters.")
	@NotEmpty(message="First Name is required")
	private String firstName;
	@Size(min=3,max=30,message="Last Name must be between 3-30 characters.")
	@NotNull(message="Last Name is Required")
	private String lastName;
	
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
	
	public int getExpensesTotal(){
		int total=0;
		for(int i=0; i<expense.size();i++) {
			total+=expense.get(i).getAmount();
		}
		return total;
		
	}
	public int getIncomesTotal(){
		int total=0;
		for(int i=0; i<income.size();i++) {
			total+=income.get(i).getAmount();
		}
		return total;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public List<Expense> getExpense() {
		return expense;
	}

	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}

	public User()
	{
		
	}

	public List<Income> getIncome() {
		return income;
	}

	public void setIncome(List<Income> income) {
		this.income = income;
	}
	
};