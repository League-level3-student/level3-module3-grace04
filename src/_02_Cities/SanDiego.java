package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = 1000000;
		double og = population*growthRate;
		double tax = og + bonus;
		return tax;
	}
}
