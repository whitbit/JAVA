package controller.recentlyplayedgames;

import java.util.List;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.Game;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.GetRecentlyPlayedGames;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.Response;
import com.lukaspradel.steamapi.webapi.request.GetRecentlyPlayedGamesRequest;
import model.exception.connection.ConnectionException;
import model.recentlyplayedgames.ISteamRecentlyPlayedGames;
import model.recentlyplayedgames.RecentlyPlayedGamesOfUser;
import controller.base.BuildController;
import controller.base.BuildWithResponseController;
/**
 * Class using for actions on recently played games from SteamWebApi.
 * @author M.Mucha
 */
public class RecentlyPlayedGamesControl extends BuildWithResponseController {
	private ISteamRecentlyPlayedGames recentlyPlayedGamesOfUser;

	public RecentlyPlayedGamesControl() {}
	private RecentlyPlayedGamesControl( Builder builder ) {
		this.recentlyPlayedGamesOfUser = builder.initialize();
	}
	
	/**
	 * Builder using to build object of recently played games controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BuildController.BaseBuilderWithSteamID {	
		private Integer count = null;	
		public Builder( String steamID ) {
			super( steamID );
		}
		/**
		 * Sets count of recently played games.
		 * @param count
		 * @return Builder
		 */
		public Builder setCount( int count ) {
			this.count = count;
			return this;
		}	
		
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamRecentlyPlayedGames initialize() {
			if( this.count == null ) {
				return new RecentlyPlayedGamesOfUser( this.getSteamID() );
			} else {
				return new RecentlyPlayedGamesOfUser( this.getSteamID(), this.count );
			}
		}	
		@SuppressWarnings("unchecked")
		@Override
		public RecentlyPlayedGamesControl build() {
			return new RecentlyPlayedGamesControl( this );
		}
	}	

	@SuppressWarnings("unchecked")
	@Override
	public RecentlyPlayedGamesOfUser getBasicModel() {
		return recentlyPlayedGamesOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetRecentlyPlayedGamesRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetRecentlyPlayedGames getResult() {
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
	 * Method to gets recently played games list.
	 * @return List< Game >
	 */
	public List< Game > getRecentlyPlayedGamesList() {
		return getResponse().getGames();
	}
	
	/**
	 * Method to gets count of recently played games.
	 * @return total count
	 */
	public int getRecentlyPlayedGamesCount() {
		return getResponse().getTotalCount();
	}
}