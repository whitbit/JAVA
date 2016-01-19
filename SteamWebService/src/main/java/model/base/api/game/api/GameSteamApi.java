package model.base.api.game.api;

import java.util.ArrayList;
import java.util.List;

import model.base.api.game.details.Achievement;
import model.base.api.game.details.News;
import controller.globalachievementpercentagesforapp.GlobalAchievementsPercentageForAppControl;
import controller.schemaforgame.SchemaForGameControl;
import controller.newsforapp.NewsForAppControl;

public class GameSteamApi extends BaseGame {
	private static final long serialVersionUID = 2824264566600515046L;
	private int playtime2weeks, playtimeForever = 0;
	private String name, imgLogoURL, imgIconUrl = null;
	private SchemaForGameControl schemaForGames = null;
	private GlobalAchievementsPercentageForAppControl globalAchievementsPercentageForAppControl = null;
	private NewsForAppControl newsForApp = null;
	private List< Achievement > achievementList, globalAchievements, fullAchievements = null;
	private List< News > newsList = null;

	
	public GameSteamApi() {}
	public GameSteamApi( Integer appID ) {
		super( appID );
	}
	public GameSteamApi( Long appID ) {
		super( appID );
	}
	
	
	private void build() {
		this.achievementList = new ArrayList< Achievement >();
		this.globalAchievements = new ArrayList< Achievement >();
		this.fullAchievements = new ArrayList< Achievement >();
		this.newsList = new ArrayList< News >();
		
		this.schemaForGames = new SchemaForGameControl.Builder( this.getAppID() ).build();
		this.globalAchievementsPercentageForAppControl = new GlobalAchievementsPercentageForAppControl.Builder( this.getAppID() ).build();
		
		this.achievementList = this.setAchievements();
		this.globalAchievements = this.setGlobalAchievements();
		this.fullAchievements = this.setFullAchievements();
	}
	public void buildGame() {
		this.build();
	}
	public GameSteamApi createGame() {
		this.build();
		return this;
	}
	
	public List< Achievement > setAchievements() {
		this.schemaForGames.getAchievementsList().forEach( ( achievementsAPI ) -> {
			Achievement achievement = new Achievement();
			achievement = new Achievement();
			achievement.setName( achievementsAPI.getName() );
			achievement.setDisplayName( achievementsAPI.getDisplayName() );
			achievement.setDefaultvalue( achievementsAPI.getDefaultvalue() );
			achievement.setDescription( achievementsAPI.getDescription() );
			achievement.setHidden( achievementsAPI.getHidden() );
			achievement.setIcon( achievementsAPI.getIcon() );
			achievement.setIcongray( achievementsAPI.getIcongray() );
			this.achievementList.add( achievement );
		});
		return this.achievementList;
	}
	public List< Achievement > setGlobalAchievements() {
		this.globalAchievementsPercentageForAppControl.getGlobalAchievementPercentagesList().forEach( ( achievementsAPI ) -> {
			Achievement achievement = new Achievement();
			achievement = new Achievement();
			achievement.setName( achievementsAPI.getName() );
			achievement.setPercent( achievementsAPI.getPercent() );
			this.globalAchievements.add( achievement );
		});
		return this.globalAchievements;
	}
	public List< Achievement > setFullAchievements() {
		final List< Achievement > achievements = this.setAchievements();
		final List< Achievement > percent = this.setGlobalAchievements();
		
		for( Achievement a : achievements ) {
			percent.forEach( ( ach ) -> {
				if( ach.getName().equals( a.getName() ) ) {
					a.setPercent( ach.getPercent() );
				}
			});
			this.fullAchievements.add( a );
		}
		return this.fullAchievements;
	}
	public List< News > getNews() {
		this.newsForApp = new NewsForAppControl.Builder( this.getAppID() ).build();
		this.newsForApp.getNewsList().forEach( ( n ) -> {
			News news = new News();
			news.setAuthor( n.getAuthor() );
			news.setContents( n.getContents() );
			news.setDate( n.getDate() );
			news.setFeedlabel( n.getFeedlabel() );
			news.setFeedname( n.getFeedname() );
			news.setGid( n.getGid() );
			news.setIsExternalUrl( n.getIsExternalUrl() );
			news.setTitle( n.getTitle() );
			news.setUrl( n.getUrl() );
			
			this.newsList.add( news );
		});
		return this.newsList;
	}
	public List< News > getNews( int count, int maxLength ) {
		this.newsForApp = new NewsForAppControl.Builder( this.getAppID() ).setCount( count ).setMaxLength( maxLength ).build();
		this.newsForApp.getNewsList().forEach( ( n ) -> {
			News news = new News();
			news.setAuthor( n.getAuthor() );
			news.setContents( n.getContents() );
			news.setDate( n.getDate() );
			news.setFeedlabel( n.getFeedlabel() );
			news.setFeedname( n.getFeedname() );
			news.setGid( n.getGid() );
			news.setIsExternalUrl( n.getIsExternalUrl() );
			news.setTitle( n.getTitle() );
			news.setUrl( n.getUrl() );
			
			this.newsList.add( news );
		});
		return this.newsList;
	}
	public String getName() {
		return this.name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public String getLogoURL() {
		return this.imgLogoURL;
	}
	public void setLogoURL( String imgLogoURL ) {
		this.imgLogoURL = imgLogoURL;
	}
	public String getIconUrl() {
		return this.imgIconUrl;
	}
	public void setIconUrl( String imgIconUrl ) {
		this.imgIconUrl = imgIconUrl;
	}
	public int getPlaytime2weeks() {
		return this.playtime2weeks;
	}
	public void setPlaytime2weeks( Integer playtime2weeks ) {
		this.playtime2weeks = playtime2weeks.intValue();
	}
	public int getPlaytimeForever() {
		return this.playtimeForever;
	}
	public void setPlaytimeForever( Integer playtimeForever ) {
		this.playtimeForever = playtimeForever.intValue();
	}
	public void setAchievementList( List< Achievement > achievementList ) {
		this.achievementList = achievementList;
	}
	public List< Achievement > getAchievementList() {
		return this.achievementList;
	}
	public void setGlobalAchievements( List< Achievement > globalAchievements ) {
		this.globalAchievements = globalAchievements;
	}
	public List< Achievement > getGlobalAchievements() {
		return globalAchievements;
	}
	public void setFullAchievements( List< Achievement > fullAchievements ) {
		this.fullAchievements = fullAchievements;
	}
	public List< Achievement > getFullAchievements() {
		return fullAchievements;
	}
	public List< News > getNewsList() {
		return newsList;
	}
	public void setNewsList( List< News > newsList ) {
		this.newsList = newsList;
	}
	public GameSteamApi getNewObject() {
		return new GameSteamApi();
	}
}