package pwir_l_03_04d.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Museum {
	private static List< Tourist > touristsList;
	private static int freePlacesInMuseum;
	public Museum( int freePlacesInMuseum ) {
		touristsList = new ArrayList< Tourist >( freePlacesInMuseum );
		touristIncomming( freePlacesInMuseum );
	}
	private void touristIncomming( int freePlacesInMuseum ) {
		this.freePlacesInMuseum = freePlacesInMuseum;
		for( int i = 0; i < freePlacesInMuseum; i++ ) {
			touristsList.add( null );
		}
	}
	public boolean freePlaceInMuseum() {
		for( int i = 0 ; i < touristsList.size() ; i++ ) {
			if( touristsList.get( i ) == null ) {
				return true;
			}
		}
		return false;
	}
	private String displayNewTourist( int displayNewTourist ) {
		StringBuilder stringBuilder = new StringBuilder( ">> Tourist [" );
		stringBuilder.append( touristsList.get( displayNewTourist ).getIdOfTourist() );
		stringBuilder.append( "] is comming. To index: " );
		stringBuilder.append( touristsList.indexOf( touristsList.get( displayNewTourist ) ) );
		return stringBuilder.toString();
	}
	public synchronized Tourist touristInGate() throws Exception {
		for( int i = 0 ; i < touristsList.size(); i++ ) {
			if( touristsList.get( i ) == null) {
				touristsList.set( i, new Tourist() );
				System.out.println( displayNewTourist( i ) );
				return touristsList.get( i );
			}
		}
		throw new Exception( "No free places in museum. Please wait." );
	}
	private int generateNewTouristToOut() {
		Random touristsGenerator = new Random();
		return touristsGenerator.nextInt( touristsList.size() );
	}
	private String displayOutTourist( int displayOutTourist ) {
		StringBuilder stringBuilder = new StringBuilder( "<< Tourist [[" );
		stringBuilder.append( touristsList.get( displayOutTourist ).getIdOfTourist() );
		stringBuilder.append( "]] is leaving. From index: " );
		stringBuilder.append( touristsList.indexOf( touristsList.get( displayOutTourist ) ) );
		return stringBuilder.toString();
	}
	private void checkIfTouristIsNull( int generateTouristOutgoing ) {
		if( touristsList.get( generateTouristOutgoing ) != null ) {
			System.out.println( displayOutTourist( generateTouristOutgoing ) );
			touristsList.set( generateTouristOutgoing, null );
		}
	}
	public synchronized Tourist touristOutGate() {
		int generateTouristOutgoing = generateNewTouristToOut();
		checkIfTouristIsNull( generateTouristOutgoing );
		return touristsList.get( generateTouristOutgoing );
	}	
}
