
public class Mammal {
	//superclass
	private int energyLevel = 100;

	
	public int displayEnergy() {
		System.out.printf("Your current energy is %s \n", this.energyLevel);
		return energyLevel;
	}

	public void addEnergy(int num) {
		this.energyLevel += num;
	}
	
	public void minusEnergy(int num) {
		this.energyLevel -= num;
	}
	
}
