package controller.globalstatsforgame;

import java.util.List;
import model.exception.connection.ConnectionException;
import model.globalstatsforgame.GlobalStatsOfGame;
import model.globalstatsforgame.ISteamGlobalStatsOfGame;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.GetGlobalStatsForGame;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Globalstats;
import com.lukaspradel.steamapi.data.json.getglobalstatsforgame.Response;
import com.lukaspradel.steamapi.webapi.request.GetGlobalStatsForGameRequest;
import controller.base.BuildWithResponseController;
/**
 * Class using for actions on global stats for game from SteamWebApi.
 * @author M.Mucha
 */
public class GlobalStatsForGameControl extends BuildWithResponseController {
	private static ISteamGlobalStatsOfGame globalStatsOfGame;

	public GlobalStatsForGameControl() {}
	private GlobalStatsForGameControl( Builder builder ) {
		globalStatsOfGame = builder.initialize();
	}

	/**
	 * Builder using to build object of global stats for game controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BaseBuilderWithAppID {	
		private Integer count = null;
		private List< String > achievementNames;
		public Builder( int appID ) {
			super( appID );
		}
		/**
		 * Sets count of global stats for game.
		 * @param count
		 * @return Builder
		 */
		public Builder setCount( int count ) {
			this.count = count;
			return this;
		}
		/**
		 * Sets achievements of global stats for game.
		 * @param achievementNames
		 * @return Builder
		 */
		public Builder setAchievementNames( List< String > achievementNames ) {
			this.achievementNames = achievementNames;
			return this;
		}	
		
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamGlobalStatsOfGame initialize() {
			return new GlobalStatsOfGame( this.getAppID(), this.count, this.achievementNames );
		}	
		@SuppressWarnings("unchecked")
		@Override
		public GlobalStatsForGameControl build() {
			return new GlobalStatsForGameControl( this );
		}
	}	

	@SuppressWarnings("unchecked")
	@Override
	public GlobalStatsOfGame getBasicModel() {
		return globalStatsOfGame.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetGlobalStatsForGameRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetGlobalStatsForGame getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Response getResponse() {
		return getResult().getResponse();
	}
	
	/**
	 * Method to gets list of global stats object for game from request to further actions.
	 * @return Globalstats
	 */
	public Globalstats getGlobalstats() {
		return getResponse().getGlobalstats();
	}
}