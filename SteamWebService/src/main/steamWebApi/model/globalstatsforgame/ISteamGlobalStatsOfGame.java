package model.globalstatsforgame;

import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Globalstats;

import model.base.api.SteamWebApiResponse;
import model.exception.connection.ConnectionException;
/**
 * Using for global stats of game to get special object of global stats to further actions.
 * @author M.Mucha
 */
public interface ISteamGlobalStatsOfGame extends SteamWebApiResponse {
	/**
	 * Get global stats for games.
	 * @return Globalstats
	 * @throws ConnectionException 
	 */
	public Globalstats getGlobalStatsOfGame() throws ConnectionException;
}