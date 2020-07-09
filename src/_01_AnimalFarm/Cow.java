package _01_AnimalFarm;

public class Cow extends Animal {
	@Override
	public String makeNoise() {
		return "Moo";
	}
	
	@Override
	public Boolean hasFur() {
		return true;
	}
}
