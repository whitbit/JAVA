package pwir_l_02d.model;

import pwir_l_02d.controller.World;

public abstract class MainThread {
	private World world = null;
	private int timeToSleep = 0;
	private String nameOfThread = null;
	public MainThread( String nameOfThread, World world, int timeToSleep ) {
		this.setWorld( world );
		this.setTimeToSleep( timeToSleep );
		this.setNameOfThread( nameOfThread );
	}
	public World getWorld() {
		return world;
	}
	public void setWorld( World world ) {
		this.world = world;
	}
	public int getTimeToSleep() {
		return timeToSleep;
	}
	public void setTimeToSleep( int timeToSleep ) {
		this.timeToSleep = timeToSleep;
	}
	public String getNameOfThread() {
		return nameOfThread;
	}
	public void setNameOfThread( String nameOfThread ) {
		this.nameOfThread = nameOfThread;
	}
}
