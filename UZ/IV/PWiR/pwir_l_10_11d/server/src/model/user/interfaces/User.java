package model.user.interfaces;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface User extends Remote, Serializable {
	public void createAccount( String login, String password ) throws RemoteException;
	public int login( String login, String password ) throws RemoteException;
	public String getLogin( String login ) throws RemoteException;
	public void buyProduct( int ID, int clientID ) throws RemoteException;
	public String getProductList() throws RemoteException;	
	public String getProductByCost( double minCost, double maxCost ) throws RemoteException;
	public String getProductByName( String productName ) throws RemoteException;
	public String getProductByProducer( String productProducer ) throws RemoteException;  
}
