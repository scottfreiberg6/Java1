package financeapp.models;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.util.StdDateFormat;

@Entity
@Table(name="expense")
public class Expense
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;
	
	@Size(message="character must be at least 1", min = 1)
	private String name;
	
	@Size(message="character must be at least 1", min = 1)
	private String category;
	
	@NotNull(message="Date is required")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	@NotNull(message="Amount is required")
	private Integer amount;
	
//	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	 Date date1 = sdf.parse("2022-01-01");
//	 Date date2=sdf.parse("2022-01-31")
	 


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	

} 

