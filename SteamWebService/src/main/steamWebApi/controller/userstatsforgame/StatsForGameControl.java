package controller.userstatsforgame;

import java.util.List;
import com.lukaspradel.steamapi.data.json.playerstats.Achievement;
import com.lukaspradel.steamapi.data.json.playerstats.GetUserStatsForGame;
import com.lukaspradel.steamapi.data.json.playerstats.Playerstats;
import com.lukaspradel.steamapi.data.json.playerstats.Stat;
import com.lukaspradel.steamapi.webapi.request.GetUserStatsForGameRequest;
import model.base.language.Language;
import model.exception.connection.ConnectionException;
import model.userstatsforgame.ISteamStatsForGame;
import model.userstatsforgame.StatsForGameOfUser;
import controller.base.BuildController;
/**
 * Class using for actions on stats for games from SteamWebApi.
 * @author M.Mucha
 */
public class StatsForGameControl extends BuildController {
	private static ISteamStatsForGame statsForGameOfUser;

	public StatsForGameControl() {}
	private StatsForGameControl( Builder builder ) {
		statsForGameOfUser = builder.initialize();
	}

	/**
	 * Builder using to build object of stats for games controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BuildController.BaseBuilderWithSteamID {	
		private int appID;
		private String language = null;
		public Builder( String steamID ) {
			super( steamID );
		}
		/**
		 * Sets id of app to show.
		 * @param appID
		 * @return Builder
		 */
		public Builder setAppID( int appID ) {
			this.appID = appID;
			return this;
		}
		/**
		 * Sets language of results.
		 * @param language
		 * @return Builder
		 */
		public Builder setLanguage( Language language ) {
			this.language = language.getName();
			return this;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamStatsForGame initialize() {
			if( this.language == null ) {
				return new StatsForGameOfUser( this.getSteamID(), this.appID );
			} else {
				return new StatsForGameOfUser( this.getSteamID(), this.appID, this.language );
			}
		}	
		@SuppressWarnings("unchecked")
		@Override
		public StatsForGameControl build() {
			return new StatsForGameControl( this );
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public StatsForGameOfUser getBasicModel() {
		return statsForGameOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetUserStatsForGameRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetUserStatsForGame getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	/**
	 * Method to gets player stats object from request to further actions.
	 * @return Playerstats
	 */
	public Playerstats getPlayerstatsObject() {
		try {
			return getBasicModel().getPlayerStats();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	/**
	 * Method to gets achievements list.
	 * @return List< Achievement >
	 */
	public List< Achievement > getAchievementsList() {
		return getPlayerstatsObject().getAchievements();
	}
	
	/**
	 * Method to gets stats list.
	 * @return List< Stat >
	 */
	public List< Stat > getStatsList() {
		return getPlayerstatsObject().getStats();
	}
}