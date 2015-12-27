package model.base.api.log;

import org.apache.log4j.Logger;
/**
 * Class for logging exceptions.
 * @author M.Mucha
 */
public class LoggerService {
	private Logger logger;

	public LoggerService( String className ) {
		setLogger( className );
	}
	public LoggerService( Class<?> clazz ) {
		setLogger( clazz );
	}

	/**
	 * Sets logger with specific class.
	 * @param clazz
	 */
	private void setLogger( Class<?> clazz ) {
		this.logger = Logger.getLogger( clazz );
	}
	/**
	 * Sets logger with name of class.
	 * @param className
	 */
	private void setLogger( String className ) {
		this.logger = Logger.getLogger( className );
	}
	/**
	 * Gets current logger object.
	 * @return logger
	 */
	public Logger getLogger() {
		return logger;
	}
	/**
	 * Sets exception informations to logging.
	 * @param throwable
	 */
	public void showExceptionLogging( Throwable throwable ) {
		this.getLogger().error( throwable.getMessage() );
		this.getLogger().info( "\nStack Trace:", throwable );
	}
}