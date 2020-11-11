package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double yearlyIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double yearlyIncome) {
		this.name = name;
		this.yearlyIncome = yearlyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	
	public abstract Double tax();
}
