package controller.globalachievementpercentagesforapp;

import java.util.List;
import com.lukaspradel.steamapi.data.json.achievementpercentages.Achievement;
import com.lukaspradel.steamapi.data.json.achievementpercentages.Achievementpercentages;
import com.lukaspradel.steamapi.data.json.achievementpercentages.GetGlobalAchievementPercentagesForApp;
import com.lukaspradel.steamapi.webapi.request.GetGlobalAchievementPercentagesForAppRequest;
import model.globalachievementpercentagesforapp.GlobalAchievementPercentagesOfApp;
/**
 * Class using for actions on global achievement percentages of app from SteamWebApi.
 * @author M.Mucha
 */
public class GlobalAchievementsPercentagesForAppManager {
	private GlobalAchievementPercentagesOfApp globalAchievementPercentagesOfApp;

	public GlobalAchievementsPercentagesForAppManager( int appID ) {
		setGlobalAchievementPercentagesOfApp( appID );
	}
	
	/**
	 * Method to gets model of global achievement percentages of app.
	 * @return
	 */
	public GlobalAchievementPercentagesOfApp getGlobalAchievementPercentagesOfApp() {
		return globalAchievementPercentagesOfApp;
	}
	/**
	 * Method to sets model of global achievement percentages of app with specific app id.
	 * @param appID
	 */
	public void setGlobalAchievementPercentagesOfApp( int appID ) {
		this.globalAchievementPercentagesOfApp = new GlobalAchievementPercentagesOfApp( appID );
	}
	/**
	 * Method to gets global achievement percentages of app from request.
	 * @return
	 */
	public GetGlobalAchievementPercentagesForAppRequest getRequest() {
		return getGlobalAchievementPercentagesOfApp().getRequest();
	}	
	/**
	 * Method to gets global achievement percentages of app from request.
	 * @return
	 */
	public GetGlobalAchievementPercentagesForApp getGlobalAchievementPercentagesForApp() {
		return getGlobalAchievementPercentagesOfApp().getResult();
	}
	/**
	 * Method to gets list of global achievement percentages from request.
	 * @return
	 */
	public Achievementpercentages getListOfGlobalAchievementPercentagesForApp() {
		return getGlobalAchievementPercentagesForApp().getAchievementpercentages();
	}
	/**
	 * Method to gets owned games list.
	 * @return
	 */
	public List< Achievement > getGlobalAchievementPercentagesForAppList() {
		return getListOfGlobalAchievementPercentagesForApp().getAchievements();
	}
}