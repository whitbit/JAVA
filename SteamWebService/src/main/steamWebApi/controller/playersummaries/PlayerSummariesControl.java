package controller.playersummaries;

import java.util.List;
import com.lukaspradel.steamapi.data.json.playersummaries.GetPlayerSummaries;
import com.lukaspradel.steamapi.data.json.playersummaries.Player;
import com.lukaspradel.steamapi.data.json.playersummaries.Response;
import com.lukaspradel.steamapi.webapi.request.GetPlayerSummariesRequest;
import model.exception.connection.ConnectionException;
import model.playersummaries.ISteamSummariesOfUser;
import model.playersummaries.SummariesOfUser;
import controller.base.BuildController;
import controller.base.BuildWithResponseController;
/**
 * Class using for actions on player summaries from SteamWebApi.
 * @author M.Mucha
 */
public class PlayerSummariesControl extends BuildWithResponseController {
	private static ISteamSummariesOfUser summariesOfUser;

	public PlayerSummariesControl() {}
	private PlayerSummariesControl( Builder builder ) {
		summariesOfUser = builder.initialize();
	}

	/**
	 * Builder using to build object of player summaries controller to further actions.
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
		protected ISteamSummariesOfUser initialize() {
			return new SummariesOfUser( this.getSteamIDsList() );
		}	
		@SuppressWarnings("unchecked")
		@Override
		public PlayerSummariesControl build() {
			return new PlayerSummariesControl( this );
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public SummariesOfUser getBasicModel() {
		return summariesOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerSummariesRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetPlayerSummaries getResult() {
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
	 * Method to gets player summaries list.
	 * @return List< Player >
	 */
	public List< Player > getPlayerSummaryList() {
		return getResponse().getPlayers();
	}
}