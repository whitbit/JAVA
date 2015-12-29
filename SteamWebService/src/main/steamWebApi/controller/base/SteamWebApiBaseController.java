package controller.base;

import model.base.api.log.LoggerService;
/**
 * Basic controller to control steam web api library from model.
 * @author M.Mucha
 */
public abstract class SteamWebApiBaseController {
	private LoggerService logger;
	
	public SteamWebApiBaseController() {
		this.logger = new LoggerService( this.getClass() );
	}
	/**
	 * Basic builder using to inherit more specified builders to create request to steam web api.
	 * @author M.Mucha
	 */
	public abstract static class BaseBuilder {
		/**
		 * Method to initialize specific object of model to further actions.
		 * @return specific model object
		 */
		protected abstract < T > T initialize();
		/**
		 * Method to build request with specific builder options.
		 * @return specific controller
		 */
		public abstract < T > T build();
	}
	/**
	 * Method to get basic model of steam web api.
	 * @return basic model
	 */
	public abstract < T > T getBasicModel();
	/**
	 * Method to get specific request.
	 * @return request
	 */ 
	public abstract < T > T getRequest();
	/**
	 * Method to get results from specified request.
	 * @return result from request
	 */
	public abstract < T > T getResult();	
	/**
	 * Method to get logger to log actions in controller.
	 * @return LoggerService
	 */
	protected LoggerService getLogger() {
		return logger;
	}
}