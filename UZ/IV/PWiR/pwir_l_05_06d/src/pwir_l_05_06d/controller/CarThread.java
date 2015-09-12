package pwir_l_05_06d.controller;
import java.util.List;
import pwir_l_05_06d.model.GasStation;
import pwir_l_05_06d.model.Delivery;
import pwir_l_05_06d.model.Car;

public class CarThread extends Thread {
	private int carID = 0;
	private Car car = null;
	private Delivery delivery = null;
	private List< GasStation > gasStationList = null;
	private Company company = null;
	
	public CarThread( int carID, Car car, Company company ) {
		setCarID( carID );
		setCarThreadDetails( car, company );
		System.out.println( getCarInformation() );
	}

	public int getCarID() {
		return carID;
	}
	public void setCarID( int carID ) {
		this.carID = carID;
	}
	private void setCarThreadDetails( Car car, Company company ) {
		setCar( car );
		setCompany( company );
	}
	private void setCar( Car car ) {
		this.car = car;
	}
	public Car getCar() {
		return car;
	}
	private void setDelivery( Delivery delivery ) {
		this.delivery = delivery;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	private void setGasStationList( List< GasStation > gasStationList ) {
		this.gasStationList = gasStationList;
	}
	public List< GasStation > getGasStationList() {
		return gasStationList;
	}
	private void setCompany( Company company ) {
		this.company = company;
	}
	public Company getCompany() {
		return company;
	}
	public void run() {
		while( true ) {
			if( getDelivery() == null ) {
				setDelivery( company.setNewDelivery( car ) );
				if( getDelivery() == null ) {				
					sleepForInformations();
				} else {
					System.out.print( getForJobInformation( this.car ) );
					setDelivery( delivery );
					System.out.print( delivery.getDeliveryID() + " to: " + delivery.getNameOfCustomer() + " with " + delivery.getGasStationList().size() + " Gas Stations.\n" );
					sleepForNextStation();
					startDeliveryShipping();
					sleepForInformations();
				}
			}
		}
	}
	public void startDeliveryShipping() {
		int currentStation = 0;
		setGasStationList( delivery.getGasStationList() );
		int distanceBetweenStations = getGasStationList().get( 0 ).getDistanceToNextGasStation();
		int distanceToEndPoint = delivery.getDistance();
		while( true ) {
			if( currentStation < gasStationList.size() ) {
				System.out.print( getFinishJobInformation( car, currentStation, gasStationList ) );
				if( car.getActualFuelLevel() > distanceBetweenStations ) {
					System.out.print( "but he has enough fuel." );
		            sleepToDrive();
				} else {
					car.setTankedCarOnGasStation();
					System.out.print( "and tanked" );
					sleepToTank();
				}
				System.out.print( "\n" );
				car.getFuelContainer().setActualFuelLevel( car.getActualFuelLevel() - distanceBetweenStations );
				currentStation++;
				sleepForNextStation();
			} else {
				setDelivery( null );
				System.out.print( getFinishJobInformation( car ) );
				break;
			}
		}
	}
	public void sleepToDrive() {
		try {
			Thread.sleep( 200 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	public void sleepToTank() {
		try {
			Thread.sleep( 700 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	public void sleepForInformations() {
		try {
			Thread.sleep( 1000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	public void sleepForNextStation() {
		try {
			Thread.sleep( 3000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private String getCarInformation() {
		StringBuilder stringBuilder = new StringBuilder( "[ " );	
		stringBuilder.append( car.getCarID() );		
		stringBuilder.append( " ] car of " );
		stringBuilder.append( company.getCarList().size() );
		stringBuilder.append( " [ " );
		stringBuilder.append( car.getName() );
		stringBuilder.append( " ] " );
		stringBuilder.append( "is ready." );
		stringBuilder.append( " ==>> || Actual fuel level: " );
		stringBuilder.append( car.getMaxFuelLevel() );
		stringBuilder.append( " l" );
		return stringBuilder.toString();
	}
	private String getForJobInformation( Car car ) {
		StringBuilder stringBuilder = new StringBuilder( "\n[ " );	
		stringBuilder.append( car.getCarID() );
		stringBuilder.append( " ] Car: " );
		stringBuilder.append( car.getName() );
		stringBuilder.append( " with driver: " );
		stringBuilder.append( car.getDriver().getNameInitialsOfDeliverer() );
		stringBuilder.append( " accepted the delivery " );
		return stringBuilder.toString();
	}
	private String getFinishJobInformation( Car car ) {
		StringBuilder stringBuilder = new StringBuilder( "\n[ " );	
		stringBuilder.append( car.getCarID() );
		stringBuilder.append( " ] Car: " );
		stringBuilder.append( car.getName() );
		stringBuilder.append( " with driver: " );
		stringBuilder.append( car.getDriver().getNameInitialsOfDeliverer() );
		stringBuilder.append( " delivered the shipment.\n\n" );
		return stringBuilder.toString();
	}
	private String getFinishJobInformation( Car car, int currentStation, List< GasStation > gasStationList ) {
		StringBuilder stringBuilder = new StringBuilder( "\n[ " );	
		stringBuilder.append( car.getCarID() );
		stringBuilder.append( " ] Car: " );
		stringBuilder.append( car.getName() );
		stringBuilder.append( " with driver: " );
		stringBuilder.append( car.getDriver().getNameInitialsOfDeliverer() );
		stringBuilder.append( " travel to station " );
		stringBuilder.append( ( currentStation + 1 ) );
		stringBuilder.append( "/" );
		stringBuilder.append( gasStationList.size() );		
		stringBuilder.append( " on the way " );	
		return stringBuilder.toString();
	}
}
