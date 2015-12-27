package model.userstatsforgame;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.playerstats.GetUserStatsForGame;
import com.lukaspradel.steamapi.data.json.playerstats.Playerstats;
import com.lukaspradel.steamapi.webapi.request.GetUserStatsForGameRequest;
import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserForApp;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
/**
 * Base class to connect with stats for games from SteamWebApi.
 * @author M.Mucha
 */
public class StatsForGameOfUser extends SteamUserForApp implements ISteamStatsForGame {
	private GetUserStatsForGameRequest request;
	private GetUserStatsForGame userStatsForGame;
	private String language = null;

	public StatsForGameOfUser( String steamID, int appID ) {
		super();
		this.initialize( steamID, appID );
	}
	public StatsForGameOfUser( String steamID, int appID, String language ) {
		super();
		try {
			setLanguage( language );
			this.initialize( steamID, appID );
		} catch( WrongValueException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	/**
	 * Sets custom language of results.
	 * @param language
	 * @throws WrongValueException
	 */
	private void setLanguage( String language ) throws WrongValueException {
		if( language != null ) {
			this.language = language;
		} else {
			throw new WrongValueException( ExceptionType.LANGUAGE_IS_NULL );
		}
	}
	@Override
	protected void setRequest( String steamID, int appID ) {
		this.request = new GetUserStatsForGameRequest.GetUserStatsForGameRequestBuilder( steamID, appID ).language( this.language ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.userStatsForGame = getClient().< GetUserStatsForGame >processRequest( request );
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
	public GetUserStatsForGameRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetUserStatsForGame getResult() throws ConnectionException {
		if( userStatsForGame != null ) {
			return userStatsForGame;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public StatsForGameOfUser getModel() {
		return this;
	}
	public Playerstats getPlayerStats() throws ConnectionException {
		return getResult().getPlayerstats();
	}
}