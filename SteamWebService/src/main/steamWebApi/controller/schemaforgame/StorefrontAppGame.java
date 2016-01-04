package controller.schemaforgame;

import java.util.ArrayList;
import java.util.List;
import model.base.api.StorefrontApi;
import model.base.language.Language;
import com.github.goive.steamapi.data.Category;
import com.github.goive.steamapi.data.Price;
import com.github.goive.steamapi.data.SteamApp;
import com.github.goive.steamapi.data.SupportInfo;
/**
 * Class specified to getting full informations about game based on storefront api steam.
 * @author M.Mucha
 */
public class StorefrontAppGame {
	private static StorefrontApi storefrontApi = null;
	
	public StorefrontAppGame() {}
	private StorefrontAppGame( Builder builder ) {
		storefrontApi = builder.storefrontApi;
	}
	
	/**
	 * Basic builder to build specific request that sets details of request to further actions.
	 * @author M.Mucha
	 */
	public static class Builder {
		private StorefrontApi storefrontApi = null;
		
		public Builder( Language language ) {
			this.storefrontApi = new StorefrontApi( language );
		}
		/**
		 * Set specific id of game to possibility gets data about.
		 * @param appID
		 * @return Builder
		 */
		public Builder steamAppID( long appID ) {
			this.storefrontApi.setSteamApp( appID );
			return this;
		}
		/**
		 * Build request.
		 * @return StorefrontAppGame
		 */
		public StorefrontAppGame build() {
			return new StorefrontAppGame( this );
		}
	}
	
	/**
	 * Get basic steamapp object to further actions in current object.
	 * @return SteamApp
	 */
	private SteamApp getSteamApp() {
		return storefrontApi.getSteamApp();
	}
	/**
	 * Easier way to build specific request from storenfront api.
	 * @param language
	 * @param appID
	 * @return StorefrontAppGame
	 */
	public StorefrontAppGame generateStorefrontGame( Language language, long appID ) {
		return new StorefrontAppGame.Builder( language ).steamAppID( appID ).build();
	}
	/**
	 * Sets specific id of game.
	 * @param appID
	 */
	public void setSteamApp( long appID ) {
		storefrontApi.setSteamApp( appID );
	}
	/**
	 * Gets the app id of game.
	 * @return AppId
	 */
	public long getAppId() {
        return getSteamApp().getAppId();
    }
	/**
	 * Gets the Type of game.
	 * @return Type
	 */
	public String getType() {
        return getSteamApp().getType().getValue();
    }
	/**
	 * Gets the Name of game.
	 * @return Name
	 */
    public String getName() {
        return getSteamApp().getName();
    }
    /**
     * Gets the RequiredAge of game.
     * @return RequiredAge
     */
    public int getRequiredAge() {
        return getSteamApp().getRequiredAge();
    }
    /**
     * Gets the detailed description of game.
     * @return DetailedDescription
     */
    public String getDetailedDescription() {
        return getSteamApp().getDetailedDescription();
    }
    /**
     * Gets the about of game.
     * @return AboutTheGame
     */
    public String getAboutTheGame() {
        return getSteamApp().getAboutTheGame();
    }
    /**
     * Gets the SupportedLanguages of game.
     * @return SupportedLanguages
     */
    public List< String > getSupportedLanguages() {
        return getSteamApp().getSupportedLanguages();
    }
    /**
     * Gets the HeaderImage of game.
     * @return HeaderImage
     */
    public String getHeaderImage() {
        return getSteamApp().getHeaderImage();
    }
    /**
     * Gets the Website of game.
     * @return Website
     */
    public String getWebsite() {
        return getSteamApp().getWebsite();
    }
    /**
     * Gets the Developers of game.
     * @return Developers
     */
    public List< String > getDevelopers() {
        return getSteamApp().getDevelopers();
    }
    /**
     * Gets the Publishers of game.
     * @return Publishers
     */
    public List< String > getPublishers() {
        return getSteamApp().getPublishers();
    }
    /**
     * Gets the MetacriticScore of game.
     * @return MetacriticScore
     */
    public int getMetacriticScore() {
    	return ( getSteamApp().getMetacriticScore() != null ) ? getSteamApp().getMetacriticScore() : 0;
    }
    /**
     * Gets the MetacriticUrl of game.
     * @return MetacriticUrl
     */
    public String getMetacriticUrl() {
        return getSteamApp().getMetacriticUrl();
    }
    /**
     * Gets the Price of game.
     * @return Price
     */
    public Price getPrice() {
        return getSteamApp().getPrice();
    }
    /**
     * Gets the Categories of game.
     * @return Categories
     */
    public List< String > getCategories() {
    	List< String > list = new ArrayList< String >();
    	for( Category category : getSteamApp().getCategories() ) {
    		list.add( category.getDescription() );
    	}   	
        return list;
    }
    /**
     * Gets the SupportInfo of game.
     * @return SupportInfo
     */
    public SupportInfo getSupportInfo() {
        return getSteamApp().getSupportInfo();
    }
}