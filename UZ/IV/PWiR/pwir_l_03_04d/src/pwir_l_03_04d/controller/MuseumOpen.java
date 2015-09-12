package pwir_l_03_04d.controller;
import pwir_l_03_04d.model.GateIncoming;
import pwir_l_03_04d.model.GateOutgoing;
import pwir_l_03_04d.model.Museum;

public class MuseumOpen {
	private static Museum museum;
	private static GateIncoming gateIncoming;
	private static GateOutgoing gateOutgoing;
	private static int museumTimeOpened;
	public MuseumOpen( int freePlacesInMuseum, int gateInTimeToSleep, int gateOutTimeToSleep, int museumTimeOpened ) {
		museum = new Museum( freePlacesInMuseum );
		gateIncoming = new GateIncoming( museum, gateInTimeToSleep );
		gateOutgoing = new GateOutgoing( museum, gateIncoming, gateOutTimeToSleep );
		this.museumTimeOpened = museumTimeOpened;
	}	
	private synchronized void museumIsOpen() {
		gateIncoming.museumTimeOpened = true;
		gateOutgoing.museumTimeOpened = true;
		gateIncoming.start();
		gateOutgoing.start();
		System.out.println( "Museum is open! Have fun." );
	}
	private synchronized void museumIsClosed() {
		gateIncoming.museumTimeOpened = false;
		gateOutgoing.museumTimeOpened = false;
		System.out.println( "Museum is closed, please leave this place right now." );
	}
	public void museumOpen() throws Exception {
		try {
			museumIsOpen();
			Thread.sleep( museumTimeOpened );
			museumIsClosed();
		} catch ( Exception e ) {
			System.err.println();
		}
	}
}
