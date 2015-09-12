package pwir_l_07_08d.model;
import java.io.IOException;
import java.util.List;

public class Delivery {	
	private int deliveryID = 0;
	private int distance = 0;
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
	public int getDistance() {
		return distance;
	}
	public void setDistance( int distance ) {
		this.distance = distance;
	}
	public Customer getCustomer() {
		return customer;
	}
	private void setCustomer( Customer customer ) {
		this.customer = customer;
	}
	public String getNameOfCustomer() {
		return getCustomer().getCompanyNameOfCustomer();
	}
	public Deliverer getDeliverer() {
		return deliverer;
	}
	public void setDeliverer( Deliverer deliverer ) {
		this.deliverer = deliverer;
	}
	public String getNameOfDeliverer() throws IOException {
		return getDeliverer().getFullNameOfDeliverer();
	}
	public List< GasStation > getGasStationList() {
		return gasStationList;
	}
	public void setGasStationList( List< GasStation > gasStationList ) {
		this.gasStationList = gasStationList;
	}	
}
