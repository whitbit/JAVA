package view;

import java.util.ArrayList;
import java.util.List;
import controller.friends.FriendsControl;
import controller.globalachievementpercentagesforapp.GlobalAchievementsPercentageForAppControl;
import controller.isplayingsharedgames.IsPlayingSharedGamesControl;
import controller.newsforapp.NewsForAppControl;
import controller.ownedgames.OwnedGamesControl;
import controller.playerachievements.PlayerAchievementsControl;
import controller.playerbans.PlayerBansControl;
import controller.playersummaries.PlayerSummariesControl;
import controller.recentlyplayedgames.RecentlyPlayedGamesControl;
import controller.schemaforgame.SchemaForGameControl;
import controller.userstatsforgame.StatsForGameControl;

public class Test {
	private static String steamID = "STEAM_0:1:36390398";
	
	public static void main( String[] args ) {
		ownedGames();
	}
	
	public static void ownedGames() {
		OwnedGamesControl games = new OwnedGamesControl.Builder( steamID ).build();
		System.out.println( "\n" + games.getGamesCount() + "\n" );
		for( com.lukaspradel.steamapi.data.json.ownedgames.Game g : games.getGamesList() ) {
			System.out.println( g.getAppid() + "::" + g.getName() );
		}
	}
	public static void recentlyGames() {
		RecentlyPlayedGamesControl games = new RecentlyPlayedGamesControl.Builder( steamID ).build();
		for( com.lukaspradel.steamapi.data.json.recentlyplayedgames.Game g : games.getRecentlyPlayedGamesList() ) {
			System.out.println( g.getAppid() + "::" + g.getName() );
		}
	}
	public static void friends() {
		FriendsControl friends = new FriendsControl.Builder( steamID ).build();
		for( com.lukaspradel.steamapi.data.json.friendslist.Friend f : friends.getFriendsList() ) {
			System.out.println( f.getSteamid() + "::" + f.getRelationship() );
		}
	}
	public static void statsForUserGames() {
		StatsForGameControl games = new StatsForGameControl.Builder( steamID ).setAppID( 34870 ).setLanguage( "polish" ).build();
		for( com.lukaspradel.steamapi.data.json.playerstats.Achievement s : games.getAchievementsList() ) {
			System.out.println( s.getName() + " : " + s.getAchieved() );
		}
	}
	public static void playerAchievements() {
		PlayerAchievementsControl games = new PlayerAchievementsControl.Builder( steamID ).setAppID( 34870 ).setLanguage( "polish" ).build();
		for( com.lukaspradel.steamapi.data.json.playerachievements.Achievement a : games.getAchievementsList() ) {
			System.out.println( a.getApiname() + " : " + a.getAchieved() + a.getAdditionalProperties() );
		}
	}
	public static void sharedGames() {
		IsPlayingSharedGamesControl games = new IsPlayingSharedGamesControl.Builder( steamID ).setAppID( 34870 ).build();
		
		System.out.println( games.getLenderSteamID() );
	}
	public static void playerBansManager() {
		List< String > players = new ArrayList< String >();
		players.add( steamID );
		players.add( "76561198241361076" );
			
		//PlayerBansControl games = new PlayerBansControl.Builder( players ).build();
		PlayerBansControl games = new PlayerBansControl.Builder( steamID, "76561198241361076" ).build();
		for( com.lukaspradel.steamapi.data.json.getplayerbans.Player p : games.getPlayerBansList() ) {
			System.out.println( p.getSteamId() + " : " + p.getVACBanned() );
		}
	}
	public static void playerSummaries() {
		List< String > players = new ArrayList< String >();
		players.add( steamID );
		players.add( "76561198241361076" );
		
		//PlayerSummariesControl games = new PlayerSummariesControl.Builder( players ).build();
		PlayerSummariesControl games = new PlayerSummariesControl.Builder( steamID, "76561198241361076" ).build();
		for( com.lukaspradel.steamapi.data.json.playersummaries.Player p : games.getPlayerSummaryList() ) {
			System.out.println( p.getSteamid() + " : " + p.getRealname() );
		}
	}
	public static void globalAchievementsPercentagesForAppManager() {
		GlobalAchievementsPercentageForAppControl games = new GlobalAchievementsPercentageForAppControl.Builder( 34870 ).build();
		for( com.lukaspradel.steamapi.data.json.achievementpercentages.Achievement a : games.getGlobalAchievementPercentagesList() ) {
			System.out.println( a.getName() + " : " + a.getPercent() );
		}
	}
	public static void newsOfAppManager() {
		NewsForAppControl games = new NewsForAppControl.Builder( 34870 ).setCount( 1 ).setMaxLength( 22 ).build();
		for( com.lukaspradel.steamapi.data.json.appnews.Newsitem n : games.getNewsList() ) {
			System.out.println( n.getTitle() + " : " + n.getContents() );
		}
	}
	public static void schemaForGame() {
		SchemaForGameControl games = new SchemaForGameControl.Builder( 34870 ).build();
		for( com.lukaspradel.steamapi.data.json.getschemaforgame.Achievement g : games.getAchievementsList() ) {
			System.out.println( g.getDisplayName() + " : " + g.getDefaultvalue() );
		}
	}
}