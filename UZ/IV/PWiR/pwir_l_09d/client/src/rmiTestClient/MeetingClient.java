package rmiTestClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiTestMeeting.Constants;
import rmiTestMeeting.IMeeting;

public class MeetingClient {
	public static void main( String[] args ) {
		try {
			System.setSecurityManager( new SecurityManager() );
			Registry registry = LocateRegistry.getRegistry( "localhost", Constants.RMI_REGISTRY_PORT );
			Remote remote = registry.lookup( Constants.OBJECT_ID );
			String string = null;
			IMeeting meeting;
			if( remote instanceof IMeeting ) {
				meeting = ( IMeeting )remote;
				string = meeting.getDate();
				System.out.println( "Data z systemu zdalnego: " + string );
				System.out.print( "\n\nPodaj Date (dzien-miesiac-rok): " );
				BufferedReader bis = new BufferedReader( new InputStreamReader( System.in ) );
				String line = bis.readLine();
				meeting.setDate( line );
				System.out.println( "\n\nDate zmieniono !!!!\n\n" );
				System.out.println( "Data z systemu zdalnego: " + meeting.getDate() + "\n\n" );
				bis.readLine();
			}
		} catch( Exception ioe ) {
			ioe.printStackTrace();
		}
	}
}
