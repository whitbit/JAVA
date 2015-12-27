package model.base.steamuser;

import model.exception.connection.ConnectionException;
/**
 * Abstract class for actions using single steam id.
 * @author M.Mucha
 */
public abstract class SteamUserSingle extends SteamUserBase {
	public SteamUserSingle() {
		super();
	}
	/**
	 * Method to initialize specific request type for single steam id.
	 * @param steamID
	 * @throws ConnectionException 
	 */
	protected abstract void setRequest( String steamID ) throws ConnectionException;
	/**
	 * Method to initialize specific object using single steam id.
	 * @param steamID
	 */
	protected abstract void initialize( String steamID );
}