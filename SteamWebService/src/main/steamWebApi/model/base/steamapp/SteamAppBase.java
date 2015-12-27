package model.base.steamapp;

import model.base.api.SteamWebApi;
/**
 * Abstract class for actions with specific app id.
 * @author M.Mucha
 */
public abstract class SteamAppBase extends SteamWebApi {
	private int appID;
	public SteamAppBase() {
		super();
	}
	/**
	 * Method to get app id object and further action on this.
	 * @return appID
	 */
	public int getAppID() {
		return appID;
	}
	/**
	 * Method to set specific app id.
	 * @param appID
	 */
	public void setAppID( int appID ) {
		this.appID = appID;
	}
}