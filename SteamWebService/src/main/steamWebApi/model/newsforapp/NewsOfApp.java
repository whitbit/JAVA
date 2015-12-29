package model.newsforapp;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.appnews.Appnews;
import com.lukaspradel.steamapi.data.json.appnews.GetNewsForApp;
import com.lukaspradel.steamapi.webapi.request.GetNewsForAppRequest;
import model.base.steamapp.SteamApp;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
/**
 * Base class to connect with app news from SteamWebApi.
 * @author M.Mucha
 */
public class NewsOfApp extends SteamApp implements ISteamNewsOfApp {
	private GetNewsForAppRequest request;
	private GetNewsForApp newsForAppRequest;
	private Integer count, maxLength = null;

	public NewsOfApp( int appID ) {
		super();
		this.initialize( appID );
	}
	public NewsOfApp( int appID, Integer count, Integer maxLength ) {
		super();
		this.count = count;
		this.maxLength = maxLength;
		this.initialize( appID );
	}
	
	@Override
	protected void setRequest( int appID ) {
		this.request = new GetNewsForAppRequest.GetNewsForAppRequestBuilder( appID ).count( this.count ).maxLength( this.maxLength ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.newsForAppRequest = getClient().< GetNewsForApp >processRequest( request );
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
	public GetNewsForAppRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetNewsForApp getResult() throws ConnectionException {
		if( newsForAppRequest != null ) {
			return newsForAppRequest;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public NewsOfApp getModel() {
		return this;
	}
	public Appnews getAppNews() throws ConnectionException {
		return getResult().getAppnews();
	}
}