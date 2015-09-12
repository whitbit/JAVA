package rmiTestServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiTestMeeting.Constants;

public class MeetingServer {
   public static void main( String[] args ) throws Exception {
      System.setSecurityManager( new SecurityManager() );
      MeetingImpl impl = new MeetingImpl();     
      Registry registry = LocateRegistry.createRegistry( Constants.RMI_REGISTRY_PORT );
      registry.rebind( Constants.OBJECT_ID, impl );
      System.out.println( "Serwer wystartowal !!! " );
   }
}