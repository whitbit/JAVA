package controller;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Locale;

import model.permission.Constans;
import model.user.interfaces.Administrator;
import model.user.interfaces.User;

public class AdminManager extends ClientManager {
	private static Administrator admin;
	private static String name, producer = null;
	private static int available, ID = 0;
	private static double cost = 0;

	public AdminManager() throws RemoteException {
		super();
	}
	
	public static String adminMenu() throws RemoteException {
		StringBuilder string = new StringBuilder( "\n==============================\n" );
		string.append( "-> Panel administratora\n" );
		string.append( "4. Dodaj produkt\n" );
		string.append( "5. Usun produkt\n" );
		string.append( "6. Znajdz uzytkownika\n" );
		string.append( "7. Lista uzytkownikow\n" );
		string.append( "8. Znajdz zamowienie\n" );
		string.append( "9. Lista zamowien\n" );
		return string.toString();
	}
	public static void adminMenuOption( int option, Remote remote ) throws RemoteException {
		switch( option ) {
			case 4:
				System.out.println( "== Dodawanie produktu ==\n" );
				System.out.print( "Wprowadz nazwe: " );
				name = input.next();
				System.out.print( "Wprowadz producenta: " );
				producer = input.next();
				System.out.print( "Wprowadz cene: " );
				cost = input.nextDouble();
				System.out.print( "Wprowadz dostepna ilosc: " );
				available = input.nextInt();
				admin.addProduct( name, producer, cost, available );
				break;
			case 5:
				System.out.println( "== Usuwanie produktu ==\n" );
				System.out.print( "Wprowadz ID produktu: " );
				ID = input.nextInt();
				admin.removeProduct( ID );
				System.out.println( "Usunales produkt o ID: " + ID );
				break;
			case 6:
				System.out.println( "== Szukanie uzytkownika ==\n" );
				System.out.print( "Wprowadz ID uzytkownika: " );
				ID = input.nextInt();
				System.out.println( admin.getUser( ID ) );
				break;
			case 7:
				System.out.println( "== Lista uzytkownikow ==\n" );
				System.out.print( admin.getUserList() );
				break;
			case 8:
				System.out.println( "== Szukanie zamowienia ==\n" );
				System.out.print( "Wprowadz ID zamowienia: " );
				ID = input.nextInt();
				System.out.println( admin.getOrder( ID ) );
				break;
			case 9:
				System.out.println( "== Lista zamowien ==\n" );
				System.out.print( admin.getOrderList() );
				break;
			default:
				System.out.println();
		}
	}
	private static void start( Remote remote ) throws RemoteException {
		option = input.nextInt();
		if( option < 4 ) {
			shopMenuOption( option, remote );
		} else {
			adminMenuOption( option, remote );
		}
	}
	public static void main( Remote remote ) {
		try {
			System.setSecurityManager( new RMISecurityManager() );
			input.useLocale( Locale.US );
			user = ( User )remote;
			admin = ( Administrator )remote;
			System.out.print( startMenu() + "\nWybierz Opcje: " );
			option = input.nextInt();		
			startMenuOption( option, remote );
			do {
				System.out.println( shopMenu() + adminMenu() );
				start( remote );
			} while( option != 0 );
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}	
}