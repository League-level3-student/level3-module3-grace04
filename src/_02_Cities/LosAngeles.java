package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double bonus = growthRate*0.5;
		double og = population*growthRate;
		double tax = og*bonus;
		return tax;
	}
	
}
