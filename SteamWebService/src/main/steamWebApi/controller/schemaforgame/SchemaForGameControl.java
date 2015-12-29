package controller.schemaforgame;

import java.util.List;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Achievement;
import com.lukaspradel.steamapi.data.json.getschemaforgame.AvailableGameStats;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Game;
import com.lukaspradel.steamapi.data.json.getschemaforgame.GetSchemaForGame;
import com.lukaspradel.steamapi.data.json.getschemaforgame.Stat;
import com.lukaspradel.steamapi.webapi.request.GetSchemaForGameRequest;
import model.exception.connection.ConnectionException;
import model.schemaforgame.ISteamSchemaForGame;
import model.schemaforgame.SchemaOfGame;
import controller.base.BuildController;
/**
 * Class using for actions on game schema from SteamWebApi.
 * @author M.Mucha
 */
public class SchemaForGameControl extends BuildController {
	private static ISteamSchemaForGame schemaOfGame;

	public SchemaForGameControl() {}
	private SchemaForGameControl( Builder builder ) {
		schemaOfGame = builder.initialize();
	}

	/**
	 * Builder using to build object of game schema controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BuildController.BaseBuilderWithAppID {	
		public Builder( int appID ) {
			super( appID );
		}
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamSchemaForGame initialize() {
			return new SchemaOfGame( this.getAppID() );
		}	
		@SuppressWarnings("unchecked")
		@Override
		public SchemaForGameControl build() {
			return new SchemaForGameControl( this );
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public SchemaOfGame getBasicModel() {
		return schemaOfGame.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetSchemaForGameRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetSchemaForGame getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	/**
	 * Method to gets game schema from request.
	 * @return Game
	 */
	public Game getGameSchema() {
		return getResult().getGame();
	}
	
	/**
	 * Method to gets available game stats object of game schema from request.
	 * @return AvailableGameStats
	 */
	public AvailableGameStats getAvailableGameStatsObject() {
		return getGameSchema().getAvailableGameStats();
	}
	
	/**
	 * Method to gets game achievements of game schema list.
	 * @return List< Achievement >
	 */
	public List< Achievement > getAchievementsList() {
		return getAvailableGameStatsObject().getAchievements();
	}
	
	/**
	 * Method to gets game stats of game schema list.
	 * @return List< Stat > 
	 */
	public List< Stat > getStatsOfGameList() {
		return getAvailableGameStatsObject().getStats();
	}
}