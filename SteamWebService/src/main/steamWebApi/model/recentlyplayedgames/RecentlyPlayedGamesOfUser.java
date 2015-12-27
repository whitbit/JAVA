package model.recentlyplayedgames;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.GetRecentlyPlayedGames;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.Response;
import com.lukaspradel.steamapi.webapi.request.GetRecentlyPlayedGamesRequest;
import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserSingle;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
/**
 * Base class to connect with recently played games from SteamWebApi.
 * @author M.Mucha
 */
public class RecentlyPlayedGamesOfUser extends SteamUserSingle implements ISteamRecentlyPlayedGames {
	private GetRecentlyPlayedGamesRequest request;
	private GetRecentlyPlayedGames recentlyPlayedGames;
	private Integer count = null;

	public RecentlyPlayedGamesOfUser( String steamID ) {
		super();
		this.initialize( steamID );
	}
	public RecentlyPlayedGamesOfUser( String steamID, int count ) {
		super();
		this.count = count;
		this.initialize( steamID );
	}
	
	@Override
	protected void setRequest( String steamID ) {
		this.request = new GetRecentlyPlayedGamesRequest.GetRecentlyPlayedGamesRequestBuilder( steamID ).count( this.count ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.recentlyPlayedGames = getClient().< GetRecentlyPlayedGames >processRequest( request );
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
	public GetRecentlyPlayedGamesRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetRecentlyPlayedGames getResult() throws ConnectionException {
		if( recentlyPlayedGames != null ) {
			return recentlyPlayedGames;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public Response getResponse() throws ConnectionException {
		return getResult().getResponse();
	}
	@SuppressWarnings("unchecked")
	public RecentlyPlayedGamesOfUser getModel() {
		return this;
	}
}