
public class Mammal {
	//superclass
	private int gorillaEnergyLevel = 100;
	private int batEnergyLevel = 300;

	
	public int displayEnergy() {
		System.out.printf("Your current energy is %s \n", this.gorillaEnergyLevel);
		return gorillaEnergyLevel;
	}

	public void addEnergy(int num) {
		this.gorillaEnergyLevel += num;
	}
	
	public void minusEnergy(int num) {
		this.gorillaEnergyLevel -= num;
	}

	public int displayBatEnergy() {
		System.out.printf("Your current energy is %s \n", this.batEnergyLevel);
		return batEnergyLevel;
	}

	public void addBatEnergy(int num) {
		this.batEnergyLevel += num;
	}
	
	public void minusBatEnergy(int num) {
		this.batEnergyLevel -= num;
	}
	
	
}
