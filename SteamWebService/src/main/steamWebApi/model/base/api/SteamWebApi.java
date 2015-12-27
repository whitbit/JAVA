package model.base.api;

import model.base.api.details.Details;
import model.base.api.log.LoggerService;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.webapi.client.SteamWebApiClient;
import com.lukaspradel.steamapi.webapi.request.SteamWebApiRequest;
/**
 * Abstract class for connection with SteamWebApi using api client.
 * @author M.Mucha
 */
public abstract class SteamWebApi {
	private SteamWebApiClient client;
	private LoggerService logger;
	
	public SteamWebApi() {
		this.logger = new LoggerService( this.getClass() );
		try {
			initializeConnection();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	/**
	 * Initialize basic connection with steam web api client catching exception if something went wrong during creating object of connection.
	 * @throws ConnectionException
	 */
	private final void initializeConnection() throws ConnectionException {
		if( Details.UNIQUE_KEY != null ) {
			this.client = new SteamWebApiClient.SteamWebApiClientBuilder( Details.UNIQUE_KEY ).build();
		} else {
			throw new ConnectionException( ExceptionType.API_KEY );
		}
	}
	/**
	 * Gets logger object.
	 * @return LoggerService
	 */
	protected LoggerService getLogger() {
		return logger;
	}
	/**
	 * Method to gets current client using in current app.
	 * @return client
	 * @throws ConnectionException 
	 */
	protected SteamWebApiClient getClient() throws ConnectionException {
		if( this.client != null ) {
			return client;
		} else {
			throw new ConnectionException( ExceptionType.CLIENT_IS_NULL );
		}
	}	
	/**
	 * Method to set request process for actions from SteamWebApi.
	 * @throws SteamApiException
	 * @throws ConnectionException 
	 */
	protected abstract void setRequestProcess() throws SteamApiException, ConnectionException;
	/**
	 * Method to get specific request.
	 * @return ConnectionException
	 */
	public abstract SteamWebApiRequest getRequest() throws ConnectionException;
	/**
	 * Method to get specific object of required response type to further actions.
	 * @return T as specific object of current request to further actions
	 * @throws ConnectionException 
	 */
	public abstract < T > T getResult() throws ConnectionException;
}