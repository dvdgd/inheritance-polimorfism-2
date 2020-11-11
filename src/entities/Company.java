package entities;

public class Company extends TaxPayer { // pessoa juridica

	private Integer employees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double yearlyIncome, Integer employees) {
		super(name, yearlyIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double tax() {
		if (employees <= 10) {
			return getYearlyIncome() * 0.16;
		} else {
			return getYearlyIncome() * 0.14;
		}
	}
}
