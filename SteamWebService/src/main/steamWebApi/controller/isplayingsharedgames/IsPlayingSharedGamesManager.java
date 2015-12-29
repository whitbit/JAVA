package controller.isplayingsharedgames;

import com.lukaspradel.steamapi.data.json.isplayingsharedgame.IsPlayingSharedGame;
import com.lukaspradel.steamapi.data.json.isplayingsharedgame.Response;
import com.lukaspradel.steamapi.webapi.request.IsPlayingSharedGameRequest;
import model.isplayingsharedgame.IsPlayingSharedGameOfUser;
/**
 * Class using for actions on shared playing games from SteamWebApi.
 * @author M.Mucha
 */
public class IsPlayingSharedGamesManager {
	private IsPlayingSharedGameOfUser isPlayingSharedGamesOfUser;

	public IsPlayingSharedGamesManager( String steamID, int appID ) {
		setIsPlayingSharedGamesOfUser( steamID, appID );
	}

	/**
	 * Method to gets model of shared playing games.
	 * @return
	 */
	public IsPlayingSharedGameOfUser getIsPlayingSharedGamesOfUser() {
		return isPlayingSharedGamesOfUser;
	}
	/**
	 * Method to sets model of shared playing games with specific steam id and app id.
	 * @param steamID
	 * @param appID
	 */
	public void setIsPlayingSharedGamesOfUser( String steamID, int appID ) {
		this.isPlayingSharedGamesOfUser = new IsPlayingSharedGameOfUser( steamID, appID );
	}
	/**
	 * Method to gets shared playing games of user from request.
	 * @return
	 */
	public IsPlayingSharedGameRequest getRequest() {
		return getIsPlayingSharedGamesOfUser().getRequest();
	}
	/**
	 * Method to gets shared playing games of user from request.
	 * @return
	 */
	public IsPlayingSharedGame getIsPlayingSharedGames() {
		return getIsPlayingSharedGamesOfUser().getResult();
	}
	/**
	 * Method to gets response of shared playing games request.
	 * @return
	 */
	public Response getSharedGames() {
		return getIsPlayingSharedGames().getResponse();
	}	
	/**
	 * Method to gets lender of shared playing games.
	 * @return
	 */
	public String getLenderSteamID() {
		return getSharedGames().getLenderSteamid();
	}
}