package financeapp2.models;

public class FilteredExpense {
	
	private String month;
	private Double total;
	private Double income;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	
	public FilteredExpense (String month,double total,double income){
		this.month=month;
		this.total=total;
		this.income=income;
	}

}
