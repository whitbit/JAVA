package model.product;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Product extends UnicastRemoteObject implements Serializable {
	private static final long serialVersionUID = 4L;
	private String productName, producerOfProduct = null;
	private int productID = 0;
	private int availableProducts = 0;
	private double productCost = 0;
	private static int autoID = 0;
	
	public Product( String name, String producer, double cost, int available ) throws RemoteException {
		super();
		setDetails( autoID++, name, producer, cost, available );
	}

	public int getProductID() {
		return productID;
	}
	private void setProductID( int productID ) {
		this.productID = productID;
	}
	public int getAvailableProducts() {
		return availableProducts;
	}
	private void setAvailableProducts( int availableProducts ) {
		this.availableProducts = availableProducts;
	}
	public String getProductName() {
		return productName;
	}
	private void setProductName( String productName ) {
		this.productName = productName;
	}
	public String getProducerOfProduct() {
		return producerOfProduct;
	}
	private void setProducerOfProduct( String producerOfProduct ) {
		this.producerOfProduct = producerOfProduct;
	}
	public double getProductCost() {
		return productCost;
	}
	private void setProductCost( double productCost ) {
		this.productCost = productCost;
	}
	private void setDetails( int ID, String name, String producer, double cost, int available ) {
		setProductID( ID );
		setProductName( name );
		setProducerOfProduct( producer );
		setProductCost( cost );
		setAvailableProducts( available ) ;
	}	
	public String toString() {
		StringBuilder string = new StringBuilder( "[Nazwa:: " );
		string.append( getProductName() );
		string.append( "] [Producent:: " );
		string.append( getProducerOfProduct() );
		string.append( "] [Cena:: " );
		string.append( getProductCost() );
		string.append( "$ ] [Ilosc sztuk:: " );
		string.append( getAvailableProducts() );
		string.append( "]" );
		return string.toString();
    }
	public void setDecrementForAvailableProducts() {
		availableProducts--;
	}
}