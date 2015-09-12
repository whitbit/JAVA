package model.user.interfaces;
import java.rmi.RemoteException;

public interface Administrator extends User {
	public void addProduct( String name, String producer, double cost, int available  ) throws RemoteException;
	public void removeProduct( int productID ) throws RemoteException;
	public String getUser( int userID ) throws RemoteException;
	public String getUserList() throws RemoteException;
	public String getOrder( int orderID ) throws RemoteException;
	public String getOrderList() throws RemoteException;
}

