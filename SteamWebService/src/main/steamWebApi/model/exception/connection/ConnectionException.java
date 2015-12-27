package model.exception.connection;

import model.exception.ExceptionBase;
import model.exception.ExceptionType;
/**
 * Basic exception to catch exceptions with connection to steam web api.
 * @author M.Mucha
 */
public class ConnectionException extends ExceptionBase {
	private static final long serialVersionUID = -6957098558358385997L;

	public ConnectionException( ExceptionType exceptionType ) {
		super( exceptionType );
	}	
	
	@Override
	protected void exceptionsCatching( ExceptionType exceptionType ) {
		switch( exceptionType ) {
			case CLIENT_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s Check your API KEY, maybe is invalid.", 
						ExceptionType.CLIENT_IS_NULL.getErrorCode(), ExceptionType.CLIENT_IS_NULL.getErrorName() 
				);
				break;
			case REQUEST_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s Check if you use correct object of request.", 
						ExceptionType.REQUEST_IS_NULL.getErrorCode(), ExceptionType.REQUEST_IS_NULL.getErrorName() 
				);
				break;
			case RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL:
				this.message = String.format( 
						"Error Code:[%s]\n%s", 
						ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL.getErrorCode(), ExceptionType.RESULT_AS_BASE_OBJECT_FROM_REQUEST_IS_NULL.getErrorName() 
				);
				break;	
			case API_KEY:
				this.message = String.format( 
						"Error Code:[%s]\n%s Check your code maybe is invalid or null.", 
						ExceptionType.API_KEY.getErrorCode(), ExceptionType.API_KEY.getErrorName() 
				);
				break;	
			default:
				break;
		}
	}
}