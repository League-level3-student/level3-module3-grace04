package _01_AnimalFarm;
import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		Pig pi = new Pig();
		Cow co = new Cow();
		Chicken chick = new Chicken();
		Sheep sh = new Sheep();
		Cow ow = new Cow();
		Chicken chic = new Chicken();
		ArrayList<Animal> farm = new ArrayList<Animal>(6);
		farm.add(pi);
		farm.add(co);
		farm.add(chick);
		farm.add(sh);
		farm.add(ow);
		farm.add(chic);
		for(int i=0;i<farm.size();i++) {
			System.out.println(i);
			System.out.println(farm.get(i).makeNoise());
			System.out.println(farm.get(i).hasFur());
		}
	}
}
