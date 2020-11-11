package entities;

public class Individual extends TaxPayer {
	
	private Double healthSpending;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double yearlyIncome, Double healthSpending) {
		super(name, yearlyIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		if (getYearlyIncome() < 20000.00) {
			return getYearlyIncome() * 0.15 - healthSpending * 0.5;
		}
		else {
			return getYearlyIncome() * 0.25 - healthSpending * 0.5;
		}
	}
}
