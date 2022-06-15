package safetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Expense {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull(message="title is required")
@Size(min=1,max=255,message="Expense must be between 8-255 Characters")
private String title;

@NotNull(message="vendor is required")
@Size(min=1,max=255,message="Vendor must be between 8-255 Characters")
private String vendor;

@NotNull(message="smount is required")
@Min(value=1, message="Must be at least 1 character long")
private Double amount;

@NotNull(message="description is required")
@Size(min=1,max=255,message="Description must be between 8-255 Characters")
private String description;

public Expense() {
	
}

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

public String getVendor() {
	return vendor;
}

public void setVendor(String vendor) {
	this.vendor = vendor;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}


};

