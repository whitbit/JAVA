package controller.friends;

import java.util.List;

import com.lukaspradel.steamapi.data.json.friendslist.Friend;
import com.lukaspradel.steamapi.data.json.friendslist.Friendslist;
import com.lukaspradel.steamapi.data.json.friendslist.GetFriendList;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest.Relationship;

import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
import model.friends.FriendsOfUser;
import model.friends.ISteamFriends;
/**
 * Class using for actions on friends from SteamWebApi.
 * @author M.Mucha
 */
public class FriendsManager {
	private ISteamFriends friendsOfUser;
	
	public FriendsManager( String steamID ) {
		setFriendsOfUser( steamID );
	}
	public FriendsManager( String steamID, Relationship relationship ) {
		setFriendsOfUser( steamID, relationship );
	}

	/**
	 * Method to sets model of friend with specific steam id.
	 * @param steamID
	 */
	private void setFriendsOfUser( String steamID ) {
		this.friendsOfUser = new FriendsOfUser( steamID );
	}
	/**
	 * Method to sets model of friend with specific steam id.
	 * @param steamID
	 */
	private void setFriendsOfUser( String steamID, Relationship relationship ) {
		this.friendsOfUser = new FriendsOfUser( steamID, relationship );
	}
	
	/**
	 * Method to gets model of friends.
	 * @return friendsOfUser
	 */
	public FriendsOfUser getFriendsOfUser() {
		return friendsOfUser.getModel();
	}
	/**
	 * Method to gets request of friends.
	 * @return GetFriendListRequest
	 */
	public GetFriendListRequest getRequest() {
		try {
			return getFriendsOfUser().getRequest();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	/**
	 * Method to gets resulted friends from request.
	 * @return
	 */
	public GetFriendList getFriendsResult() {
		try {
			return getFriendsOfUser().getResult();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * Method to gets friends list object from specific request.
	 * @return Friendslist
	 */
	public Friendslist getFriendsList() {
		try {
			return getFriendsOfUser().getFriends();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * Method to gets full list of friends.
	 * @return List< Friend >
	 */
	public List< Friend > getFriends() {
		return getFriendsList().getFriends();
	}
	/**
	 * Method to gets count of friends.
	 * @return Count of friends
	 */
	public int getFriendsCount() {
		return getFriends().size();
	}
	/**
	 * Method to gets relationship.
	 * @return Count of friends
	 */
	public Relationship getRelationship() {
		try {
			return getFriendsOfUser().getRelationShip();
		} catch (WrongValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}