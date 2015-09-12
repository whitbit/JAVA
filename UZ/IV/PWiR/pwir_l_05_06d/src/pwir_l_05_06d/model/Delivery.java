package pwir_l_05_06d.model;
import java.util.List;

public class Delivery {	
	private int distance = 0;
	private int deliveryID = 0;
	private Customer customer = null;
	private Deliverer deliverer = null;
	private List < GasStation > gasStationList = null;	
	
	public Delivery( int deliveryID ) {
		setDeliveryID( deliveryID );
		setCustomer( new Customer() );
	}
	
	private void setDeliveryID( int deliveryID ) {
		this.deliveryID = deliveryID;
	}
	public int getDeliveryID() {
		return deliveryID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer( Customer customer ) {
		this.customer = customer;
	}
	public Deliverer getDeliverer() {
		return deliverer;
	}
	public void setDeliverer( Deliverer deliverer ) {
		this.deliverer = deliverer;
	}
	public String getNameOfCustomer() {
		return getCustomer().getCompanyNameOfCustomer();
	}
	public String getNameOfDeliverer() {
		return getDeliverer().getNameInitialsOfDeliverer();
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance( int distance ) {
		this.distance = distance;
	}
	public List< GasStation > getGasStationList() {
		return gasStationList;
	}
	public void setGasStationList( List< GasStation > gasStationList ) {
		this.gasStationList = gasStationList;
	}	
	public String getDeliveryInformation() {
		StringBuilder stringBuilder = new StringBuilder( getNameOfCustomer() );
		stringBuilder.append( " company. Waiting for package " );
		stringBuilder.append( getDistance() );
		stringBuilder.append( "/km with: " );
		stringBuilder.append( gasStationList.size() );
		stringBuilder.append( " Gas Stations on the way" );
		return stringBuilder.toString();	
	}
}
