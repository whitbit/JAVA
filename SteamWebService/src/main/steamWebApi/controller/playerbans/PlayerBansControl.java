package controller.playerbans;

import java.util.List;
import com.lukaspradel.steamapi.data.json.getplayerbans.GetPlayerBans;
import com.lukaspradel.steamapi.data.json.getplayerbans.Player;
import com.lukaspradel.steamapi.webapi.request.GetPlayerBansRequest;
import model.exception.connection.ConnectionException;
import model.playerbans.BansOfUser;
import model.playerbans.ISteamBans;
import controller.base.BuildController;
/**
 * Class using for actions on player bans from SteamWebApi.
 * @author M.Mucha
 */
public class PlayerBansControl extends BuildController {
	private static ISteamBans bansOfUser;
	
	public PlayerBansControl() {}
	private PlayerBansControl( Builder builder ) {
		bansOfUser = builder.initialize();
	}

	/**
	 * Builder using to build object of player bans controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BuildController.BaseBuilderWithSteamIDList {	
		public Builder( List< String > steamIDs ) {
			super( steamIDs );
		}
		public Builder( String... steamIDsParams ) {
			super( steamIDsParams );
		}
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamBans initialize() {
			return new BansOfUser( this.getSteamIDsList() );
		}	
		@SuppressWarnings("unchecked")
		@Override
		public PlayerBansControl build() {
			return new PlayerBansControl( this );
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public BansOfUser getBasicModel() {
		return bansOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerBansRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerBans getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	/**
	 * Method to gets player bans object from request to further actions.
	 * @return GetPlayerBans
	 */
	public GetPlayerBans getPlayerBansObject() {
		return getBasicModel().getPlayerBans();
	}
	
	/**
	 * Method to gets player bans list.
	 * @return List< Player >
	 */
	public List< Player > getPlayerBansList() {
		return getPlayerBansObject().getPlayers();
	}
}