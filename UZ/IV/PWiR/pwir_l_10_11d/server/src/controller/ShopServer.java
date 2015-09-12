package controller;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import model.remoteObject.Shop;

public class ShopServer {	 
    public static void main( String[] args ) {
         try {
        	 Shop shop = new Shop();
        	 Registry registry = LocateRegistry.createRegistry( 1099 );
             registry.rebind( "rmi://localhost/pwir_l_10_11d/server/", shop );
             System.out.println( "Serwer: Shop - Wystartowal." );
         } catch( Exception e ) {
        	 e.printStackTrace();
        	 System.out.println( e.getMessage() );
         }
    }
}
