package model.base.api;

import model.base.language.Language;
import com.github.goive.steamapi.SteamApi;
import com.github.goive.steamapi.SteamApiFactory;
import com.github.goive.steamapi.data.SteamApp;
import com.github.goive.steamapi.enums.CountryCode;
/**
 * Basic class to connect with storefront api.
 * @author M.Mucha
 */
public class StorefrontApi {
	private SteamApi steamApi = null;
	private SteamApp steamApp = null; 
	
	public StorefrontApi( Language language ) {
		setSteamApi( language );
	}
	/**
	 * Sets specific language of request.
	 * @param language
	 */
	private void setSteamApi( Language language ) {
		switch( language ) {
			case PL:
				this.steamApi = SteamApiFactory.createSteamApi( CountryCode.PL );
				break;
			case EN:
				this.steamApi = SteamApiFactory.createSteamApi( CountryCode.GB );
				break;
			default:
				break;
		}
	}
	/**
	 * Gets basic steam api object to further actions.
	 * @return steamApi
	 */
	public SteamApi getSteamApi() {
		return steamApi;
	}
	/**
	 * Gets basic steam app object to further actions on games
	 * @return steamApp
	 */
	public SteamApp getSteamApp() {
		return steamApp;
	}
	/**
	 * Sets specific app id to further actions.
	 * @param appID
	 */
	public void setSteamApp( long appID ) {
		this.steamApp = steamApi.retrieveApp( appID );
	}
}