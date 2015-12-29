package model.exception;
/**
 * Enumerator for all own exceptions using in connection with steam web api.
 * @author M.Mucha
 */
public enum ExceptionType {
	NONE( "None", 0, 000 ),
	CLIENT_IS_NULL( "Currently client of steam web api is null.", 1, 010 ),
	REQUEST_IS_NULL( "Currently request of steam web api is null.", 1, 020 ),
	RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL( "Currently model object as result from steam web api request is null.", 1, 030 ),
	API_KEY( "Your unique API key is invalid.", 1, 040 ),
	
	GAME_STAT_ACHIEVEMENTS_LIST_IS_NULL( "List object of game stat achievements is null.", 2, 101 ),
	STEAM_IDS_LIST_IS_NULL( "List object steam ids is null.", 2, 102 ),
	
	STEAM_ID_IS_NULL( "Steam ID is null.", 3, 201 ),
	RELATIONSHIP_IS_NULL( "Relationship is null.", 3, 202 ),
	LANGUAGE_IS_NULL( "Language is null.", 3, 203 ),
	
	STEAM_WRONG_FORMAT( "Steam ID has wrong format.", 4, 305 ),
	STEAM_NUMBER_FORMAT_IS_TO_SHORT_OR_TO_LONG( "Steam ID is too long or too short numeric format.", 4, 310 );
	
	
	private String errorName;
	private int errorCode, prioryty;
	
	ExceptionType( String errorName, int prioryty, int errorCode ) {
		this.errorName = errorName;
		this.prioryty = prioryty;
		this.errorCode = errorCode;
	}

	/**
	 * Method to get error name.
	 * @return errorName
	 */
	public String getErrorName() {
		return errorName;
	}
	/**
	 * Method to get error prioryty.
	 * @return prioryty
	 */
	public int getPrioryty() {
		return prioryty;
	}
	/**
	 * Method to get error code.
	 * @return code
	 */
	public String getErrorCode() {
		return String.format( "%dxx%d", prioryty, errorCode );
	}
}