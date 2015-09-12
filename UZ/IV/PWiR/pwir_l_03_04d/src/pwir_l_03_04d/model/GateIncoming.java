package pwir_l_03_04d.model;

public class GateIncoming extends Thread {
	private static Museum museum;
	private static int timeToSleep;
	public boolean museumTimeOpened = true;
	public GateIncoming( Museum museum, int timeToSleep ) {
		this.museum = museum;
		this.timeToSleep = timeToSleep;
	}	
	public synchronized void run() {
		while( museumTimeOpened == true ){
			try {
				Thread.sleep( timeToSleep );
				if ( museumTimeOpened == true ) {
					getTourist();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}	
	private synchronized void getTourist() {
		try {
			museum.touristInGate();
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
			if( museum.freePlaceInMuseum() == true ) {
				synchronized( this ) {
					try  {
						this.wait();
		            } catch ( Exception e1 ) {
		            	e.getMessage();
		            }
				}
			}
		}
	}	
}
