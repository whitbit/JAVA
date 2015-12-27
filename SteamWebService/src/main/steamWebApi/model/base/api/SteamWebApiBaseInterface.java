package model.base.api;
/**
 * Base interface using to inherit for other interfaces.
 * @author M.Mucha
 */
public interface SteamWebApiBaseInterface {
	/**
	 * Get specific model type.
	 * @return Specific model object of request.
	 */
	public < T > T getModel();
}