package model.base.steamuser;

import model.base.api.SteamWebApi;
import model.base.steamid.SteamID;
/**
 * Abstract class for actions with specific steam id of user.
 * @author M.Mucha
 */
public abstract class SteamUserBase extends SteamWebApi {
	private SteamID steamID;
	public SteamUserBase() {
		super();
	}
	/**
	 * Method to get steam id object and further action on this.
	 * @return steamID
	 */
	public SteamID getSteamID() {
		return steamID;
	}
	/**
	 * Method to set specific steam id.
	 * @param steamID
	 */
	public void setSteamID( String steamID ) {
		this.steamID = new SteamID( steamID );
	}
}