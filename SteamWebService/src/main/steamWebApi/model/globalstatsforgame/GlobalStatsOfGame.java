package model.globalstatsforgame;

import java.util.List;
import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.GetGlobalStatsForGame;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Globalstats;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Response;
import com.lukaspradel.steamapi.webapi.request.GetGlobalStatsForGameRequest;
import model.base.steamapp.SteamGameStat;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
/**
 * Base class to connect with global stats of game from SteamWebApi.
 * @author M.Mucha
 */
public class GlobalStatsOfGame extends SteamGameStat implements ISteamGlobalStatsOfGame {
	private GetGlobalStatsForGameRequest request;
	private GetGlobalStatsForGame globalStatsForGameRequest;

	public GlobalStatsOfGame( int appID, int count, List< String > achievementNames ) {
		super( appID, count, achievementNames );
	}

	@Override
	protected void setRequest( int appID, int count, List< String > achievementNames ) {
		this.request = new GetGlobalStatsForGameRequest.GetGlobalStatsForGameRequestBuilder( appID, count, achievementNames ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.globalStatsForGameRequest = getClient().< GetGlobalStatsForGame >processRequest( request );
	}
	@Override
	protected void initialize( int appID, int count, List< String > achievementNames ) {
		try {
			setRequest( appID, count, achievementNames );
			setRequestProcess();
		} catch ( SteamApiException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch ( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	
	
	@Override
	public GetGlobalStatsForGameRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetGlobalStatsForGame getResult() throws ConnectionException {
		if( globalStatsForGameRequest != null ) {
			return globalStatsForGameRequest;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public Response getResponse() throws ConnectionException {
		return getResult().getResponse();
	}
	@SuppressWarnings("unchecked")
	public GlobalStatsOfGame getModel() {
		return this;
	}
	public Globalstats getGlobalStatsOfGame() throws ConnectionException {
		return getResponse().getGlobalstats();
	}
}