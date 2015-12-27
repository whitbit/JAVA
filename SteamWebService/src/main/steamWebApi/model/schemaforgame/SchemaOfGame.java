package model.schemaforgame;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.getschemaforgame.AvailableGameStats;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Game;
import com.lukaspradel.steamapi.data.json.getschemaforgame.GetSchemaForGame;
import com.lukaspradel.steamapi.webapi.request.GetSchemaForGameRequest;
import model.base.steamapp.SteamApp;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
/**
 * Base class to connect with schema for games from SteamWebApi.
 * @author M.Mucha
 */
public class SchemaOfGame extends SteamApp implements ISteamSchemaForGame {
	private GetSchemaForGameRequest request;
	private GetSchemaForGame schemaForGameRequest;

	public SchemaOfGame( int appID ) {
		super( appID );
	}

	@Override
	protected void setRequest( int appID ) {
		this.request = new GetSchemaForGameRequest.GetSchemaForGameRequestBuilder( appID ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.schemaForGameRequest = getClient().< GetSchemaForGame >processRequest( request );
	}
	@Override
	protected void initialize( int appID ) {
		try {
			setRequest( appID );
			setRequestProcess();
		} catch ( SteamApiException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch ( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	
	
	@Override
	public GetSchemaForGameRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetSchemaForGame getResult() throws ConnectionException {
		if( schemaForGameRequest != null ) {
			return schemaForGameRequest;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public SchemaOfGame getModel() {
		return this;
	}
	public Game getGameFromSchema() throws ConnectionException {
		return getResult().getGame();
	}
	public AvailableGameStats getAvailableGameStats() throws ConnectionException {
		return getGameFromSchema().getAvailableGameStats();
	}
}