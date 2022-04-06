import java.util.ArrayList;

public class Gorilla extends Mammal {
	//subclass
	private ArrayList<Gorilla> gorilla = new ArrayList<Gorilla>();
	
	public void throwSomething() {
		super.minusEnergy(5);
		System.out.println("the gorilla threw something and lost 5 energy");
	}
	
	public void eatBananas() {
		super.addEnergy(10);
		System.out.println("the gorilla ate a bannana to got 10 energy back");
	}
	
	public void climb() {
		super.minusEnergy(10);
		System.out.println("the gorilla climbed a tree and lost 10 energy...that looks high...");
	}

	
}
