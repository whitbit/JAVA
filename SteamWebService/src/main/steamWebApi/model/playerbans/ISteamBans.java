package model.playerbans;

import com.lukaspradel.steamapi.data.json.getplayerbans.GetPlayerBans;
import model.base.api.SteamWebApiBaseInterface;
/**
 * Using for bans of user to get special object of bans of user to further actions.
 * @author M.Mucha
 */
public interface ISteamBans extends SteamWebApiBaseInterface {
	/**
	 * Gets bans of user.
	 * @return GetPlayerBans
	 */
	public GetPlayerBans getPlayerBans();
}