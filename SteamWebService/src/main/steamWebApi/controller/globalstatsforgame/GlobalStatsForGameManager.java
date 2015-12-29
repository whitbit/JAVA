package controller.globalstatsforgame;

import java.util.List;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.GetGlobalStatsForGame;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Globalstats;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Response;
import com.lukaspradel.steamapi.webapi.request.GetGlobalStatsForGameRequest;
import model.globalstatsforgame.GlobalStatsOfGame;
/**
 * Class using for actions on global stats for game from SteamWebApi.
 * @author M.Mucha
 */
public class GlobalStatsForGameManager {
	private GlobalStatsOfGame globalStatsOfGame;

	public GlobalStatsForGameManager( int appID, int count, List< String > achievementNames ) {
		setGlobalStatsOfGame( appID, count, achievementNames );
	}

	/**
	 * Method to gets model of global stats for game.
	 * @return
	 */
	public GlobalStatsOfGame getGlobalStatsOfGame() {
		return globalStatsOfGame;
	}
	/**
	 * Method to sets model of global stats for game with specific app id, count and name of achievement.
	 * @param appID
	 * @param count
	 * @param achievementNames
	 */
	public void setGlobalStatsOfGame( int appID, int count, List< String > achievementNames ) {
		this.globalStatsOfGame = new GlobalStatsOfGame( appID, count, achievementNames );
	}
	/**
	 * Method to gets global stats for game from request.
	 * @return
	 */
	public GetGlobalStatsForGameRequest getRequest() {
		return getGlobalStatsOfGame().getRequest();
	}
	/**
	 * Method to gets global stats for game from request.
	 * @return
	 */
	public GetGlobalStatsForGame getNewsForApp() {
		return getGlobalStatsOfGame().getResult();
	}
	/**
	 * Method to gets list of global stats for game from request.
	 * @return
	 */
	public Response getGlobalStatsForGameResponse() {
		return getNewsForApp().getResponse();
	}
	/**
	 * Method to gets list of global stats for game from request.
	 * @return
	 */
	public Globalstats getGlobalstats() {
		return getGlobalStatsForGameResponse().getGlobalstats();
	}
}