package controller.ownedgames;

import java.util.List;

import com.lukaspradel.steamapi.data.json.ownedgames.Game;
import com.lukaspradel.steamapi.data.json.ownedgames.GetOwnedGames;
import com.lukaspradel.steamapi.data.json.ownedgames.Response;
import com.lukaspradel.steamapi.webapi.request.GetOwnedGamesRequest;

import model.ownedgames.OwnedGamesOfUser;
/**
 * Class using for actions on owned games from SteamWebApi.
 * @author M.Mucha
 */
public class OwnedGamesManager {
	private OwnedGamesOfUser ownedGamesOfUser;

	public OwnedGamesManager( String steamID ) {
		setOwnedGamesOfUser( steamID );
	}
	public OwnedGamesManager( String steamID, boolean includeAppInfo, boolean includePlayedFreeGames ) {
		setOwnedGamesOfUser( steamID, includeAppInfo, includePlayedFreeGames );
	}

	/**
	 * Method to gets model of owned games.
	 * @return
	 */
	public OwnedGamesOfUser getOwnedGamesOfUser() {
		return ownedGamesOfUser;
	}
	/**
	 * Method to sets model of owned games with specific steam id.
	 * @param steamID
	 */
	public void setOwnedGamesOfUser( String steamID ) {
		this.ownedGamesOfUser = new OwnedGamesOfUser( steamID );
	}	
	/**
	 * Method to sets model of owned games with specific steam id included specific informations about games..
	 * @param steamID
	 */
	public void setOwnedGamesOfUser( String steamID, boolean includeAppInfo, boolean includePlayedFreeGames ) {
		this.ownedGamesOfUser = new OwnedGamesOfUser( steamID, includeAppInfo, includePlayedFreeGames );
	}	
	/**
	 * Method to gets owned games from request.
	 * @return
	 */
	public GetOwnedGamesRequest getRequest() {
		return getOwnedGamesOfUser().getRequest();
	}
	/**
	 * Method to gets owned games from request.
	 * @return
	 */
	public GetOwnedGames getOwnedGames() {
		return getOwnedGamesOfUser().getResult();
	}
	/**
	 * Method to gets response of owned game request.
	 * @return
	 */
	public Response getListOfGames() {
		return getOwnedGames().getResponse();
	}
	/**
	 * Method to gets owned games list.
	 * @return
	 */
	public List< Game > getGamesList() {
		return getListOfGames().getGames();
	}
	/**
	 * Method to gets count of owned games.
	 * @return
	 */
	public int getGamesCount() {
		return getListOfGames().getGameCount();
	}
}