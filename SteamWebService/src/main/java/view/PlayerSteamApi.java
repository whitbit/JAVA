package view;

import controller.isplayingsharedgames.IsPlayingSharedGamesControl;
import controller.playerachievements.PlayerAchievementsControl;
import controller.playerbans.PlayerBansControl;
import controller.playersummaries.PlayerSummariesControl;
import controller.friends.FriendsControl;

public class PlayerSteamApi {
	private String steamID = null;
	private PlayerSummariesControl playerAPI = null;
	private PlayerBansControl banAPI = null;
	private PlayerAchievementsControl playerAchievements = null;
	private IsPlayingSharedGamesControl isPlayingSharedGames = null;
	private FriendsControl friends = null;
	

	public PlayerSteamApi() {}
	public PlayerSteamApi( String steamID ) {
		this.steamID = steamID;
		this.playerAPI = new PlayerSummariesControl.Builder( this.steamID ).build();
		this.banAPI = new PlayerBansControl.Builder( this.steamID ).build();
		this.playerAchievements = new PlayerAchievementsControl.Builder( this.steamID ).build();
		this.isPlayingSharedGames = new IsPlayingSharedGamesControl.Builder( this.steamID ).build();
		this.friends = new FriendsControl.Builder( this.steamID ).build();
	}
	
	
	public String getSteamName() {
		return this.playerAPI.getPlayerSummaryList().get(0).getPersonaname();
	}
	public String getSteamID() {
		return this.playerAPI.getPlayerSummaryList().get(0).getSteamid();
	}
	public String getProfileURL() {
		return this.playerAPI.getPlayerSummaryList().get(0).getProfileurl();
	}
	public int getVisibilityState() {
		return this.playerAPI.getPlayerSummaryList().get(0).getCommunityvisibilitystate();
	}
	public int getCurrentStatus() {
		return this.playerAPI.getPlayerSummaryList().get(0).getProfilestate();
	}
	public long getLastLogin() {
		return this.playerAPI.getPlayerSummaryList().get(0).getLastlogoff();
	}
	public long getCreatedTime() {
		return this.playerAPI.getPlayerSummaryList().get(0).getTimecreated();
	}
	public String getName() {
		return this.playerAPI.getPlayerSummaryList().get(0).getRealname();
	}
	public String getCountry() {
		return this.playerAPI.getPlayerSummaryList().get(0).getLoccountrycode();
	}
	public String getState() {
		return this.playerAPI.getPlayerSummaryList().get(0).getLocstatecode();
	}
	public String getCity() {
		return this.playerAPI.getPlayerSummaryList().get(0).getLoccityid().toString();
	}
	public String getAvatarURL() {
		return this.playerAPI.getPlayerSummaryList().get(0).getAvatarmedium();
	}
	public boolean getVacBan() {
		return this.banAPI.getPlayerBansList().get(0).getVACBanned();
	}
	public boolean getCommunityBan() {
		return this.banAPI.getPlayerBansList().get(0).getCommunityBanned();
	}
	public String getEconomyBan() {
		return this.banAPI.getPlayerBansList().get(0).getEconomyBan();
	}
	public int getDaysFromLastBan() {
		return this.banAPI.getPlayerBansList().get(0).getDaysSinceLastBan();
	}
	public int getVacBansCount() {
		return this.banAPI.getPlayerBansList().get(0).getNumberOfVACBans();
	}	
	
}