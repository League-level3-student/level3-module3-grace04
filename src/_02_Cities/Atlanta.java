package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = growthRate*2;
		double og = population*growthRate;
		double tax = og*bonus;
		return tax;
	}

}
