package controller.userstatsforgame;

import java.util.List;

import com.lukaspradel.steamapi.data.json.playerstats.Achievement;
import com.lukaspradel.steamapi.data.json.playerstats.GetUserStatsForGame;
import com.lukaspradel.steamapi.data.json.playerstats.Playerstats;
import com.lukaspradel.steamapi.data.json.playerstats.Stat;
import com.lukaspradel.steamapi.webapi.request.GetUserStatsForGameRequest;

import model.userstatsforgame.StatsForGameOfUser;
/**
 * Class using for actions on stats for games from SteamWebApi.
 * @author M.Mucha
 */
public class StatsForGameManager {
	private StatsForGameOfUser statsForGameOfUser;

	public StatsForGameManager( String steamID, int appID ) {
		setStatsForGameOfUser( steamID, appID );
	}
	public StatsForGameManager( String steamID, int appID, String language ) {
		setStatsForGameOfUser( steamID, appID, language );
	}

	/**
	 * Method to gets model of stats for game.
	 * @return
	 */
	public StatsForGameOfUser getStatsForGameOfUser() {
		return statsForGameOfUser;
	}
	/**
	 * Method to sets model of stats for game with specific steam id and app id.
	 * @param steamID
	 * @param appID
	 */
	public void setStatsForGameOfUser( String steamID, int appID ) {
		this.statsForGameOfUser = new StatsForGameOfUser( steamID, appID );
	}
	/**
	 * Method to sets model of stats for game with specific steam id and app id with specific language.
	 * @param steamID
	 * @param appID
	 */
	public void setStatsForGameOfUser( String steamID, int appID, String language ) {
		this.statsForGameOfUser = new StatsForGameOfUser( steamID, appID, language );
	}
	/**
	 * Method to gets stats for game of user from request.
	 * @return
	 */
	public GetUserStatsForGameRequest getRequest() {
		return getStatsForGameOfUser().getRequest();
	}
	/**
	 * Method to gets stats for game of user from request.
	 * @return
	 */
	public GetUserStatsForGame getUserStatsForGame() {
		return getStatsForGameOfUser().getResult();
	}
	/**
	 * Method to gets player stats from request.
	 * @return
	 */
	public Playerstats getListOfGames() {
		return getStatsForGameOfUser().getPlayerStats();
	}
	/**
	 * Method to gets achievements list.
	 * @return
	 */
	public List< Achievement > getAchievements() {
		return getListOfGames().getAchievements();
	}	
	/**
	 * Method to gets stats list..
	 * @return
	 */
	public List< Stat > getStats() {
		return getListOfGames().getStats();
	}
}