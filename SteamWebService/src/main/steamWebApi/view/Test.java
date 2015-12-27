package view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.Level;

import model.base.api.SteamWebApi;
import controller.friends.FriendsManager;
import controller.globalachievementpercentagesforapp.GlobalAchievementsPercentagesForAppManager;
import controller.isplayingsharedgames.IsPlayingSharedGamesManager;
import controller.newsforapp.NewsOfAppManager;
import controller.ownedgames.OwnedGamesManager;
import controller.playerachievements.PlayerAchievementsManager;
import controller.playerbans.PlayerBansManager;
import controller.playersummaries.PlayerSummariesManager;
import controller.recentlyplayedgames.RecentlyPlayedGamesManager;
import controller.schemaforgame.SchemaForGameManager;
import controller.userstatsforgame.StatsForGameManager;

public class Test {
	private static String steamID = "STEAM_0:1:36390398";
	
	public static void main( String[] args ) {
		friends();
	}

	public static void ownedGames() {
		OwnedGamesManager games = new OwnedGamesManager( steamID );
		System.out.println( "\n" + games.getGamesCount() + "\n" );
		for( com.lukaspradel.steamapi.data.json.ownedgames.Game g : games.getGamesList() ) {
			System.out.println( g.getAppid() + "::" + g.getName() );
		}
	}
	public static void recentlyGames() {
		RecentlyPlayedGamesManager games = new RecentlyPlayedGamesManager( steamID );
		for( com.lukaspradel.steamapi.data.json.recentlyplayedgames.Game g : games.getRecentlyPlayedGamesList() ) {
			System.out.println( g.getAppid() + "::" + g.getName() );
		}
	}
	public static void friends() {
		FriendsManager friends = new FriendsManager( steamID );
		for( com.lukaspradel.steamapi.data.json.friendslist.Friend f : friends.getFriends() ) {
			System.out.println( f.getSteamid() + "::" + f.getRelationship() );
		}
	}
	public static void statsForUserGames() {
		StatsForGameManager games = new StatsForGameManager( steamID, 34870, "polish" );
		for( com.lukaspradel.steamapi.data.json.playerstats.Achievement s : games.getAchievements() ) {
			System.out.println( s.getName() + " : " + s.getAchieved() );
		}
	}
	public static void playerAchievements() {
		PlayerAchievementsManager games = new PlayerAchievementsManager( steamID, 34870, "polish" );
		for( com.lukaspradel.steamapi.data.json.playerachievements.Achievement a : games.getAchievements() ) {
			System.out.println( a.getApiname() + " : " + a.getAchieved() + a.getAdditionalProperties() );
		}
	}
	public static void sharedGames() {
		IsPlayingSharedGamesManager games = new IsPlayingSharedGamesManager( steamID, 34870 );
		
		System.out.println( games.getLenderSteamID() );
	}
	public static void playerBansManager() {
		List< String > players = new ArrayList< String >();
		players.add( steamID );
		players.add( "76561198241361076" );
		PlayerBansManager games = new PlayerBansManager( players );
		for( com.lukaspradel.steamapi.data.json.getplayerbans.Player p : games.getPlayerBans() ) {
			System.out.println( p.getSteamId() + " : " + p.getVACBanned() );
		}
	}
	public static void playerSummaries() {
		List< String > players = new ArrayList< String >();
		players.add( steamID );
		players.add( "76561198241361076" );
		PlayerSummariesManager games = new PlayerSummariesManager( players );
		for( com.lukaspradel.steamapi.data.json.playersummaries.Player p : games.getPlayerSummary() ) {
			System.out.println( p.getSteamid() + " : " + p.getRealname() );
		}
	}
	public static void globalAchievementsPercentagesForAppManager() {
		GlobalAchievementsPercentagesForAppManager games = new GlobalAchievementsPercentagesForAppManager( 34870 );
		for( com.lukaspradel.steamapi.data.json.achievementpercentages.Achievement a : games.getGlobalAchievementPercentagesForAppList() ) {
			System.out.println( a.getName() + " : " + a.getPercent() );
		}
	}
	public static void newsOfAppManager() {
		NewsOfAppManager games = new NewsOfAppManager( 34870 );
		for( com.lukaspradel.steamapi.data.json.appnews.Newsitem n : games.getNews() ) {
			System.out.println( n.getTitle() + " : " + n.getContents() );
		}
	}
	public static void schemaForGame() {
		SchemaForGameManager games = new SchemaForGameManager( 34870 );
		for( com.lukaspradel.steamapi.data.json.getschemaforgame.Achievement g : games.getAchievementsOfGame() ) {
			System.out.println( g.getDisplayName() + " : " + g.getDefaultvalue() );
		}
	}
}