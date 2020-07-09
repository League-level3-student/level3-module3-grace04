package _01_AnimalFarm;

public class Chicken extends Animal {
	@Override
	public String makeNoise() {
		return "Cluck";
	}
	
	@Override
	public Boolean hasFur() {
		return false;
	}
}
