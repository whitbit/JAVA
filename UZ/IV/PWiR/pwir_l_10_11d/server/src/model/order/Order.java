package model.order;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import model.product.Product;

public class Order extends UnicastRemoteObject {
	private static final long serialVersionUID = 5L;
	private List< Product > orderList = null;
	private int clientID = 0;

	public Order( int clientID ) throws RemoteException {
		super();
		setOrderList( new ArrayList< Product >() );
		setClientID( clientID );
	}

	public List< Product > getOrderList() {
		return orderList;
	}
	private void setOrderList( List< Product > orderList ) {
		this.orderList = orderList;
	}
	public int getClientID() {
		return clientID;
	}
	private void setClientID( int clientID ) {
		this.clientID = clientID;
	}
	public void addProductToOrder( Product product ) {
		orderList.add( product );
	}
	public void removeProductFromOrderList( Product product ) {
		orderList.remove( product );
	}
	public String toString() {
		StringBuffer string = new StringBuffer( "Lista zamowien uzytkownika: \n" );
		for( Product product: orderList ) {
			string.append( "Nazwa: " );
			string.append( product.getProductName() );
			string.append( " Producent: " );
			string.append( product.getProducerOfProduct() );
			string.append( "\n" );
		}
		return string.toString();
	}
}