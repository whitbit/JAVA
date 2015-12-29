package controller.playersummaries;

import java.util.List;
import com.lukaspradel.steamapi.data.json.playersummaries.GetPlayerSummaries;
import com.lukaspradel.steamapi.data.json.playersummaries.Player;
import com.lukaspradel.steamapi.data.json.playersummaries.Response;
import com.lukaspradel.steamapi.webapi.request.GetPlayerSummariesRequest;
import model.playersummaries.SummariesOfUser;
/**
 * Class using for actions on player summaries from SteamWebApi.
 * @author M.Mucha
 */
public class PlayerSummariesManager {
	private SummariesOfUser summariesOfUser;

	public PlayerSummariesManager( List< String > steamIDs ) {
		setSummariesOfUser( steamIDs );
	}

	/**
	 * Method to gets model of player summaries.
	 * @return
	 */
	public SummariesOfUser getSummariesOfUser() {
		return summariesOfUser;
	}
	/**
	 * Method to sets model of player summaries with specific steam id.
	 * @param steamIDs
	 */
	public void setSummariesOfUser( List< String > steamIDs ) {
		this.summariesOfUser = new SummariesOfUser( steamIDs );
	}
	/**
	 * Method to gets player summaries from request.
	 * @return
	 */
	public GetPlayerSummariesRequest getRequest() {
		return getSummariesOfUser().getRequest();
	}
	/**
	 * Method to gets player summaries from request.
	 * @return
	 */
	public GetPlayerSummaries getPlayerSummaries() {
		return getSummariesOfUser().getResult();
	}
	/**
	 * Method to gets response of player summaries request.
	 * @return
	 */
	public Response getListOfPlayerSummaries() {
		return getPlayerSummaries().getResponse();
	}
	/**
	 * Method to gets player summaries list.
	 * @return
	 */
	public List< Player > getPlayerSummary() {
		return getListOfPlayerSummaries().getPlayers();
	}
}