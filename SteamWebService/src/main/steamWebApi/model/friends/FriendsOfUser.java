package model.friends;

import model.base.steamid.SteamID;
import model.base.steamuser.SteamUserSingle;
import model.exception.ExceptionType;
import model.exception.connection.ConnectionException;
import model.exception.value.WrongValueException;
import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.friendslist.Friendslist;
import com.lukaspradel.steamapi.data.json.friendslist.GetFriendList;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest;
import com.lukaspradel.steamapi.webapi.request.GetFriendListRequest.Relationship;
/**
 * Base class to connect with friends from SteamWebApi.
 * @author M.Mucha
 */
public class FriendsOfUser extends SteamUserSingle implements ISteamFriends {
	private GetFriendListRequest request;
	private GetFriendList friends;
	private Relationship relationship = Relationship.ALL;

	public FriendsOfUser( String steamID ) {
		super();
		this.initialize( steamID );
	}
	public FriendsOfUser( String steamID, Relationship relationship ) {
		super();
		try {
			setRelationship( relationship );
			this.initialize( steamID );
		} catch( WrongValueException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	/**
	 * Method to set specific relationship.
	 * @param relationship
	 * @throws WrongValueException
	 */
	private void setRelationship( Relationship relationship ) throws WrongValueException {
		if( relationship != null ) {
			this.relationship = relationship;
		} else {
			throw new WrongValueException( ExceptionType.RELATIONSHIP_IS_NULL );
		}
	}
	@Override
	protected void setRequest( String steamID ) {
		this.request = new GetFriendListRequest.GetFriendListRequestBuilder( steamID ).relationship( this.relationship ).buildRequest();
	}
	@Override
	protected void setRequestProcess() throws SteamApiException, ConnectionException {
		this.friends = getClient().< GetFriendList >processRequest( request );
	}@Override
	protected void initialize( String steamID ) {
		try {
			setRequest( new SteamID( steamID ).getSteamID() );
			setRequestProcess();
		} catch( SteamApiException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
		} catch( WrongValueException e ) {
			this.getLogger().showExceptionLogging( e );
		}
	}
	
	
	@Override
	public GetFriendListRequest getRequest() throws ConnectionException {
		if( this.request != null) {
			return request;
		} else {
			throw new ConnectionException( ExceptionType.REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public GetFriendList getResult() throws ConnectionException {
		if( friends != null ) {
			return friends;
		} else {
			throw new ConnectionException( ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL );
		}
	}
	@SuppressWarnings("unchecked")
	public FriendsOfUser getModel() {
		return this;
	}
	public Friendslist getFriends() throws ConnectionException  {
		return getResult().getFriendslist();
	}
	public Relationship getRelationShip() throws WrongValueException {
		if( this.relationship != null) {
			return relationship;
		} else {
			throw new WrongValueException( ExceptionType.RELATIONSHIP_IS_NULL );
		}
	}
}