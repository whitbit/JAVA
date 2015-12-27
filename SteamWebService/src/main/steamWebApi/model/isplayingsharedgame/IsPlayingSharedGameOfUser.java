package model.isplayingsharedgame;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.isplayingsharedgame.IsPlayingSharedGame;
import com.lukaspradel.steamapi.data.json.isplayingsharedgame.Response;
import com.lukaspradel.steamapi.webapi.request.IsPlayingSharedGameRequest;
import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserForApp;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
/**
 * Base class to connect with shared playing games from SteamWebApi.
 * @author M.Mucha
 */
public class IsPlayingSharedGameOfUser extends SteamUserForApp implements ISteamSharedGames {
	private IsPlayingSharedGameRequest request;
	private IsPlayingSharedGame isPlayingSharedGame;
	
	public IsPlayingSharedGameOfUser( String steamID, int appID ) {
		super( steamID, appID );
	}

	@Override
	protected void setRequest( String steamID, int appID ) {
		this.request = new IsPlayingSharedGameRequest.IsPlayingSharedGameRequestBuilder( steamID, appID ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.isPlayingSharedGame = getClient().< IsPlayingSharedGame >processRequest( request );
	}
	@Override
	protected void initialize( String steamID, int appID ) {
		try {
			setRequest( ( new SteamID( steamID ).getSteamID() ), appID );
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
	public IsPlayingSharedGameRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public IsPlayingSharedGame getResult() throws ConnectionException {
		if( isPlayingSharedGame != null ) {
			return isPlayingSharedGame;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public Response getResponse() throws ConnectionException {
		return getResult().getResponse();
	}
	@SuppressWarnings("unchecked")
	public IsPlayingSharedGameOfUser getModel() {
		return this;
	}
}