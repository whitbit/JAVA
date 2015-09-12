package pwir_l_07_08d.model;
import pwir_l_07_08d.controller.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeliveryShipping extends Thread {
	private static List < Deliverer > delivererList = null;
	private List < GasStation > gasStationList = null;
	private GasStation gasStation = null;
	private Delivery delivery = null;
	private Company company = null;
	
	public DeliveryShipping( Company company, List< Deliverer > delivererList ) {
		setShippingDetails( company, delivererList );
	}
	
	private static void setDelivererList( List< Deliverer > deliverer_List ) {
		delivererList = deliverer_List;
	}
	public List< Deliverer > getDelivererList() {
		return delivererList;
	}
	private void setGasStationList( int randomGasStationValue, int distance ) {
		Random random = new Random();
		gasStationList = new ArrayList< GasStation >();
		for( int i = 0; i < randomGasStationValue; i++ ) {
			gasStationList.add( new GasStation( random.nextInt( distance ) ) );
		}
	}
	private List< GasStation > getGasStationList() {
		return gasStationList;
	}
	private void setGasStation( GasStation gasStation ) {
		this.gasStation = gasStation;
	}
	private GasStation getGasStation() {
		return gasStation;
	}
	private void setDelivery( Delivery delivery ) {
		this.delivery = delivery;
	}
	private Delivery getDelivery() {
		return delivery;
	}
	private void setCompany( Company company ) {
		this.company = company;
	}
	private int getRandomDistance() {
		Random random = new Random();
		return random.nextInt( 300 ) + 200;
	}
	private int getRandomGasStationsValue() {
		Random random = new Random();
		return random.nextInt( 9 ) + 1;
	}
	private Deliverer getRandomDeliverer( List < Deliverer > delivererList ) {
		Random random = new Random();
		int randomIndex = random.nextInt( delivererList.size() );
		return delivererList.get( randomIndex );		
	}
	private int getActualDistance( int actualDistance, int distance, int valueOfGasStations ) {
		return actualDistance = actualDistance - ( distance / ( valueOfGasStations ) );
	}
	private void setShippingDetails( Company company, List< Deliverer > delivererList ) {
		setDelivererList( delivererList );
		setCompany( company );
	}
	private void setGasStationsAndDistances( int distance, int actualDistance, int valueOfGasStations ) {
		getGasStation().setDistanceToEndPoint( actualDistance );
		getGasStation().setDistanceToNextGasStation( distance / ( valueOfGasStations ) );
		getGasStationList().add( getGasStation() );	
	}
	private Delivery getNewDelivery( Deliverer deliverer ) {
		Random random = new Random();
		int distance = getRandomDistance();
		int actualDistance = distance;
		int valueOfGasStations = getRandomGasStationsValue();
		int deliveryID = random.nextInt( 1000 ) + 1000;
		setDelivery( new Delivery( deliveryID ) );
		getDelivery().setDeliverer( deliverer );
		setGasStationList( valueOfGasStations, 10 );
		while( true ) {
			setGasStation( getGasStationList().get( random.nextInt( getGasStationList().size() ) ) );
			actualDistance = getActualDistance( actualDistance, distance, valueOfGasStations );
			if ( actualDistance >= ( distance / ( valueOfGasStations ) ) ) {
				setGasStationsAndDistances( distance, actualDistance, valueOfGasStations );
			} else {
				break;
			}
		}
		getDelivery().setGasStationList( getGasStationList() );
		getDelivery().setDistance( distance );		
		return getDelivery();		
	}
	public void run() {
		while( true ) {
			company.setDelivery( getNewDelivery( getRandomDeliverer( delivererList ) ) );
			try {
				sleep( 5000 );
			} catch( InterruptedException e ) {
				e.printStackTrace();
			}			
		}		
	}
}
