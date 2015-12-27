package model.base.steamapp;
/**
 * Abstract class for actions on apps with specific app id.
 * @author M.Mucha
 */
public abstract class SteamApp extends SteamAppBase {
	public SteamApp() {
		super();
	}
	public SteamApp( int appID ) {
		super();
		this.initialize( appID );
	}
	/**
	 * Method to initialize specific request type using app id.
	 * @param steamID
	 */
	protected abstract void setRequest( int appID );
	/**
	 * Method to initialize specific object using app id.
	 * @param steamID
	 */
	protected abstract void initialize( int appID );
}