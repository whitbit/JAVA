package controller;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Locale;
import java.util.Scanner;

import model.user.interfaces.User;

public class ClientManager {
	private static final long serialVersionUID = 1L;
	protected static Scanner input = new Scanner( System.in );
	protected static String login;
	private static String password;
	private static String search = null;
	protected static int option;
	private static int minCost;
	private static int maxCost;
	private static int ID = 0;
	protected static User user = null;
	
	public ClientManager() throws RemoteException {}
	
	public static String startMenu() throws RemoteException {
		StringBuilder string = new StringBuilder( "[0] - Wyjscie\n" );
		string.append( "[1] - Logowanie\n" );
		return string.toString();
	}
	public static String shopMenu() throws RemoteException {
		StringBuilder string = new StringBuilder( "\n== Menu uzytkownika ==\n-> Zalogowany jako: " );
		string.append( login );
		string.append( "\n[0] - Wyjscie\n" );
		string.append( "[1] - Lista produktow\n" );
		string.append( "[2] - Szukaj produktu\n" );
		string.append( "[3] - Kup produkt" );		
		return string.toString();
	}
	private static String searchProductMenu() {
		StringBuilder string = new StringBuilder( "== Znajdz produkt ==\n" );
		string.append( "1.1. wg Nazwy\n" );
		string.append( "1.2. wg Producenta\n" );
		string.append( "1.3. wg Przedzialu cenowego" );
		return string.toString();
	}
	public void createNewAccount() throws RemoteException {
		createAccount();
	}
	private static void login() throws RemoteException {
		System.out.println( "== Logowanie ==" );
		System.out.print( "Login: " );
		login = input.next();
		System.out.print( "Haslo: " );
		password = input.next();
		user.login( "mateuszmucha", "mucha201IDZ" );
	}
	private static void createAccount() throws RemoteException {
		System.out.println( "== Zakladanie konta ==\n" );
		System.out.print( "Wprowadz login: " );
		login = input.next();
		System.out.print( "Wprowadz haslo: " );
		password = input.next();
		user.createAccount( login, password );
	}
	public static void startMenuOption( int option, Remote remote ) throws RemoteException {
		switch( option ) {
			case 0:
				System.exit( 0 );
				break;
			case 1:
				login();
				break;
			case 2:
				createAccount();
				break;
			default:
				System.out.println();
		}
	}
	private static void searchProduct( int optionForSearch ) throws RemoteException {
		switch( optionForSearch ) {
			case 1:
				System.out.print( "Podaj nazwe: " );
				search = input.next();
				System.out.println( user.getProductByName( search ) );
				break;
			case 2:
				System.out.print( "Podaj nazwe producenta: " );
				search = input.next();
				System.out.println( user.getProductByProducer( search ) );
				break;
			case 3:
				System.out.print( "Podaj cene Od: " );
				minCost = input.nextInt();
				System.out.print( "Podaj cene Do: " );
				maxCost = input.nextInt();
				System.out.println( user.getProductByCost( minCost, maxCost ) );
				break;
		}
	}
	public static void shopMenuOption( int option, Remote remote ) throws RemoteException {
		switch( option ) {
			case 0:
				System.exit( 0 );
				break;
			case 1:
				System.out.println( "== Lista produktow ==\n" );
				System.out.println(  user.getProductList() );
				break;
			case 2:
				System.out.println( searchProductMenu() );
				int optionForSearch = input.nextInt();
				searchProduct( optionForSearch );
				break;
			case 3:
				System.out.println( "Podaj numer produktu: " );
				ID = input.nextInt();
				user.buyProduct( ID, user.login( "mateuszmucha", "mucha201IDZ" ) );
				System.out.println( "Kupiles 1 produkt!\n" );
				break;
			default:
				System.out.println();
		}
	}
	public static void main( Remote remote ) {
		try {
			System.setSecurityManager( new RMISecurityManager() );
			input.useLocale( Locale.US );
			user = ( User )remote;
			System.out.print( startMenu() + "[2] - Zaloz konto\n\nWybierz Opcje: " );
			option = input.nextInt();		
			startMenuOption( option, remote );
			do {
				System.out.println( shopMenu() );
				option = input.nextInt();
				shopMenuOption( option, remote );
			} while( option != 0 );
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}