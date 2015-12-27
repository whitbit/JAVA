package model.exception;
/**
 * Base exception object for own steam exceptions using in connection with steam api library.
 * @author M.Mucha
 */
public abstract class ExceptionBase extends Exception {
	private static final long serialVersionUID = -1998388207375823222L;
	protected String message;

	/**
	 * Default constructor for this exception object with specific enum type of exception.
	 * @param exceptionType
	 */
	public ExceptionBase( ExceptionType exceptionType ) {
		super();
		exceptionsCatching( exceptionType );
	}
	/**
	 * Method to catch specific exceptions.
	 * @param exceptionType
	 */
	protected abstract void exceptionsCatching( ExceptionType exceptionType );
	
	@Override
	public String getMessage() {
		if( this.message == null ) {
			return super.getMessage();
		} else {
			return this.message;
		}
	}
}