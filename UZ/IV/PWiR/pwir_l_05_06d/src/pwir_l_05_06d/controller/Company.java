package pwir_l_05_06d.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pwir_l_05_06d.model.Deliverer;
import pwir_l_05_06d.model.Delivery;
import pwir_l_05_06d.model.DeliveryShipping;
import pwir_l_05_06d.model.Car;

public class Company {
	private final String nameOfCompany = "[ PWiR Lab.05-06 - Firma Transportowa, wykonal Mateusz Mucha 201IDZB ]\n";
	private List< Car > carList = null;
	private String[] carNamesList = { "Mazda", "Toyota", "Opel", "Renault", "Ferrari", "Porsche", "Fiat", "Mustang", "Volkswagen", "Seat" };
	private List< CarThread > carThreadList = null;
	private List< Deliverer > delivererList = null;
	private Delivery delivery = null;
	private List< Delivery > deliveryList = null;
	private DeliveryShipping deliveryShipping = null;
	
	public Company( int valueOfCars, int valueOfDeliverer ) {
		System.out.println( nameOfCompany + "\nAll company cars:" );
		setCompanyDetailes( valueOfCars, valueOfDeliverer );		
	}	
	
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	private void setCompanyDetailes( int valueOfCars, int valueOfDeliverer ) {
		setCarList( valueOfCars );
		setCarThreadList( carList );
		setDelivererList( valueOfDeliverer );
		setDeliveryList( new ArrayList< Delivery >() );
		setDeliveryShipping( new DeliveryShipping( this, getDelivererList() ) );
		getDeliveryShipping().start();	
	}
	public String[] getCarNamesList() {
		return carNamesList;
	}
	private String getRandomCarNameOfCarNamesList() {
		Random random = new Random();
		int carNameID = random.nextInt( carNamesList.length );
		return carNamesList[ carNameID ];
	}
	private Deliverer getRandomDriverToCar() {
		Random random = new Random();
		int randomDriverID = random.nextInt( delivererList.size() );
		return delivererList.get( randomDriverID );
	}
	private void setCarList( int valueOfCars ) {
		this.carList = new ArrayList< Car >();
		for( int i = 0; i < valueOfCars; i++ ) {
			carList.add( new Car( i, getRandomCarNameOfCarNamesList() ) );
		}
	}
	public List< Car > getCarList() {
		return carList;
	}
	private void setCarThreadList( List< Car > carList ) {
		this.carThreadList = new ArrayList< CarThread >();
		for( int i = 0; i < carList.size(); i++ ) {
			carThreadList.add( new CarThread( i, carList.get( i ), this ) );
		}
	}
	public List< CarThread > getCarThreadList() {
		return carThreadList;
	}
	private void setDelivererList( int valueOfDeliverer ) {
		this.delivererList = new ArrayList< Deliverer >();
		for( int i = 0; i < valueOfDeliverer; i++ ) {
			delivererList.add( new Deliverer() );
		}
	}
	public List< Deliverer > getDelivererList() {
		return delivererList;
	}
	private void setDeliveryList( List< Delivery > deliveryList ) {
		this.deliveryList = deliveryList;
	}
	public List< Delivery > getDeliveryList() {
		return deliveryList;
	}
	private void setDeliveryShipping( DeliveryShipping deliveryShipping ) {
		this.deliveryShipping = deliveryShipping;
	}
	public DeliveryShipping getDeliveryShipping() {
		return deliveryShipping;
	}
	public synchronized void setDelivery( Delivery delivery )  {
		this.delivery = delivery;
		deliveryList.add( delivery );
		System.out.println( "\n[ New delivery ID: " + delivery.getDeliveryID() + " ]: " + delivery.getDeliveryInformation() + " waiting for deliverer..." );
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public synchronized Delivery setNewDelivery( Car car ) {
		for( int i = 0; i < deliveryList.size(); i++ )  {
			this.delivery = deliveryList.get( i );
			car.setDriver( getRandomDriverToCar() );
			int distanceToNextGasStation = delivery.getGasStationList().get( 0 ).getDistanceToNextGasStation();
			if( car.getActualFuelLevel() > distanceToNextGasStation ){
				return deliveryList.remove( i );
			}
		}
		return null;
	}
	public void carsGoToWork() {
		for( int i = 0; i < carThreadList.size(); i++ ) {
			carThreadList.get( i ).start();
		}
	}
}
