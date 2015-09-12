package pwir_l_02d.model;

import pwir_l_02d.controller.World;

public class GetThread extends MainThread implements Runnable {
	public GetThread( String nameOfThread, World world, int timeToSleep ) {
		super( nameOfThread, world, timeToSleep );
	}
	public void run() {
		try {
			Thread.currentThread().setName( getNameOfThread() );
			for( int i = 0; i < getWorld().getArrayOfIntegers().size(); i++ ) {
				int valueFromArrayOfIntegersIndex = ( int )getWorld().getArrayOfIntegers().get( i );
				System.out.println( ( i + 1 ) + " element of collection: " + valueFromArrayOfIntegersIndex + " from index: " + 
						getWorld().getArrayOfIntegers().lastIndexOf( valueFromArrayOfIntegersIndex ) + ". From Thread ==>  " 
						+ Thread.currentThread().getName() );
				getWorld().getArrayOfIntegers().remove( i );
				Thread.sleep( getTimeToSleep() * 1000 );
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}