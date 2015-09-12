package pwir_l_05_06d.model;

public class Car extends Thread {
	private int carID = 0;
	private String nameOfCar = null;
	private FuelContainer fuelContainer = null;
	private Customer customer = null;
	private Deliverer driver = null;

	public Car( int carID, String nameOfCar ) {
		super( nameOfCar );
		setCarID( carID );
		setCarDetails( nameOfCar );
	}
	
	public int getCarID() {
		return carID;
	}
	public void setCarID( int carID ) {
		this.carID = carID;
	}
	private void setCarDetails( String nameOfCar ) {
		setNameOfCar( nameOfCar );
		setFuelContainer( new FuelContainer() );
	}
	public void setNameOfCar( String nameOfCar ) {
		this.nameOfCar = nameOfCar;
	}
	public String getNameOfCar() {
		return nameOfCar;
	}
	private void setFuelContainer( FuelContainer fuelContainer ) {
		this.fuelContainer = fuelContainer;
	}	
	public FuelContainer getFuelContainer() {
		return fuelContainer;
	}
	public int getMaxFuelLevel() {
		return getFuelContainer().getMaxFuelLevel();
	}
	public int getActualFuelLevel() {
		return getFuelContainer().getActualFuelLevel();
	}
	public void setTankedCarOnGasStation() {
		getFuelContainer().setFuelToFullTanked();
	}	
	public void setDriver( Deliverer driver ) {
		this.driver = driver;
	}
	public Deliverer getDriver() {
		return driver;
	}
	public void setCustomer( Customer customer ) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
}
