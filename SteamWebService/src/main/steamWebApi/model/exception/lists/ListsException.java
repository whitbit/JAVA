package model.exception.lists;

import model.exception.ExceptionBase;
import model.exception.ExceptionType;
/**
 * Basic exception to catch exceptions with lists.
 * @author M.Mucha
 */
public class ListsException extends ExceptionBase {
	private static final long serialVersionUID = 7899587480806233783L;

	public ListsException( ExceptionType exceptionType ) {
		super( exceptionType );
	}

	@Override
	protected void exceptionsCatching( ExceptionType exceptionType ) {
		switch( exceptionType ) {
			case GAME_STAT_ACHIEVEMENTS_LIST_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.GAME_STAT_ACHIEVEMENTS_LIST_IS_NULL.getErrorCode(), ExceptionType.GAME_STAT_ACHIEVEMENTS_LIST_IS_NULL.getErrorName() 
				);
				break;
			case STEAM_IDS_LIST_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.STEAM_IDS_LIST_IS_NULL.getErrorCode(), ExceptionType.STEAM_IDS_LIST_IS_NULL.getErrorName() 
				);
				break;
			default:
				break;
		}
	}
}