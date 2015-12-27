package model.userstatsforgame;

import com.lukaspradel.steamapi.data.json.playerstats.Playerstats;

import model.base.api.SteamWebApiBaseInterface;
import model.exception.connection.ConnectionException;
/**
 * Using for stats for game to get special object of stats for game to further actions.
 * @author M.Mucha
 */
public interface ISteamStatsForGame extends SteamWebApiBaseInterface {
	/**
	 * Get player stats for game.
	 * @return Playerstats
	 * @throws ConnectionException 
	 */
	public Playerstats getPlayerStats() throws ConnectionException;
}