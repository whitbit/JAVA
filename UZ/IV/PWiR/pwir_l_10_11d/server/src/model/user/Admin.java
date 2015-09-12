package model.user;
import java.rmi.RemoteException;

public class Admin extends Client {
	private static final long serialVersionUID = 3L;
	
	public Admin( String login, String password ) throws RemoteException {
		super( login, password );
		admin = true;
	}
}
