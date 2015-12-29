package controller.schemaforgame;

import java.util.List;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Achievement;
import com.lukaspradel.steamapi.data.json.getschemaforgame.AvailableGameStats;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Game;
import com.lukaspradel.steamapi.data.json.getschemaforgame.GetSchemaForGame;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Stat;
import com.lukaspradel.steamapi.webapi.request.GetSchemaForGameRequest;
import model.schemaforgame.SchemaOfGame;
/**
 * Class using for actions on game schema from SteamWebApi.
 * @author M.Mucha
 */
public class SchemaForGameManager {
	private SchemaOfGame schemaOfGame;

	public SchemaForGameManager( int appID ) {
		setSchemaOfGame( appID );
	}
	
	/**
	 * Method to gets model of game schema.
	 * @return
	 */
	public SchemaOfGame getSchemaOfGame() {
		return schemaOfGame;
	}
	/**
	 * Method to sets model of game schema with specific app id.
	 * @param appID
	 */
	public void setSchemaOfGame( int appID ) {
		this.schemaOfGame = new SchemaOfGame( appID );
	}
	/**
	 * Method to gets game schema from request.
	 * @return
	 */
	public GetSchemaForGameRequest getRequest() {
		return getSchemaOfGame().getRequest();
	}	
	/**
	 * Method to gets game schema from request.
	 * @return
	 */
	public GetSchemaForGame getSchemaForGame() {
		return getSchemaOfGame().getResult();
	}
	/**
	 * Method to gets game schema from request.
	 * @return
	 */
	public Game getGameSchema() {
		return getSchemaForGame().getGame();
	}
	/**
	 * Method to gets available game stats of game schema from request.
	 * @return
	 */
	public AvailableGameStats getAvailableGameStats() {
		return getGameSchema().getAvailableGameStats();
	}
	/**
	 * Method to gets game achievements of game schema list.
	 * @return
	 */
	public List< Achievement > getAchievementsOfGame() {
		return getAvailableGameStats().getAchievements();
	}
	/**
	 * Method to gets game stats of game schema list.
	 * @return
	 */
	public List< Stat > getStatsOfGame() {
		return getAvailableGameStats().getStats();
	}
}