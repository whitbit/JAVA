package model.base.api.game.api;

import java.util.List;

import com.github.goive.steamapi.data.Price;

import model.base.language.Language;
import controller.schemaforgame.StorefrontAppGame;

public class GameFromStorefrontApi {
	private Language language = Language.EN;
	private StorefrontAppGame game = null;

	public GameFromStorefrontApi( Long appID ) {
		this.game = new StorefrontAppGame.Builder( language ).steamAppID( appID ).build();
	}
	public GameFromStorefrontApi( Integer appID ) {
		this.game = new StorefrontAppGame.Builder( language ).steamAppID( appID ).build();
	}

	public void buildGameFromStorefront( int appID ) {
		this.game = new StorefrontAppGame.Builder( language ).steamAppID( appID ).build();
	}
	public String getAbout() {
		return this.game.getAboutTheGame();
	}
	public String getDetailedDescription() {
		return this.game.getDetailedDescription();
	}
	public String getType() {
		return this.game.getType();
	}
	public String getWebsite() {
		return this.game.getWebsite();
	}
	public String getName() {
		return this.game.getName();
	}
	public String getMetacriticUrl() {
		return this.game.getMetacriticUrl();
	}
	public String getHeaderImage() {
		return this.game.getHeaderImage();
	}
	public List< String > getCategories() {
		return this.game.getCategories();
	}
	public List< String > getDevelopers() {
		return this.game.getDevelopers();
	}
	public List< String > getPublishers() {
		return this.game.getPublishers();
	}
	public List< String > getSupportedLanguages() {
		return this.game.getSupportedLanguages();
	}
	public long getAppId() {
		return this.game.getAppId();
	}
	public int getMetacriticScore() {
		return this.game.getMetacriticScore();
	}
	public int getRequiredAge() {
		return this.game.getRequiredAge();
	}
	public String getSupportURL() {
		return "None";
	}
	public String getSupportEmail() {
		return this.game.getSupportInfo().getEmail();
	}
	public Price getPrice() {
		return this.game.getPrice();
	}
}