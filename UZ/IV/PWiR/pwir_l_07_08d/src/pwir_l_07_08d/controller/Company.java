package pwir_l_07_08d.controller;
import pwir_l_07_08d.model.Deliverer;
import pwir_l_07_08d.model.Delivery;
import pwir_l_07_08d.model.DeliveryShipping;
import pwir_l_07_08d.model.dataFromFiles.*;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

public class Company {
	private String nameOfCompany = null;
	private List< String > carNamesList = new CarName().getNameList();
	private List< Deliverer > delivererList = null;
	private List< Car > carThreadList = null;
	private List< Delivery > deliveryList = null;
	private Delivery delivery = null;
	private DeliveryShipping deliveryShipping = null;
	
	public Company( String nameOfCompany, int valueOfCars, int valueOfDeliverer ) throws IOException {
		setCompanyDetailes( nameOfCompany, valueOfCars, valueOfDeliverer );		
	}	
	
	private void setNameOfCompany( String nameOfCompany ) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public String getLabName() {
		return getNameOfCompany().substring( 1, 16 );
	}
	private String getRandomCarNameOfCarNamesList() {
		Random random = new Random();
		int carNameID = random.nextInt( carNamesList.size() );
		return carNamesList.get( carNameID );
	}
	private void setDelivererList( int valueOfDeliverer ) throws IOException {
		this.delivererList = new ArrayList< Deliverer >();
		for( int i = 0; i < valueOfDeliverer; i++ ) {
			delivererList.add( new Deliverer() );
		}
	}
	private List< Deliverer > getDelivererList() {
		return delivererList;
	}
	private Deliverer getRandomDeliverer() {
		Random random = new Random();
		int delivererID = random.nextInt( delivererList.size() );
		return delivererList.get( delivererID );
	}
	private void setCarThreadList( int valueOfCars ) {
		this.carThreadList = new ArrayList< Car >();
		for( int i = 0; i < valueOfCars; i++ ) {
			carThreadList.add( new Car( i, getRandomCarNameOfCarNamesList(), getRandomDeliverer(), this ) );
		}
	}
	public List< Car > getCarThreadList() {
		return carThreadList;
	}
	private void setDeliveryList( List< Delivery > deliveryList ) {
		this.deliveryList = deliveryList;
	}
	public synchronized void setDelivery( Delivery delivery )  {
		this.delivery = delivery;
		deliveryList.add( delivery );
	}
	private void setDeliveryShipping( DeliveryShipping deliveryShipping ) {
		this.deliveryShipping = deliveryShipping;
	}
	private DeliveryShipping getDeliveryShipping() {
		return deliveryShipping;
	}
	private void setCompanyDetailes( String nameOfCompany, int valueOfCars, int valueOfDeliverer ) throws IOException {
		setNameOfCompany( nameOfCompany );
		setDelivererList( valueOfDeliverer );
		setCarThreadList( valueOfCars );
		setDeliveryList( new ArrayList< Delivery >() );
		setDeliveryShipping( new DeliveryShipping( this, getDelivererList() ) );
		getDeliveryShipping().start();	
	}
	public synchronized Delivery setNewDelivery( Car car ) {
		for( int i = 0; i < deliveryList.size(); i++ )  {
			this.delivery = deliveryList.get( i );
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
