package model.base.api.game;

import java.util.List;

import model.base.api.game.api.GameSteamApi;
import model.base.api.game.api.GameStorefrontApi;
import model.base.api.game.details.Achievement;
import model.base.api.game.details.News;

public class Game {
	private int appID, playtime2weeks, playtimeForever, metacriticScore, requiredAge;
	private String imgLogoURL, imgIconUrl, about, detailedDescription, type, website, name, metacriticUrl, headerImage, supportURL, supportEmail, price;
	private List< String > categories, developers, publishers, supportedLanguages; 
	private List< Achievement > achievementList, globalAchievementsPercentageForApp, fullAchievements;
	private List< News > newsList = null;

	
	public Game() {}
	public Game( int appID ) {
		this.appID = appID;
	}
	public Game( GameSteamApi game ) {
		this.generateFromSteamApi( game );
	}
	public Game( GameStorefrontApi game ) {
		this.generateFromStorefrontApi( game );
	}
	
	
	private int checkID( IGameAPI game ) {
		return ( game.getAppID() != this.appID ) ? game.getAppID() : this.appID;
	}	
	public Game generate( IGameAPI game ) {
		if( game instanceof GameSteamApi ) {
			GameSteamApi g = ( GameSteamApi )game;
			this.setAppID( checkID( game ) );
			this.setImgIconUrl( g.getIconUrl() );
			this.setImgLogoURL( g.getLogoURL() );
			this.setName( g.getName() );
			this.setPlaytime2weeks( g.getPlaytime2weeks() );
			this.setPlaytimeForever( g.getPlaytimeForever() );
			this.setAchievementList( g.getAchievementList() );
			this.setGlobalAchievementsPercentageForApp( g.getGlobalAchievements() );
			this.setFullAchievements( g.getFullAchievements() );
			return this;			
		} else {
			GameStorefrontApi g = ( GameStorefrontApi )game;
			this.setAppID( checkID( game ) );
			
			this.setName( g.getName() );
			this.setAbout( g.getAbout() );
			this.setCategories( g.getCategories() );
			this.setDetailedDescription( g.getDetailedDescription() );
			this.setDevelopers( g.getDevelopers() );
			this.setHeaderImage( g.getHeaderImageUrl() );
			this.setMetacriticScore( g.getMetacriticScore() );
			this.setMetacriticUrl( g.getMetacriticUrl() );
			this.setPublishers( g.getPublishers() );
			this.setRequiredAge( g.getRequiredAge() );
			this.setSupportedLanguages( g.getSupportedLanguages() );
			this.setSupportEmail( g.getSupportEmail() );
			this.setSupportURL( g.getSupportURL() );
			this.setWebsite( g.getWebsiteUrl() );
			this.setPrice( g.getPrice() );
			this.setType( g.getType() );	
			return this;
		}
	}
	public Game generateFromSteamApi( GameSteamApi game ) {
		return generate( game );
	}
	public Game generateFromSteamApi( int appID ) {
		GameSteamApi game = new GameSteamApi( appID ).createGame();
		return generate( game );
	}
	public Game generateFromStorefrontApi( GameStorefrontApi game ) {
		return generate( game );
	}
	public Game generateFromStorefrontApi( int appID ) {
		GameStorefrontApi game = new GameStorefrontApi( appID ).createGame();
		return generate( game );
	}
	public void setNews() {
		this.setNewsList( new GameSteamApi( this.appID ).createGame().getNews() );
	}
	public void setNews( int count, int maxLength ) {
		this.setNewsList( new GameSteamApi( this.appID ).createGame().getNews( count, maxLength) );
	}
	
	public int getAppID() {
		return appID;
	}
	public void setAppID( Integer appID ) {
		this.appID = appID.intValue();
	}
	public String getImgLogoURL() {
		return imgLogoURL;
	}
	public void setImgLogoURL( String imgLogoURL ) {
		this.imgLogoURL = imgLogoURL;
	}
	public String getImgIconUrl() {
		return imgIconUrl;
	}
	public void setImgIconUrl( String imgIconUrl ) {
		this.imgIconUrl = imgIconUrl;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public int getPlaytime2weeks() {
		return playtime2weeks;
	}
	public void setPlaytime2weeks( Integer playtime2weeks ) {
		this.playtime2weeks = playtime2weeks.intValue();
	}
	public int getPlaytimeForever() {
		return playtimeForever;
	}
	public void setPlaytimeForever( Integer playtimeForever ) {
		this.playtimeForever = playtimeForever.intValue();
	}
	public List< Achievement > getAchievementList() {
		return achievementList;
	}
	public void setAchievementList( List< Achievement > achievementList ) {
		this.achievementList = achievementList;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout( String about ) {
		this.about = about;
	}
	public String getHeaderImage() {
		return headerImage;
	}
	public void setHeaderImage( String headerImage ) {
		this.headerImage = headerImage;
	}
	public String getMetacriticUrl() {
		return metacriticUrl;
	}
	public void setMetacriticUrl( String metacriticUrl ) {
		this.metacriticUrl = metacriticUrl;
	}	
	public String getPrice() {
		return price;
	}
	public void setPrice( String price ) {
		this.price = price;
	}
	public String getSupportURL() {
		return supportURL;
	}
	public void setSupportURL( String supportURL ) {
		this.supportURL = supportURL;
	}
	public String getSupportEmail() {
		return supportEmail;
	}
	public void setSupportEmail( String supportEmail ) {
		this.supportEmail = supportEmail;
	}
	public int getMetacriticScore() {
		return metacriticScore;
	}
	public void setMetacriticScore( Integer metacriticScore ) {
		this.metacriticScore = metacriticScore.intValue();
	}
	public int getRequiredAge() {
		return requiredAge;
	}
	public void setRequiredAge( Integer requiredAge ) {
		this.requiredAge = requiredAge.intValue();
	}
	public String getType() {
		return type;
	}
	public void setType( String type ) {
		this.type = type;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite( String website ) {
		this.website = website;
	}
	public List< String > getCategories() {
		return categories;
	}
	public void setCategories( List< String > categories ) {
		this.categories = categories;
	}
	public List< String > getDevelopers() {
		return developers;
	}
	public void setDevelopers( List< String > developers ) {
		this.developers = developers;
	}
	public List< String > getPublishers() {
		return publishers;
	}
	public void setPublishers( List< String > publishers ) {
		this.publishers = publishers;
	}
	public List< String > getSupportedLanguages() {
		return supportedLanguages;
	}
	public void setSupportedLanguages( List< String > supportedLanguages ) {
		this.supportedLanguages = supportedLanguages;
	}	
	public String getDetailedDescription() {
		return detailedDescription;
	}
	public void setDetailedDescription( String detailedDescription ) {
		this.detailedDescription = detailedDescription;
	}
	public List< Achievement > getGlobalAchievementsPercentageForApp() {
		return globalAchievementsPercentageForApp;
	}
	public void setGlobalAchievementsPercentageForApp( List< Achievement > globalAchievementsPercentageForApp ) {
		this.globalAchievementsPercentageForApp = globalAchievementsPercentageForApp;
	}
	public List< Achievement > getFullAchievements() {
		return fullAchievements;
	}
	public void setFullAchievements( List< Achievement > fullAchievements ) {
		this.fullAchievements = fullAchievements;
	}
	public List< News > getNewsList() {
		return newsList;
	}
	public void setNewsList( List< News > newsList ) {
		this.newsList = newsList;
	}
}