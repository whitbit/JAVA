package controller.playerachievements;

import java.util.List;

import com.lukaspradel.steamapi.data.json.playerachievements.Achievement;
import com.lukaspradel.steamapi.data.json.playerachievements.GetPlayerAchievements;
import com.lukaspradel.steamapi.data.json.playerachievements.Playerstats;
import com.lukaspradel.steamapi.webapi.request.GetPlayerAchievementsRequest;

import model.exception.connection.ConnectionException;
import model.playerachievements.AchievementsOfUser;
import model.playerachievements.ISteamPlayerAchievements;
import controller.base.BuildController;
/**
 * Class using for actions on player achievements from SteamWebApi.
 * @author M.Mucha
 */
public class PlayerAchievementsControl extends BuildController {
	private static ISteamPlayerAchievements statsForGameOfUser;

	public PlayerAchievementsControl() {}
	private PlayerAchievementsControl( Builder builder ) {
		statsForGameOfUser = builder.initialize();
	}
	
	/**
	 * Builder using to build object of player achievements controller to further actions.
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
		public Builder setLanguage( String language ) {
			this.language = language;
			return this;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamPlayerAchievements initialize() {
			if( language == null ) {
				return new AchievementsOfUser( this.getSteamID(), this.appID );
			} else {
				return new AchievementsOfUser( this.getSteamID(), this.appID, this.language );
			}
		}	
		@SuppressWarnings("unchecked")
		@Override
		public PlayerAchievementsControl build() {
			return new PlayerAchievementsControl( this );
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public AchievementsOfUser getBasicModel() {
		return statsForGameOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerAchievementsRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerAchievements getResult() {
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
	 * Method to gets player achievements list.
	 * @return List< Achievement >
	 */
	public List< Achievement > getAchievementsList() {
		return getPlayerstatsObject().getAchievements();
	}
}