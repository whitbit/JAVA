package controller.friends;

import java.util.List;
import com.lukaspradel.steamapi.data.json.friendslist.Friend;
import com.lukaspradel.steamapi.data.json.friendslist.Friendslist;
import com.lukaspradel.steamapi.data.json.friendslist.GetFriendList;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest.Relationship;
import controller.base.BuildController;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
import model.friends.FriendsOfUser;
import model.friends.ISteamFriends;
/**
 * Class using for actions on friends from SteamWebApi.
 * @author M.Mucha
 */
public class FriendsControl extends BuildController {
	private static ISteamFriends friendsOfUser = null;

	public FriendsControl() {}
	private FriendsControl( Builder builder ) {
		friendsOfUser = builder.initialize();
	}

	/**
	 * Builder using to build object of friends controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BaseBuilderWithSteamID {	
		private Relationship relationship = null;	
		public Builder( String steamID ) {
			super( steamID );
		}
		/**
		 * Sets current builder with specific relationships to gets.
		 * @param relationship
		 * @return Builder
		 */
		public Builder setRelationship( Relationship relationship ) {
			this.relationship = relationship;
			return this;
		}
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamFriends initialize() {
			if( relationship == null ) {
				return new FriendsOfUser( this.getSteamID() );
			} else {
				return new FriendsOfUser( this.getSteamID(), this.relationship );
			}
		}	
		@SuppressWarnings("unchecked")
		@Override
		public FriendsControl build() {
			return new FriendsControl( this );
		}
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public FriendsOfUser getBasicModel() {
		return friendsOfUser.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetFriendListRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetFriendList getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}

	/**
	 * Method to gets friends list object from specific request to further actions.
	 * @return Friendslist
	 */
	public Friendslist getFriendslistObjectToFurtherActions() {
		try {
			return getBasicModel().getFriends();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	/**
	 * Method to gets full list of friends from Friendslist object.
	 * @return List< Friend >
	 */
	public List< Friend > getFriendsList() {
		return getFriendslistObjectToFurtherActions().getFriends();
	}
	
	/**
	 * Method to gets count of friends.
	 * @return Count of friends
	 */
	public int getFriendsCount() {
		return getFriendsList().size();
	}
	
	/**
	 * Method to gets relationship object.
	 * @return relationship object
	 */
	public Relationship getRelationship() {
		try {
			return getBasicModel().getRelationShip();
		} catch( WrongValueException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}	
	}
}