package pwir_l_05_06d.model;

import java.util.Random;

public class FuelContainer {
	private int actualFuelLevel = 0;
	private int maxFuelLevel = 0;
	
	public FuelContainer() {
		setMaxFuelLevel();
		setActualFuelLevel();
	}
		
	public void setMaxFuelLevel() {
		Random random = new Random();
		this.maxFuelLevel = random.nextInt( 250 ) + 50;
	}
	public void setActualFuelLevel() {
		Random random = new Random();		
		this.actualFuelLevel = random.nextInt( getMaxFuelLevel() - 20 ) + 20;
	}
	public void setActualFuelLevel( int fuel ) {
		this.actualFuelLevel = fuel;
	}

	public int getMaxFuelLevel() {
		return maxFuelLevel;
	}
	public int getActualFuelLevel() {
		return actualFuelLevel;
	}
	public void setFuelToFullTanked() {
		actualFuelLevel = maxFuelLevel;
	}
}
