package model.playerachievements;

import com.lukaspradel.steamapi.data.json.playerachievements.Playerstats;

import model.base.api.SteamWebApiBaseInterface;
import model.exception.connection.ConnectionException;
/**
 * Using for player achievements to get special object of player achievements to further actions.
 * @author M.Mucha
 */
public interface ISteamPlayerAchievements extends SteamWebApiBaseInterface {
	/**
	 * Get player stats.
	 * @return Playerstats
	 * @throws ConnectionException 
	 */
	public Playerstats getPlayerStats() throws ConnectionException;
}