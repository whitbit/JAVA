package model.schemaforgame;

import com.lukaspradel.steamapi.data.json.getschemaforgame.AvailableGameStats;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Game;

import model.base.api.SteamWebApiBaseInterface;
import model.exception.connection.ConnectionException;
/**
 * Using for schema for games to get special object of schema for games to further actions.
 * @author M.Mucha
 */
public interface ISteamSchemaForGame extends SteamWebApiBaseInterface {
	/**
	 * Get game of current schema.
	 * @return Game
	 * @throws ConnectionException 
	 */
	public Game getGameFromSchema() throws ConnectionException;
	/**
	 * Get available stats for game schema.
	 * @return AvailableGameStats
	 * @throws ConnectionException 
	 */
	public AvailableGameStats getAvailableGameStats() throws ConnectionException;
}