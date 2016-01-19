package model.base.api.game;
import java.util.ArrayList;
import java.util.List;
import model.base.api.game.Game;
import controller.ownedgames.OwnedGamesControl;
import controller.recentlyplayedgames.RecentlyPlayedGamesControl;

public class GameLibrary {
	private String steamID = null;
	private OwnedGamesControl owned = null;
	private RecentlyPlayedGamesControl recentlyPlayed = null;	
	private List< Game > ownedGames, recentlyPlayedGames, allGames, fullDataGames = null;
	
	
	public GameLibrary( String steamID ) {
		this.steamID = steamID;
		this.owned = new OwnedGamesControl.Builder( this.steamID ).build();
		this.recentlyPlayed = new RecentlyPlayedGamesControl.Builder( this.steamID ).build();
		this.initialize( true );
	}
	public GameLibrary( String steamID, boolean baseData ) {
		this.steamID = steamID;
		this.owned = new OwnedGamesControl.Builder( this.steamID ).build();
		this.recentlyPlayed = new RecentlyPlayedGamesControl.Builder( this.steamID ).build();
		this.initialize( baseData );
	}
	
	
	private int boolValue( boolean value ) {
		return ( value ) ? 1 : 0;
	}
	private final void initialize( boolean baseData ) {
		System.out.println( boolValue( baseData ) );
		switch( boolValue( baseData ) ) {
			case 0:
				this.ownedGames = new ArrayList< Game >();
				this.recentlyPlayedGames = new ArrayList< Game >();
				this.allGames = new ArrayList< Game >();
				this.fullDataGames = new ArrayList< Game >();
				break;
			case 1:
				this.ownedGames = new ArrayList< Game >();
				this.recentlyPlayedGames = new ArrayList< Game >();
				this.allGames = new ArrayList< Game >();
				
				this.ownedGames = this.setOwnedGames();
				this.recentlyPlayedGames = this.setRecentlyPlayedGames();
				this.allGames = this.setAllGames();
				
				this.fullDataGames = new ArrayList< Game >();
				break;
			default:
				break;
		}
	}
	public List< Game > setOwnedGames() {
		this.owned.getGamesList().forEach( ( owned ) -> {
			Game game = new Game( owned.getAppid() );
			game.setImgIconUrl( owned.getImgIconUrl() );
			game.setImgLogoURL( owned.getImgLogoUrl() );
			game.setName( owned.getName() );
			game.setPlaytimeForever( owned.getPlaytimeForever() );
			
			this.ownedGames.add( game );
		});
		return this.ownedGames;
	}
	public List< Game > setRecentlyPlayedGames() {
		this.recentlyPlayed.getRecentlyPlayedGamesList().forEach( ( recently ) -> {
			Game game = new Game( recently.getAppid() );
			game.setPlaytime2weeks( recently.getPlaytime2weeks() );
			
			this.recentlyPlayedGames.add( game );
		});
		return this.recentlyPlayedGames;
	}
	public List< Game > setAllGames() {
		final List< Game > gOwned = this.setOwnedGames();
		final List< Game > rPlay = this.setRecentlyPlayedGames();
		
		for( Game g_Owned : gOwned ) {
			rPlay.forEach( ( g_Recently ) -> {
				if( g_Recently.getAppID() == g_Owned.getAppID() ) {
					g_Owned.setPlaytime2weeks( g_Recently.getPlaytime2weeks() );
					g_Owned.setPlaytime2weeks( g_Recently.getPlaytime2weeks() );
				}
			});
			this.allGames.add( g_Owned );
		}
		return this.allGames;
	}
	public List< Game > setFullDataGames() {
		final List< Game > games = this.setAllGames();
		
		games.forEach( ( g ) -> {
			Game game = g.generateFromStorefrontApi( g.getAppID() );
			this.fullDataGames.add( game );
		});
		return this.fullDataGames;
	}

	public String getSteamID() {
		return steamID;
	}
	public void setSteamID( String steamID ) {
		this.steamID = steamID;
	}
	public List< Game > getOwnedGames() {
		return ownedGames;
	}
	public void setOwnedGames( List< Game > ownedGames ) {
		this.ownedGames = ownedGames;
	}
	public List< Game > getRecentlyPlayedGames() {
		return recentlyPlayedGames;
	}
	public void setRecentlyPlayedGames( List< Game > recentlyPlayedGames ) {
		this.recentlyPlayedGames = recentlyPlayedGames;
	}
	public List< Game > getAllGames() {
		return allGames;
	}
	public void setAllGames( List< Game > allGames ) {
		this.allGames = allGames;
	}
	public List< Game > getFullDataGames() {
		return fullDataGames;
	}
	public void setFullDataGames( List< Game > fullDataGames ) {
		this.fullDataGames = fullDataGames;
	}
}