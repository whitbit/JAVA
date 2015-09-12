package pwir_l_03_04d.model;

public class GateOutgoing extends Thread {
	private static Museum museum;
	private static int timeToSleep;
	private GateIncoming gateIncoming;
	public boolean museumTimeOpened = true;
	public GateOutgoing( Museum museum, GateIncoming gateIncoming, int timeToSleep ) {
		this.museum = museum;
		this.timeToSleep = timeToSleep;
		this.gateIncoming = gateIncoming;
	}
	public synchronized void run() {
		while( museumTimeOpened == true ){
			try {
				museum.touristOutGate();
				Thread.sleep( timeToSleep );
				openGateInIfClose( gateIncoming );
			} catch ( InterruptedException e ) {
				e.printStackTrace();
			}
		} 
	}
	private synchronized void openGateInIfClose( GateIncoming gateIncoming ) {
		if( gateIncoming.getState() == State.WAITING ) {
			synchronized( gateIncoming ) {
				gateIncoming.notify();
			}
		}
	}
}
