package controller.recentlyplayedgames;

import java.util.List;

import com.lukaspradel.steamapi.data.json.recentlyplayedgames.Game;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.GetRecentlyPlayedGames;
import com.lukaspradel.steamapi.data.json.recentlyplayedgames.Response;
import com.lukaspradel.steamapi.webapi.request.GetRecentlyPlayedGamesRequest;

import model.recentlyplayedgames.RecentlyPlayedGamesOfUser;
/**
 * Class using for actions on recently played games from SteamWebApi.
 * @author M.Mucha
 */
public class RecentlyPlayedGamesManager {
	private RecentlyPlayedGamesOfUser recentlyPlayedGamesOfUser;
	
	public RecentlyPlayedGamesManager( String steamID ) {
		setRecentlyPlayedGamesOfUser( steamID );
	}
	public RecentlyPlayedGamesManager( String steamID, int count ) {
		setRecentlyPlayedGamesOfUser( steamID, count );
	}

	/**
	 * Method to gets model of recently played games.
	 * @return
	 */
	public RecentlyPlayedGamesOfUser getRecentlyPlayedGamesOfUser() {
		return recentlyPlayedGamesOfUser;
	}
	/**
	 * Method to sets model of recently played games with specific steam id.
	 * @param steamID
	 */
	public void setRecentlyPlayedGamesOfUser( String steamID ) {
		this.recentlyPlayedGamesOfUser = new RecentlyPlayedGamesOfUser( steamID );
	}
	/**
	 * Method to sets model of recently played games with specific steam id and count.
	 * @param steamID
	 */
	public void setRecentlyPlayedGamesOfUser( String steamID, int count ) {
		this.recentlyPlayedGamesOfUser = new RecentlyPlayedGamesOfUser( steamID, count );
	}

	/**
	 * Method to gets recently played games from request.
	 * @return
	 */
	public GetRecentlyPlayedGamesRequest getRequest() {
		return getRecentlyPlayedGamesOfUser().getRequest();
	}
	/**
	 * Method to gets recently played games from request.
	 * @return
	 */
	public GetRecentlyPlayedGames getRecentlyPlayedGames() {
		return getRecentlyPlayedGamesOfUser().getResult();
	}
	/**
	 * Method to gets response of recently played game request.
	 * @return
	 */
	public Response getListOfRecentlyPlayedGames() {
		return getRecentlyPlayedGames().getResponse();
	}
	/**
	 * Method to gets recently played games list.
	 * @return
	 */
	public List< Game > getRecentlyPlayedGamesList() {
		return getListOfRecentlyPlayedGames().getGames();
	}
	/**
	 * Method to gets count of recently played games.
	 * @return
	 */
	public int getRecentlyPlayedGamesCount() {
		return getListOfRecentlyPlayedGames().getTotalCount();
	}
}