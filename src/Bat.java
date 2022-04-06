import java.util.ArrayList;


public class Bat extends Mammal {

	public ArrayList<Bat> bat = new ArrayList<Bat>();
	
	public void fly() {
		super.minusEnergy(50);
		System.out.println("the bat took off");
	}
	
	public void eatHumans() {
		super.addEnergy(25);
		System.out.println("I ate a human!");
	}
	
	public void attackTown() {
		super.minusEnergy(100);
		System.out.println("the bat BURNED THE TOWN. HIDE YO KIDS");
	}
}
