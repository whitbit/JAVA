package model.remoteObject;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.order.Order;
import model.product.Product;
import model.user.Admin;
import model.user.Client;
import model.user.interfaces.Administrator;
import model.user.interfaces.User;

public class Shop extends UnicastRemoteObject implements User, Administrator {
	private static final long serialVersionUID = 1L;
	private List< Client > clientList = null;
	private List< Product > productList = null;
	private List< Order > orderList = null;
	
	public Shop() throws RemoteException {
		super();
		setDetails();
		clientList.add( new Admin( "mateuszmucha", "mucha201IDZ" ) );
		clientList.add( new Client( "client1", "client1" ) );
		productList.add( new Product( "ProcesorI7", "Intel", 525.5, 10 ) );
	}
	
	private void setClientList( List< Client > clientList ) throws RemoteException {
		this.clientList = clientList;
	}
	private void setProductList( List< Product > productList ) throws RemoteException {
		this.productList = productList;
	}
	private void setOrderList( List< Order > orderList ) throws RemoteException {
		this.orderList = orderList;
	}
	private void setDetails() throws RemoteException {
		setClientList( new ArrayList< Client >() );
		setProductList( new ArrayList< Product >() );
		setOrderList( new ArrayList< Order >() );
	}
	@Override
	public void addProduct( String name, String producer, double cost, int available ) throws RemoteException {
		if( name.isEmpty() || producer.isEmpty() || cost <= 0.0 || available <= 0 ) {
			throw new RemoteException( "Nie mozna dodac pustego produktu!" );
		}
		productList.add( new Product( name, producer, cost, available ) );
		System.out.println( "Dodales produkt: " + name + " producenta: " + producer + " w ilosci: " + available + " sztuk." );
	}
	@Override
	public void removeProduct( int productID ) throws RemoteException {
		productID--;
		Iterator< Product > productIterator = productList.iterator();
		while( productIterator.hasNext() ) {
			Product product = productIterator.next();
			if( product.getProductID() == productID ) {
				productIterator.remove();
			}
		}
	}
	@Override
	public String getUser( int userID ) throws RemoteException {
		userID--;
		Client client = ( Client )clientList.get( userID );
		StringBuilder string = new StringBuilder( "Uzytkownik: " );
		string.append( client.getLogin() );
		string.append( "\nID: " );
		string.append( client.getClientID() );
		return string.toString();
	}
	@Override
	public String getUserList() throws RemoteException {
		StringBuilder string = new StringBuilder( "Lista uzytkownikow:\n" );
		for( Client client: clientList ) {
			string.append( client.getClientID() + 1 );
			string.append( ". " );
			string.append( client.getLogin() );
			string.append( "\n" );
		}
		return string.toString();
	}
	@Override
	public String getOrder( int orderID ) throws RemoteException {
		return orderList.get( orderID ).toString();
	}
	@Override
	public String getOrderList() throws RemoteException {
		return orderList.toString();
	}
	@Override
	public void createAccount( String login, String password ) throws RemoteException {
		for( Client client: clientList ) {
			if( client.getLogin().equals( login ) ) {
				throw new RemoteException( "Uzytkownik istnieje!" );
			}
		}
		clientList.add( new Client( login, password ) );
		System.out.println( "Utworzono konto: " + login );
	}
	@Override
	public int login( String login, String password ) throws RemoteException {
		for( Client client: clientList ) {
			if( client.getLogin().equals( login ) && client.getPassword().equals( password ) ) {
				System.out.println( "Logowanie powiodlo sie." );
				return client.getClientID();
			} else {
				throw new RemoteException( "Bledna proba logowania." );
			}
		}
		throw new RemoteException( "Bledna proba logowania." );
	}
	@Override
	public String getLogin( String login ) throws RemoteException {
		for( Client client: clientList ) {
			if( client.getLogin().equals( login ) ) {
				return client.getLogin();
			} else {
				return "brak uzytkownika";
			}
		}
		throw new RemoteException( "brak uzytkownika" );
	}
	@Override
	public void buyProduct( int ID, int clientID ) throws RemoteException {
		ID--;
		List< Product > productToBuyList = new ArrayList< Product >();
		boolean newOrder = false;
		for( Product product: productList ) {
			if( product.getProductID() == ID ) {
				if( product.getAvailableProducts() != 0 ) {
					productToBuyList.add( product );
					product.setDecrementForAvailableProducts();
				}
			}
		}
		Order actualOrder = null;
		for( Order order: orderList ) {
			if( order.getClientID() == clientID ) {
				actualOrder = order;
			}
		}
		if( actualOrder == null ) {
			actualOrder = new Order( clientID );
			newOrder = true;
		}
		if( productToBuyList.size() != 0 ) {
			for( Product product: productToBuyList ) {
				actualOrder.addProductToOrder( product );
			}
			if( newOrder ) {
				orderList.add( actualOrder );
			}
		} else {
			throw new RemoteException( "Brak produktu w magazynie." );
		}
	}
	@Override
	public String getProductList() throws RemoteException {
		StringBuilder string = new StringBuilder();
		if( productList.size() != 0 ) {
			for( Product product: productList ) {
				string.append( ( product.getProductID() + 1 ) );
				string.append( ".] " );
				string.append( product.toString() );
				string.append( "\n" );
			}
		} else {
			throw new RemoteException( "Brak produktow." );
		}		
		return string.toString();
	}
	@Override
	public String getProductByCost( double minCost, double maxCost ) throws RemoteException {
		StringBuilder string = new StringBuilder();
		for( Product product: productList ) {
			if( product.getProductCost() > minCost && product.getProductCost() < maxCost  ) {
				string.append( product.toString() );
				string.append( "\n" );
			}
		}
		if( string.length() == 0 ) {
			throw new RemoteException( "Nie ma ofert w zadanym przedziale cenowym" );
		}
		return string.toString();
	}
	@Override
	public String getProductByName( String productName ) throws RemoteException {
		StringBuilder string = new StringBuilder();
		for( Product product: productList ) {
			if( product.getProductName().equals( productName ) ) {
				string.append( product.toString() );
				string.append( "\n" );
			}
		}
		if( string.length() == 0 ) {
			throw new RemoteException( "Nie ma produktu o takiej nazwie." );
		}
		return string.toString();
	}
	@Override
	public String getProductByProducer( String productProducer ) throws RemoteException {
		StringBuilder string = new StringBuilder();
		for( Product product: productList ) {
			if( product.getProducerOfProduct().equals( productProducer ) ) {
				string.append( product.toString() );
				string.append( "\n" );
			}
		}
		if( string.length() == 0 ) {
			throw new RemoteException( productProducer + " nie posiada wystawionych ofert." );
		}
		return string.toString();
	}
}