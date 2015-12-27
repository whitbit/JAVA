package model.base.steamapp;

import java.util.List;
import model.exception.ExceptionType;
import model.exception.lists.ListsException;
/**
 * Abstract class for actions on apps with specific app id with count and achievements name.
 * @author M.Mucha
 */
public abstract class SteamGameStat extends SteamAppBase {
	private int count;
	private List< String > achievementNames;

	public SteamGameStat( int appID, int count, List< String > achievementNames ) {
		super();
		this.initialize( appID, count, achievementNames );
	}
	/**
	 * Length of the array of global stat names you will be passing. 
	 * @return count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * Set length of the array of global stat names you will be passing. 
	 * @param count
	 */
	public void setCount( int count ) {
		this.count = count;
	}
	/**
	 * List of name of the achievements as defined in Steamworks.
	 * @return achievementNames
	 * @throws ListsException
	 */
	public List< String > getAchievementNames() throws ListsException {
		if( achievementNames != null ) {
			return achievementNames;
		} else {
			throw new ListsException( ExceptionType.GAME_STAT_ACHIEVEMENTS_LIST_IS_NULL );
		}		
	}
	/**
	 * Set list of name of the achievements as defined in Steamworks.
	 * @param achievementNames
	 */
	public void setAchievementNames( List< String > achievementNames ) {
		this.achievementNames = achievementNames;
	}
	/**
	 * Method to initialize specific request type.
	 * @param steamID
	 */
	protected abstract void setRequest( int appID, int count, List< String > achievementNames );
	/**
	 * Method to initialize specific object using app id.
	 * @param steamID
	 */
	protected abstract void initialize( int appID, int count, List< String > achievementNames );
}