package controller.isplayingsharedgames;

import com.lukaspradel.steamapi.data.json.isplayingsharedgame.IsPlayingSharedGame;
import com.lukaspradel.steamapi.data.json.isplayingsharedgame.Response;
import com.lukaspradel.steamapi.webapi.request.IsPlayingSharedGameRequest;
import model.exception.connection.ConnectionException;
import model.isplayingsharedgame.ISteamSharedGames;
import model.isplayingsharedgame.IsPlayingSharedGameOfUser;
import controller.base.BuildWithResponseController;
/**
 * Class using for actions on shared playing games from SteamWebApi.
 * @author M.Mucha
 */
public class IsPlayingSharedGamesControl extends BuildWithResponseController {
	private ISteamSharedGames isPlayingSharedGamesOfUser;

	public IsPlayingSharedGamesControl() {}
	private IsPlayingSharedGamesControl( Builder builder ) {
		isPlayingSharedGamesOfUser = builder.initialize();
	}

	/**
	 * Builder using to build object of shared playing games controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BaseBuilderWithSteamID {	
		private int appID;	
		public Builder( String steamID ) {
			super( steamID );
		}
		/**
		 * Sets app id of shared game.
		 * @param appID
		 */
		public Builder setAppID( int appID ) {
			this.appID = appID;
			return this;
		}
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamSharedGames initialize() {
			return new IsPlayingSharedGameOfUser( this.getSteamID(), this.appID );
		}	
		@SuppressWarnings("unchecked")
		@Override
		public IsPlayingSharedGamesControl build() {
			return new IsPlayingSharedGamesControl( this );
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IsPlayingSharedGameOfUser getBasicModel() {
		return isPlayingSharedGamesOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IsPlayingSharedGameRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IsPlayingSharedGame getResult() {
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
	 * Method to gets lender of shared playing games.
	 * @return LenderSteamID
	 */
	public String getLenderSteamID() {
		return getResponse().getLenderSteamid();
	}
}