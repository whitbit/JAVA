package model.base.steamid;

import java.util.List;
import model.base.api.log.LoggerService;
import model.exception.ExceptionType;
import model.exception.lists.ListsException;
import model.exception.value.WrongValueException;
/**
 * Class specified to convert Steam ID to version x32 and x64.
 * @author M.Mucha
 */
public class SteamID {
	private static final String STEAM_BASE_BEGIN = "STEAM_";
	private String steamID;
	private List< String > steamIDs;
	private LoggerService logger = new LoggerService( this.getClass() );;

	public SteamID( String steamID ) {
		try {
			this.steamID = validateID( steamID );
		} catch( WrongValueException e ) {
			this.logger.showExceptionLogging( e );
		}
	}
	public SteamID( List< String > steamIDs ) {
		try {
			this.steamIDs = validateSteamIdToList( steamIDs );
		} catch( ListsException e ) {
			this.logger.showExceptionLogging( e );
		} catch( WrongValueException e ) {
			this.logger.showExceptionLogging( e );
		}
	}	
	/**
	 * Method to parse long steam id from string.
	 * @param steamID
	 * @return steamID
	 * @throws WrongValueException 
	 */
	private long steamIdLong( String steamID ) throws WrongValueException {
		if( steamID != null ) {
			return Long.parseLong( steamID );
		} else {
			throw new WrongValueException( ExceptionType.STEAM_ID_IS_NULL );
		}
	}	
	/**
	 * Method for convert x32 version of Steam ID to version x64 in long format.
	 * @return correct steam id.
	 * @throws WrongValueException 
	 */
	private long convertFromX32ToX64( String steamID ) throws WrongValueException {
		if( steamID != null ) {
			String[] idX32 = steamID.substring( 8 ).split( ":" );		
			return Long.valueOf( idX32[ 0 ] ) + Long.valueOf( idX32[ 1 ] ) * 2 + 76561197960265728L;
		} else {
			throw new WrongValueException( ExceptionType.STEAM_ID_IS_NULL );
		} 
    }	
	/**
	 * Check if steam id as string starts with "STEAM_" to be possible to convert.
	 * @param steamID
	 * @return true/false
	 */
	private boolean startWithBaseSteamText( String steamID ) {
		if( steamID.trim().startsWith( STEAM_BASE_BEGIN ) ) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Check if steam id as long numeric format is builded with only numbers
	 * @param steamID
	 * @return true/false
	 * @throws WrongValueException
	 */
	private boolean isNumeric( String steamID ) throws WrongValueException {
		for( char c : steamID.toCharArray() ) {
			if( !Character.isDigit( c ) ) {
				throw new WrongValueException( ExceptionType.STEAM_WRONG_FORMAT );
			}
		}	
	    return true;
	}
	/**
	 * Check if steam id as long numeric format is 17 numbers builded. 
	 * @param steamID
	 * @return true/false
	 * @throws WrongValueException
	 */
	private boolean startWithLongNumber( String steamID ) throws WrongValueException {
		if( steamID.length() < 17 || steamID.length() > 17 ) {
			throw new WrongValueException( ExceptionType.STEAM_NUMBER_FORMAT_IS_TO_SHORT_OR_TO_LONG );
		} else {
			isNumeric( steamID );
		}	
	    return true;
	}
	/**
	 * Method for validate input String by user and to set correct type of Steam ID.
	 * @param steamID
	 * @throws WrongValueException 
	 */
	private String validateID( String steamID ) throws WrongValueException {
		if( steamID != null ) {
			if( startWithBaseSteamText( steamID ) ) {
				return String.valueOf( convertFromX32ToX64( steamID ) );
			} else if( startWithLongNumber( steamID ) ) {
				return String.valueOf( steamIdLong( steamID ) );
			} else {
				throw new WrongValueException( ExceptionType.STEAM_WRONG_FORMAT );
			}
		} else {
			throw new WrongValueException( ExceptionType.STEAM_ID_IS_NULL );
		}
	}
	/**
	 * Method to validate steam id to list.
	 * @param steamID
	 * @return steamIDs
	 * @throws ListsException 
	 * @throws WrongValueException 
	 */
	private List< String > validateSteamIdToList( List< String > steamIDs ) throws ListsException, WrongValueException {
		if( steamIDs != null ) {
			for( String steamIdToCheckAndConvertIfRequire : steamIDs ) {
				steamIDs.set( steamIDs.indexOf( steamIdToCheckAndConvertIfRequire ), validateID( steamIdToCheckAndConvertIfRequire ) );
			}
			return steamIDs;
		} else {
			throw new ListsException( ExceptionType.STEAM_IDS_LIST_IS_NULL );
		}
	}
	/**
	 * Get the steam id.
	 * @return steamID
	 */
	public String getSteamID() throws WrongValueException {
		if( steamID != null ) {
			return steamID;
		} else {
			throw new WrongValueException( ExceptionType.STEAM_ID_IS_NULL );
		}
	}
	/**
	 * Get the list of steam ids.
	 * @return steamIDs
	 */
	public List< String > getSteamIDs() throws ListsException {
		if( steamIDs != null ) {
			return steamIDs;
		} else {
			throw new ListsException( ExceptionType.STEAM_IDS_LIST_IS_NULL );
		}
	}	
}