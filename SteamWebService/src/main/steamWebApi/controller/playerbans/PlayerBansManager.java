package controller.playerbans;

import java.util.List;
import com.lukaspradel.steamapi.data.json.getplayerbans.GetPlayerBans;
import com.lukaspradel.steamapi.data.json.getplayerbans.Player;
import com.lukaspradel.steamapi.webapi.request.GetPlayerBansRequest;
import model.playerbans.BansOfUser;
/**
 * Class using for actions on player bans from SteamWebApi.
 * @author M.Mucha
 */
public class PlayerBansManager {
	private BansOfUser bansOfUser;
	
	public PlayerBansManager( List< String > steamIDs ) {
		setBansOfUser( steamIDs );
	}
	
	/**
	 * Method to gets model of player bans.
	 * @return
	 */
	public BansOfUser getBansOfUser() {
		return bansOfUser;
	}
	/**
	 * Method to sets model of player bans with specific steam ids.
	 * @param steamIDs
	 */
	public void setBansOfUser( List< String > steamIDs ) {
		this.bansOfUser = new BansOfUser( steamIDs );
	}

	/**
	 * Method to gets player bans from request.
	 * @return
	 */
	public GetPlayerBansRequest getRequest() {
		return getBansOfUser().getRequest();
	}
	/**
	 * Method to gets player bans from request.
	 * @return
	 */
	public GetPlayerBans getListOfPlayerBans() {
		return getBansOfUser().getPlayerBans();
	}
	/**
	 * Method to gets player bans list.
	 * @return
	 */
	public List< Player > getPlayerBans() {
		return getListOfPlayerBans().getPlayers();
	}
}