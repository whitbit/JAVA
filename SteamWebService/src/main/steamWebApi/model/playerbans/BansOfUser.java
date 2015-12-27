package model.playerbans;

import java.util.List;
import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserList;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.lists.ListsException;
import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.getplayerbans.GetPlayerBans;
import com.lukaspradel.steamapi.webapi.request.GetPlayerBansRequest;
/**
 * Base class to connect with player bans from SteamWebApi.
 * @author M.Mucha
 */
public class BansOfUser extends SteamUserList implements ISteamBans {
	private GetPlayerBansRequest request;
	private GetPlayerBans playerBans;

	public BansOfUser( List< String > steamIDs ) {
		super( steamIDs );
	}
	
	@Override
	protected void setRequest( List< String > steamIDs ) {
		this.request = new GetPlayerBansRequest.GetPlayerBansRequestBuilder( steamIDs ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.playerBans = getClient().< GetPlayerBans >processRequest( request );
	}
	@Override
	protected void initialize( List< String > steamIDs ) {
		try {
			setRequest( new SteamID( steamIDs ).getSteamIDs() );
			setRequestProcess();
		} catch ( SteamApiException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch ( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch( ListsException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	
	
	@Override
	public GetPlayerBansRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerBans getResult() throws ConnectionException {
		if( playerBans != null ) {
			return playerBans;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public BansOfUser getModel() {
		return this;
	}
	public GetPlayerBans getPlayerBans() {
		return playerBans;
	}	
}