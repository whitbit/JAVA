package pwir_l_07_08d.model;
import java.util.Random;

public class FuelContainer {
	private static volatile int actualFuelLevel = 0;
	private static int maxFuelLevel = 0;
	
	public FuelContainer() {
		setMaxFuelLevel();
		setActualFuelLevel();
	}
		
	private static void setMaxFuelLevel() {
		Random random = new Random();
		maxFuelLevel = random.nextInt( 200 ) + 100;
	}
	private static void setActualFuelLevel() {
		Random random = new Random();		
		actualFuelLevel = random.nextInt( getMaxFuelLevel() - 20 ) + 20;
	}
	public void setActualFuelLevel( int fuel ) {
		actualFuelLevel = fuel;
	}
	public static int getMaxFuelLevel() {
		return maxFuelLevel;
	}
	public int getActualFuelLevel() {
		return actualFuelLevel;
	}
	public void setFuelToFullTanked() {
		actualFuelLevel = maxFuelLevel;
	}
}
