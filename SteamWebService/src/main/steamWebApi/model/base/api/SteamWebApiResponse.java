package model.base.api;

import model.exception.connection.ConnectionException;
/**
 * Generate specific response type for specific objects.
 * @author M.Mucha
 */
public interface SteamWebApiResponse extends SteamWebApiBaseInterface {
	/**
	 * Get response of specific object.
	 * @return specific response
	 * @throws ConnectionException 
	 */
	public < T > T getResponse() throws ConnectionException;
}