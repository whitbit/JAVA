package model.ownedgames;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.ownedgames.GetOwnedGames;
import com.lukaspradel.steamapi.data.json.ownedgames.Response;
import com.lukaspradel.steamapi.webapi.request.GetOwnedGamesRequest;
import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserSingle;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
/**
 * Base class to connect with owned games from SteamWebApi.
 * @author M.Mucha
 */
public class OwnedGamesOfUser extends SteamUserSingle implements ISteamOwnedGames {
	private GetOwnedGamesRequest request;
	private GetOwnedGames ownedGames;
	private boolean includeAppInfo = true;
	private boolean includePlayedFreeGames = false;
	
	public OwnedGamesOfUser( String steamID ) {
		super();
		this.initialize( steamID );
	}
	public OwnedGamesOfUser( String steamID, boolean includeAppInfo, boolean includePlayedFreeGames ) {
		super();
		this.includeAppInfo = includeAppInfo;
		this.includePlayedFreeGames = includePlayedFreeGames;
		this.initialize( steamID );
	}

	@Override
	protected void setRequest( String steamID ) {
		this.request = new GetOwnedGamesRequest.GetOwnedGamesRequestBuilder( steamID ).includeAppInfo( this.includeAppInfo ).includePlayedFreeGames( this.includePlayedFreeGames ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.ownedGames = getClient().< GetOwnedGames >processRequest( request );
	}
	@Override
	protected void initialize( String steamID ) {
		try {
			setRequest( new SteamID( steamID ).getSteamID() );
			setRequestProcess();
		} catch ( SteamApiException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch ( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch( WrongValueException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	
	
	@Override
	public GetOwnedGamesRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetOwnedGames getResult() throws ConnectionException {
		if( ownedGames != null ) {
			return ownedGames;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public Response getResponse() throws ConnectionException {
		return getResult().getResponse();
	}
	@SuppressWarnings("unchecked")
	public OwnedGamesOfUser getModel() {
		return this;
	}
}