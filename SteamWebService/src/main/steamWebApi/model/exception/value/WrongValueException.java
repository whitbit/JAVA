package model.exception.value;

import model.exception.ExceptionBase;
import model.exception.ExceptionType;
/**
 * Basic exception to catch exceptions with wrong values.
 * @author M.Mucha
 */
public class WrongValueException extends ExceptionBase {
	private static final long serialVersionUID = -2968324007996629401L;

	public WrongValueException( ExceptionType exceptionType ) {
		super( exceptionType );
	}

	@Override
	protected void exceptionsCatching( ExceptionType exceptionType ) {
		switch( exceptionType ) {
			case STEAM_ID_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.STEAM_ID_IS_NULL.getErrorCode(), ExceptionType.STEAM_ID_IS_NULL.getErrorName() 
				);
				break;
			case LANGUAGE_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.LANGUAGE_IS_NULL.getErrorCode(), ExceptionType.LANGUAGE_IS_NULL.getErrorName() 
				);
				break;
			case STEAM_WRONG_FORMAT:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.STEAM_WRONG_FORMAT.getErrorCode(), ExceptionType.STEAM_WRONG_FORMAT.getErrorName() 
				);
				break;	
			case STEAM_NUMBER_FORMAT_IS_TO_SHORT_OR_TO_LONG:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.STEAM_NUMBER_FORMAT_IS_TO_SHORT_OR_TO_LONG.getErrorCode(), ExceptionType.STEAM_NUMBER_FORMAT_IS_TO_SHORT_OR_TO_LONG.getErrorName() 
				);
				break;
			default:
				break;
		}
	}
}