package model.globalachievementpercentagesforapp;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.achievementpercentages.Achievementpercentages;
import com.lukaspradel.steamapi.data.json.achievementpercentages.GetGlobalAchievementPercentagesForApp;
import com.lukaspradel.steamapi.webapi.request.GetGlobalAchievementPercentagesForAppRequest;
import model.base.steamapp.SteamApp;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
/**
 * Base class to connect with global achievement percentages of app from SteamWebApi.
 * @author M.Mucha
 */
public class GlobalAchievementPercentagesOfApp extends SteamApp implements ISteamGlobalAchievementsPercentages {
	private GetGlobalAchievementPercentagesForAppRequest request;
	private GetGlobalAchievementPercentagesForApp globalAchievementPercentagesForApp;

	public GlobalAchievementPercentagesOfApp( int appID ) {
		super( appID );
	}
	
	@Override
	protected void setRequest( int appID ) {
		this.request = new GetGlobalAchievementPercentagesForAppRequest.GetGlobalAchievementPercentagesForAppRequestBuilder( appID ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.globalAchievementPercentagesForApp = getClient().< GetGlobalAchievementPercentagesForApp >processRequest( request );
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
	public GetGlobalAchievementPercentagesForAppRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetGlobalAchievementPercentagesForApp getResult() throws ConnectionException {
		if( globalAchievementPercentagesForApp != null ) {
			return globalAchievementPercentagesForApp;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public GlobalAchievementPercentagesOfApp getModel() {
		return this;
	}
	public Achievementpercentages getGlobalAchievementsPercentages() throws ConnectionException {
		return getResult().getAchievementpercentages();
	}
}