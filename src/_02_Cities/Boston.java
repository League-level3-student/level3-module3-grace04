package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = population*0.5;
		double og = population*growthRate;
		double tax = og + bonus;
		return tax;
	}

}
