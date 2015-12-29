package controller.base;
/**
 * Specified builder to further inherits and make correct builder operations on specific model in controller using specific response type.
 * @author M.Mucha
 */
public abstract class BuildWithResponseController extends BuildController {
	public BuildWithResponseController() {
		super();
	}
	/**
	 * Method to get specific response from request of specific model.
	 * @return specific response
	 */
	public abstract < T > T getResponse();
}