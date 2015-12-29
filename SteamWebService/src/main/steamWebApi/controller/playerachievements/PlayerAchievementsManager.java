package controller.playerachievements;

import java.util.List;

import com.lukaspradel.steamapi.data.json.playerachievements.Achievement;
import com.lukaspradel.steamapi.data.json.playerachievements.GetPlayerAchievements;
import com.lukaspradel.steamapi.data.json.playerachievements.Playerstats;
import com.lukaspradel.steamapi.webapi.request.GetPlayerAchievementsRequest;

import model.playerachievements.AchievementsOfUser;
/**
 * Class using for actions on player achievements from SteamWebApi.
 * @author M.Mucha
 */
public class PlayerAchievementsManager {
	private AchievementsOfUser achievementsOfUser;

	public PlayerAchievementsManager( String steamID, int appID ) {
		setAchievementsOfUser( steamID, appID );
	}
	public PlayerAchievementsManager( String steamID, int appID, String language ) {
		setAchievementsOfUser( steamID, appID, language );
	}

	/**
	 * Method to gets model of player achievements.
	 * @return
	 */
	public AchievementsOfUser getAchievementsOfUser() {
		return achievementsOfUser;
	}
	/**
	 * Method to sets model of player achievements with specific steam id and app id.
	 * @param steamID
	 * @param appID
	 */
	public void setAchievementsOfUser( String steamID, int appID ) {
		this.achievementsOfUser = new AchievementsOfUser( steamID, appID );
	}
	/**
	 * Method to sets model of player achievements with specific steam id and app id.
	 * @param steamID
	 * @param appID
	 * @param language
	 */
	public void setAchievementsOfUser( String steamID, int appID, String language ) {
		this.achievementsOfUser = new AchievementsOfUser( steamID, appID, language );
	}
	/**
	 * Method to gets player achievements of user from request.
	 * @return
	 */
	public GetPlayerAchievementsRequest getRequest() {
		return getAchievementsOfUser().getRequest();
	}
	/**
	 * Method to gets player achievements of user from request.
	 * @return
	 */
	public GetPlayerAchievements getPlayerAchievements() {
		return getAchievementsOfUser().getResult();
	}
	/**
	 * Method to gets player achievements from request.
	 * @return
	 */
	public Playerstats getListOfPlayerAchievements() {
		return getAchievementsOfUser().getPlayerStats();
	}
	/**
	 * Method to gets player achievements list.
	 * @return
	 */
	public List< Achievement > getAchievements() {
		return getListOfPlayerAchievements().getAchievements();
	}
}