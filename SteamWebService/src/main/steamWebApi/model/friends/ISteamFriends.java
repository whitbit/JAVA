package model.friends;

import com.lukaspradel.steamapi.data.json.friendslist.Friendslist;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest.Relationship;
import model.base.api.SteamWebApiBaseInterface;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
/**
 * Using for friends to get special object of friends to further actions.
 * @author M.Mucha
 */
public interface ISteamFriends extends SteamWebApiBaseInterface {
	/**
	 * Get special object of friends to further actions.
	 * @return Friendslist
	 * @throws ConnectionException 
	 */
	public Friendslist getFriends() throws ConnectionException;
	/**
	 * Get the relationship type.
	 * @return Relationship
	 * @throws WrongValueException 
	 */
	public Relationship getRelationShip() throws WrongValueException;
}