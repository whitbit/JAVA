package pwir_l_05_06d.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pwir_l_05_06d.controller.Company;

public class DeliveryShipping extends Thread {
	private List < Deliverer > delivererList = null;
	private Delivery delivery = null;
	private GasStation gasStation = null;
	private List < GasStation > gasStationList = null;
	private Company company = null;
	
	public DeliveryShipping( Company company, List< Deliverer > delivererList ) {
		setShippingDetails( company, delivererList );
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
	private void setShippingDetails( Company company, List< Deliverer > delivererList ) {
		setDelivererList( delivererList );
		setCompany( company );
	}
	private void setDelivererList( List< Deliverer > delivererList ) {
		this.delivererList = delivererList;
	}
	public List< Deliverer > getDelivererList() {
		return delivererList;
	}
	private void setCompany( Company company ) {
		this.company = company;
	}
	public Company getCompany() {
		return company;
	}
	private Deliverer getRandomDeliverer( List < Deliverer > delivererList ) {
		Random random = new Random();
		int randomIndex = random.nextInt( delivererList.size() );
		return delivererList.get( randomIndex );		
	}
	private void setDelivery( Delivery delivery ) {
		this.delivery = delivery;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	private void setGasStation( GasStation gasStation ) {
		this.gasStation = gasStation;
	}
	public GasStation getGasStation() {
		return gasStation;
	}
	private void setGasStationList( List< GasStation > gasStationList ) {
		this.gasStationList = gasStationList;
	}
	public List< GasStation > getGasStationList() {
		return gasStationList;
	}
	public int getRandomDistance() {
		Random random = new Random();
		return random.nextInt( 300 ) + 200;
	}
	public int getRandomGasStationsValue() {
		Random random = new Random();
		return random.nextInt( 9 ) + 1;
	}
	private int getActualDistance( int actualDistance, int distance, int valueOfGasStations ) {
		return actualDistance = actualDistance - ( distance / ( valueOfGasStations ) );
	}
	public Delivery getNewDelivery( Deliverer deliverer ) {
		Random random = new Random();
		int distance = getRandomDistance();
		int actualDistance = distance;
		int valueOfGasStations = getRandomGasStationsValue();
		int deliveryID = random.nextInt( 1000 ) + 1000;
		setDelivery( new Delivery( deliveryID ) );
		getDelivery().setDeliverer( deliverer );
		setGasStationList( new ArrayList< GasStation >() );
		while( true ) {
			setGasStation( new GasStation() );
			actualDistance = getActualDistance( actualDistance, distance, valueOfGasStations );
			if ( actualDistance >= ( distance / ( valueOfGasStations ) ) ) {
				getGasStation().setDistanceToEndPoint( actualDistance );
				getGasStation().setDistanceToNextGasStation( distance / ( valueOfGasStations ) );
				getGasStationList().add( getGasStation() );	
			} else {
				break;
			}
		}
		getDelivery().setGasStationList( getGasStationList() );
		getDelivery().setDistance( distance );		
		return getDelivery();		
	}
}
