package _01_AnimalFarm;

public abstract class Animal {
	protected Boolean fur;
	
	abstract String makeNoise();
	
	public Boolean hasFur() {
		return fur;
	}
}
