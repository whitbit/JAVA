package model.playersummaries;

import java.util.List;
import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.playersummaries.GetPlayerSummaries;
import com.lukaspradel.steamapi.data.json.playersummaries.Response;
import com.lukaspradel.steamapi.webapi.request.GetPlayerSummariesRequest;
import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserList;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.lists.ListsException;
/**
 * Base class to connect with player summaries from SteamWebApi.
 * @author M.Mucha
 */
public class SummariesOfUser extends SteamUserList implements ISteamSummariesOfUser {
	private GetPlayerSummariesRequest request;
	private GetPlayerSummaries playerSummaries;
	
	public SummariesOfUser( List< String > steamIDs ) {
		super( steamIDs );
	}
	
	@Override
	protected void setRequest( List< String > steamIDs ) {
		this.request = new GetPlayerSummariesRequest.GetPlayerSummariesRequestBuilder( steamIDs ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.playerSummaries = getClient().< GetPlayerSummaries >processRequest( request );
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
	public GetPlayerSummariesRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerSummaries getResult() throws ConnectionException {
		if( playerSummaries != null ) {
			return playerSummaries;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public Response getResponse() throws ConnectionException {
		return getResult().getResponse();
	}
	@SuppressWarnings("unchecked")
	public SummariesOfUser getModel() {
		return this;
	}
}