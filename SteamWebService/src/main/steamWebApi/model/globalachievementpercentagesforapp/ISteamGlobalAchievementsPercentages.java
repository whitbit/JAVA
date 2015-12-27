package model.globalachievementpercentagesforapp;

import com.lukaspradel.steamapi.data.json.achievementpercentages.Achievementpercentages;

import model.base.api.SteamWebApiBaseInterface;
import model.exception.connection.ConnectionException;
/**
 * Using for global achievements percentages to get special object of global achievements to further actions.
 * @author M.Mucha
 */
public interface ISteamGlobalAchievementsPercentages extends SteamWebApiBaseInterface {
	/**
	 * Get global achievements percentages.
	 * @return Achievementpercentages
	 * @throws ConnectionException 
	 */
	public Achievementpercentages getGlobalAchievementsPercentages() throws ConnectionException;
}