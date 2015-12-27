package model.base.steamuser;

import model.exception.connection.ConnectionException;
/**
 * Abstract class for actions using single steam id and specific app id.
 * @author M.Mucha
 */
public abstract class SteamUserForApp extends SteamUserBase {
	public SteamUserForApp() {
		super();
	}
	public SteamUserForApp( String steamID, int appID ) {
		super();
		this.initialize( steamID, appID );
	}
	/**
	 * Method to initialize specific request type using single steam id and app id.
	 * @param steamID
	 */
	protected abstract void setRequest( String steamID, int appID );	
	/**
	 * Method to initialize specific object using steam id and app id.
	 * @param steamID
	 * @throws ConnectionException 
	 */
	protected abstract void initialize( String steamID, int appID );
}