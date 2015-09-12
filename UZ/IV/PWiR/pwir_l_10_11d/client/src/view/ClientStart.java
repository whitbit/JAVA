package view;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import controller.AdminManager;
import controller.ClientManager;

public class ClientStart {
	private static Scanner input = new Scanner( System.in );
	private static int option = 0;
	
	public ClientStart() throws RemoteException {}
	
	public static String startMenu() throws RemoteException {
		StringBuilder string = new StringBuilder( "== PWiR_10_11 - Sklep RMI :: by Mateusz Mucha ==\n" );
		string.append( "[1] - Klient\n" );
		string.append( "[2] - Administrator\n" );
		return string.toString();
	}
	public static void startMenuOption( int option, Remote remote ) throws RemoteException {
		switch( option ) {
			case 1:
				ClientManager.main( remote );
				break;
			case 2:
				AdminManager.main( remote );
				break;
			default:
				System.out.println();
		}
	}	
	public static void main( String[] args ) throws RemoteException {
		try {
			System.setSecurityManager( new RMISecurityManager() );
			Registry registry = LocateRegistry.getRegistry( "localhost", 1099 );
			Remote remote = registry.lookup( "rmi://localhost/pwir_l_10_11d/server/" );
			System.out.print( startMenu() + "\nWybierz opcje: " );
			option = input.nextInt();
			startMenuOption( option, remote );
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}