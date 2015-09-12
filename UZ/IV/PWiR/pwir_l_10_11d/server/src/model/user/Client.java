package model.user;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Client extends UnicastRemoteObject {
	private static final long serialVersionUID = 2L;
	private String login, password = null;
	protected boolean admin = false;
	private static int autoID = 0;
	private int clientID = 0;

	public Client( String login, String password ) throws RemoteException {
		super();
		setUserDetails( login, password );
		setClientID( autoID++ );
	}

	public String getPassword() throws RemoteException {
		return password;
	}
	private void setPassword( String password ) throws RemoteException {
		this.password = password;
	}
	private void setLogin( String login ) throws RemoteException {
		this.login = login;
	}
	public String getLogin() throws RemoteException {
		return login;
	}
	private void setUserDetails( String login, String password ) throws RemoteException {
		setLogin( login );
		setPassword( password );
	}
	public boolean isAdmin() {
		return admin;
	}
	public int getClientID() {
		return clientID;
	}
	private void setClientID( int clientID ) {
		this.clientID = clientID;
	}
}