package model.base.steamuser;

import java.util.ArrayList;
import java.util.List;
import model.base.api.SteamWebApi;
/**
 * Abstract class for actions using list of steam ids.
 * @author M.Mucha
 */
public abstract class SteamUserList extends SteamWebApi {
	public SteamUserList( List< String > steamIDs ) {
		super();
		this.initialize( steamIDs );
	}
	public SteamUserList( String... steamIDsParams ) {
		super();		
		this.initialize( convertListFromParams( steamIDsParams ) );
	}
	private List< String > convertListFromParams( String... steamIDsParams ) {
		List< String > list = new ArrayList<String >();
		for( String id : steamIDsParams ) {
			list.add( id );
		}
		return list;
	}
	/**
	 * Method to initialize specific request type using list of steam ids.
	 * @param steamID
	 */
	protected abstract void setRequest( List< String > steamIDs );
	/**
	 * Method to initialize specific object using list of steam ids.
	 * @param steamID
	 */
	protected abstract void initialize( List< String > steamIDs );
}