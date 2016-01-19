package model.base.api.game.api;

import java.util.List;

import com.github.goive.steamapi.data.Price;

public class GameStorefrontApi extends BaseGame {
	private static final long serialVersionUID = 1577392409143509123L;
	private int metacriticScore, requiredAge = 0;
	private String name, about, detailedDescription, type, website, metacriticUrl, headerImage, supportURL, supportEmail, price = null;
	private List< String > categories, developers, publishers, supportedLanguages = null;
	private GameFromStorefrontApi gameFromStorefrontApi = null;

	
	public GameStorefrontApi() {}
	public GameStorefrontApi( Integer appID ) {
		super( appID );
	}
	public GameStorefrontApi( Long appID ) {
		super( appID );
	}

	
	private String createPrice( Price price ) {
		StringBuilder sb = new StringBuilder();
		sb.append( price.getFinalPrice() );
		sb.append( " " );
		sb.append( price.getCurrency() );
		
		return sb.toString();
	}
	private String createType( String type ) {
		if( type.equals( "game" ) ) {
			return type.replace( 'g', 'G' );
		} else {
			return "Unknown";
		}
	}
	private void generateFromAPI( GameFromStorefrontApi game ) {
		this.setAppID( game.getAppId() );
		this.setName( game.getName() );
		this.setAbout( game.getAbout() );
		this.setCategories( game.getCategories() );
		this.setDetailedDescription( game.getDetailedDescription() );
		this.setDevelopers( game.getDevelopers() );
		this.setHeaderImageUrl( game.getHeaderImage() );
		this.setMetacriticScore( game.getMetacriticScore() );
		this.setMetacriticUrl( game.getMetacriticUrl() );
		this.setPublishers( game.getPublishers() );
		this.setRequiredAge( game.getRequiredAge() );
		this.setSupportedLanguages( game.getSupportedLanguages() );
		this.setSupportEmail( game.getSupportEmail() );
		this.setSupportUrl( game.getSupportURL() );
		this.setWebsiteUrl( game.getWebsite() );
		this.setPrice( createPrice( game.getPrice() ) );
		this.setType( createType( game.getType() ) );
	}
	public void buildGame() {
		this.gameFromStorefrontApi = new GameFromStorefrontApi( this.getAppID() );
		this.generateFromAPI( this.gameFromStorefrontApi );
	}
	public GameStorefrontApi createGame() {
		this.gameFromStorefrontApi = new GameFromStorefrontApi( this.getAppID() );
		this.generateFromAPI( this.gameFromStorefrontApi );
		return this;
	}
	public String getAbout() {
		return this.about;
	}
	public void setAbout( String about ) {
		this.about = about;
	}
	public String getHeaderImageUrl() {
		return this.headerImage;
	}
	public void setHeaderImageUrl( String headerImageUrl ) {
		this.headerImage = headerImageUrl;
	}
	public String getMetacriticUrl() {
		return this.metacriticUrl;
	}
	public void setMetacriticUrl( String metacriticUrl ) {
		this.metacriticUrl = metacriticUrl;
	}
	public String getPrice() {
		return this.price;
	}
	public void setPrice( String price ) {
		this.price = price;
	}
	public String getSupportURL() {
		return this.supportURL;
	}
	public void setSupportUrl( String supportUrl ) {
		this.supportURL = supportUrl;
	}
	public String getSupportEmail() {
		return this.supportEmail;
	}
	public void setSupportEmail( String supportEmail ) {
		this.supportEmail = supportEmail;
	}
	public int getMetacriticScore() {
		return this.metacriticScore;
	}
	public void setMetacriticScore( Integer metaScore ) {
		this.metacriticScore = metaScore.intValue();
	}
	public int getRequiredAge() {
		return this.requiredAge;
	}
	public void setRequiredAge( Integer age ) {
		this.requiredAge = age.intValue();
	}
	public String getType() {
		return this.type;
	}
	public void setType( String type ) {
		this.type = type;
	}
	public String getWebsiteUrl() {
		return this.website;
	}
	public void setWebsiteUrl( String web ) {
		this.website = web;
	}
	public List< String > getCategories() {
		return this.categories;
	}
	public void setCategories( List< String > list ) {
		this.categories = list;
	}
	public List< String > getDevelopers() {
		return this.developers;
	}
	public void setDevelopers( List< String > list ) {
		this.developers = list;
	}
	public List< String > getPublishers() {
		return this.publishers;
	}
	public void setPublishers( List< String > list ) {
		this.publishers = list;
	}
	public List< String > getSupportedLanguages() {
		return this.supportedLanguages;
	}
	public void setSupportedLanguages( List< String > list ) {
		this.supportedLanguages = list;
	}
	public String getDetailedDescription() {
		return this.detailedDescription;
	}
	public void setDetailedDescription( String detailedDescription ) {
		this.detailedDescription = detailedDescription;
	}
	public String getName() {
		return this.name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public GameStorefrontApi getNewObject() {
		return new GameStorefrontApi();
	}
}