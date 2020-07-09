package _01_AnimalFarm;

public class Sheep extends Animal {
	@Override
	public String makeNoise() {
		return "Baaa";
	}
	
	@Override
	public Boolean hasFur() {
		return true;
	}
}
