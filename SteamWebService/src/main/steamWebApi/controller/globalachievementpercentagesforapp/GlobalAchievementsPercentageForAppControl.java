package controller.globalachievementpercentagesforapp;

import java.util.List;
import com.lukaspradel.steamapi.data.json.achievementpercentages.Achievement;
import com.lukaspradel.steamapi.data.json.achievementpercentages.Achievementpercentages;
import com.lukaspradel.steamapi.data.json.achievementpercentages.GetGlobalAchievementPercentagesForApp;
import com.lukaspradel.steamapi.webapi.request.GetGlobalAchievementPercentagesForAppRequest;
import model.exception.connection.ConnectionException;
import model.globalachievementpercentagesforapp.GlobalAchievementPercentagesOfApp;
import model.globalachievementpercentagesforapp.ISteamGlobalAchievementsPercentages;
import controller.base.BuildController;
/**
 * Class using for actions on global achievement percentages of app from SteamWebApi.
 * @author M.Mucha
 */
public class GlobalAchievementsPercentageForAppControl extends BuildController {
	private static ISteamGlobalAchievementsPercentages globalAchievementPercentagesOfApp = null;

	public GlobalAchievementsPercentageForAppControl() {}
	private GlobalAchievementsPercentageForAppControl( Builder builder ) {
		globalAchievementPercentagesOfApp = builder.initialize();
	}
	
	/**
	 * Builder using to build object of global achievements percentages controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BuildController.BaseBuilderWithAppID {	
		public Builder( int appID ) {
			super( appID );
		}
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamGlobalAchievementsPercentages initialize() {
			return new GlobalAchievementPercentagesOfApp( this.getAppID() );
		}	
		@SuppressWarnings("unchecked")
		@Override
		public GlobalAchievementsPercentageForAppControl build() {
			return new GlobalAchievementsPercentageForAppControl( this );
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GlobalAchievementPercentagesOfApp getBasicModel() {
		return globalAchievementPercentagesOfApp.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetGlobalAchievementPercentagesForAppRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetGlobalAchievementPercentagesForApp getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	/**
	 * Method to gets list of global achievement percentages from request to further actions.
	 * @return Achievementpercentages
	 */
	public Achievementpercentages getGlobalAchievementsPercentagesObject() {
		return getResult().getAchievementpercentages();
	}
	
	/**
	 * Method to gets global achievements percentages list.
	 * @return List< Achievement >
	 */
	public List< Achievement > getGlobalAchievementPercentagesList() {
		return getGlobalAchievementsPercentagesObject().getAchievements();
	}
}