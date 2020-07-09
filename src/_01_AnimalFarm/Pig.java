package _01_AnimalFarm;

public class Pig extends Animal {
	@Override
	public String makeNoise() {
		return "Oink";
	}
	
	@Override
	public Boolean hasFur() {
		return true;
	}
}
