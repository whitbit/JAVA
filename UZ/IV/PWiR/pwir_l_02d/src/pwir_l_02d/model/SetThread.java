package pwir_l_02d.model;

import pwir_l_02d.controller.World;

public class SetThread extends MainThread implements Runnable {
	public SetThread( String nameOfThread, World world, int timeToSleep ) {
		super( nameOfThread, world, timeToSleep );
	}
	public void run() {
		try {
			Thread.currentThread().setName( getNameOfThread() );
			for( int i = 0; i < getWorld().getHowManyIntegers(); i++ ) {
				getWorld().setInteger( Thread.currentThread().getName() );
				Thread.sleep( getTimeToSleep() * 1000 );
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}