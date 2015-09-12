package pwir_l_07_08d.controller;
import pwir_l_07_08d.model.Customer;
import pwir_l_07_08d.model.Deliverer;
import pwir_l_07_08d.model.Delivery;
import pwir_l_07_08d.model.FuelContainer;
import pwir_l_07_08d.model.GasStation;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;

public class Car extends Thread {
	private int carID = 0;
	private String nameOfCar = null;
	private static FuelContainer fuelContainer = null;
	private static Deliverer deliverer = null;
	private Customer customer = null;
	private Delivery delivery = null;
	private List< GasStation > gasStationList = null;
	private static Company company = null;
	private JLabel status = null;
	private JLabel statusDeliverer = null;
	private JLabel statusCustomer = null;
	private JLabel statusCar = null;	
	
	public Car( int carID, String nameOfCar, Deliverer deliverer, Company company ) {
		super( nameOfCar );
		setCarID( carID );
		setNameOfCar( nameOfCar );
		setCarThreadDetails( deliverer, company );
	}
	
	public int getCarID() {
		return carID;
	}
	private void setCarID( int car_ID ) {
		carID = car_ID;
	}
	private void setNameOfCar( String nameOf_Car ) {
		nameOfCar = nameOf_Car;
	}
	public String getNameOfCar() {
		return nameOfCar;
	}
	private static void setFuelContainer( FuelContainer fuel_Container ) {
		fuelContainer = fuel_Container;
	}	
	public FuelContainer getFuelContainer() {
		return fuelContainer;
	}
	public int getActualFuelLevel() {
		return getFuelContainer().getActualFuelLevel();
	}
	public void setTankedCarOnGasStation() {
		getFuelContainer().setFuelToFullTanked();
	}	
	private static void setDeliverer( Deliverer driver ) {
		deliverer = driver;
	}
	private void setDelivery( Delivery delivery ) {
		this.delivery = delivery;
	}
	private Delivery getDelivery() {
		return delivery;
	}
	private void setGasStationList( List< GasStation > gasStationList ) {
		this.gasStationList = gasStationList;
	}
	private List< GasStation > getGasStationList() {
		return gasStationList;
	}
	private static void setCompany( Company typeCompany ) {
		company = typeCompany;
	}
	public void setStatus( JLabel jlabel ) {
		this.status = jlabel;
	}
	public void setStatusDeliverer( JLabel status2 ) {
		this.statusDeliverer = status2;
	}
	public void setStatusCustomer( JLabel status3 ) {
		this.statusCustomer = status3;
	}
	public void setStatusCar( JLabel statusCar ) {
		this.statusCar = statusCar;
	}
	private static void setCarThreadDetails( Deliverer deliverer, Company company ) {
		setFuelContainer( new FuelContainer() );
		setDeliverer( deliverer );
		setCompany( company );
	}
	private void sleepDriveToNextStation() {
		try {
			Thread.sleep( 500 );
			status.setForeground( Color.LIGHT_GRAY );
			status.setText( "W drodze na stacje." );
			Thread.sleep( 2000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void sleepToDrive() {
		try {
			Thread.sleep( 500 );
			status.setForeground( Color.DARK_GRAY );
			status.setText( "Wystarczajaco paliwa, jedzie dalej." );
			Thread.sleep( 1000 );
			status.setForeground( Color.GREEN );
			status.setText( "W trakcie jazdy do odbiorcy." );
			Thread.sleep( 2000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void sleepToTank() {
		try {
			Thread.sleep( 800 );
			status.setForeground( Color.BLUE.darker() );
			status.setText( "Tankuje..." );
			Thread.sleep( 1700 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void sleepForNextStation() {
		try {
			Thread.sleep( 3000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void sleepNewJob() throws IOException {
		try {
			Thread.sleep( 1000 );
			status.setText( "Jest robota!" );
			status.setForeground( Color.ORANGE );
			Thread.sleep( 500 );
			setDelivery( delivery );
			statusDeliverer.setText( delivery.getNameOfDeliverer().toUpperCase() );
			statusCustomer.setText( delivery.getNameOfCustomer() + " => ID::0xx" + delivery.getDeliveryID() );
			status.setText( "W trakcie jazdy do odbiorcy." );
			status.setForeground( Color.GREEN );
			return;
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void sleepFinishJob() {
		try {
			Thread.sleep( 3000 );
			status.setText( "Dostarczono" );
			status.setForeground( Color.RED.darker() );
			Thread.sleep( 1300 );
			status.setText( "Powrot do firmy." );
			Thread.sleep( 5000 );
			status.setForeground( Color.YELLOW.darker() );
			status.setText( "Auto w firmie! Czeka na zlecenie." );
			statusCustomer.setText( "Stoi w" + company.getLabName() );  
			statusDeliverer.setText( "" );
			return;
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void sleepForInformations() {
		try {
			Thread.sleep( 1000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	private void startDeliveryShipping() throws IOException {
		Random random = new Random();
		int currentStation = 0;
		setGasStationList( delivery.getGasStationList() );
		int distanceBetweenStations = getGasStationList().get( random.nextInt( delivery.getGasStationList().size() ) ).getDistanceToNextGasStation();
		while( true ) {
			if( currentStation < gasStationList.size() ) {
				sleepDriveToNextStation();
				if( getActualFuelLevel() > distanceBetweenStations ) {
					sleepToDrive();
				} else {
					setTankedCarOnGasStation();
					sleepToTank();
				}
				getFuelContainer().setActualFuelLevel( getActualFuelLevel() - distanceBetweenStations );
				currentStation++;
				sleepForNextStation();
			} else {
				setDelivery( null );
				sleepFinishJob();
				break;
			}
		}
	}
	public void run() {
		while( true ) {
			try {
				if( getDelivery() == null ) {
					setDelivery( company.setNewDelivery( this ) );
					if( getDelivery() == null ) {
						sleepForInformations();
					} else {
						sleepNewJob();
						sleepForNextStation();
						startDeliveryShipping();
					}
				}				
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
	}
}
