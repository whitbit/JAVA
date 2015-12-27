package model.newsforapp;

import com.lukaspradel.steamapi.data.json.appnews.Appnews;

import model.base.api.SteamWebApiBaseInterface;
import model.exception.connection.ConnectionException;
/**
 * Using for news to get special object of news to further actions.
 * @author M.Mucha
 */
public interface ISteamNewsOfApp extends SteamWebApiBaseInterface {
	/**
	 * Get news of app.
	 * @return Appnews
	 * @throws ConnectionException 
	 */
	public Appnews getAppNews() throws ConnectionException;
}