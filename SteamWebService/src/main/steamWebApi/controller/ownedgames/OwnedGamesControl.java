package controller.ownedgames;

import java.util.List;
import com.lukaspradel.steamapi.data.json.ownedgames.Game;
import com.lukaspradel.steamapi.data.json.ownedgames.GetOwnedGames;
import com.lukaspradel.steamapi.data.json.ownedgames.Response;
import com.lukaspradel.steamapi.webapi.request.GetOwnedGamesRequest;
import model.exception.connection.ConnectionException;
import model.ownedgames.ISteamOwnedGames;
import model.ownedgames.OwnedGamesOfUser;
import controller.base.BuildWithResponseController;
/**
 * Class using for actions on owned games from SteamWebApi.
 * @author M.Mucha
 */
public class OwnedGamesControl extends BuildWithResponseController {
	private ISteamOwnedGames ownedGamesOfUser;

	public OwnedGamesControl() {}
	private OwnedGamesControl( Builder builder ) {
		this.ownedGamesOfUser = builder.initialize();
	}

	/**
	 * Builder using to build object of owned games controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BaseBuilderWithSteamID {	
		private boolean includeAppInfo = true;
		private boolean includePlayedFreeGames = false;	
		public Builder( String steamID ) {
			super( steamID );
		}
		/**
		 * Sets true if you want include informations about app.
		 * @param includeAppInfo
		 * @return Builder
		 */
		public Builder setIncludeAppInfo( boolean includeAppInfo ) {
			this.includeAppInfo = includeAppInfo;
			return this;
		}
		/**
		 * Set true if you want include free played games.
		 * @param includePlayedFreeGames
		 * @return Builder
		 */
		public Builder setIncludePlayedFreeGames( boolean includePlayedFreeGames ) {
			this.includePlayedFreeGames = includePlayedFreeGames;
			return this;
		}	
		
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamOwnedGames initialize() {
			if( this.includeAppInfo == true && this.includePlayedFreeGames == false ) {
				return new OwnedGamesOfUser( this.getSteamID() );
			} else {
				return new OwnedGamesOfUser( this.getSteamID(), this.includeAppInfo, this.includePlayedFreeGames );
			}
		}	
		@SuppressWarnings("unchecked")
		@Override
		public OwnedGamesControl build() {
			return new OwnedGamesControl( this );
		}
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public OwnedGamesOfUser getBasicModel() {
		return ownedGamesOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetOwnedGamesRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetOwnedGames getResult() {
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
	 * Method to gets owned games list.
	 * @return List< Game >
	 */
	public List< Game > getGamesList() {
		return getResponse().getGames();
	}
	
	/**
	 * Method to gets count of owned games.
	 * @return GamesCount
	 */
	public int getGamesCount() {
		return getResponse().getGameCount();
	}
}