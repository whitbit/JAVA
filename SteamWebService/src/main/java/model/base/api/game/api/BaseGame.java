package model.base.api.game.api;

import java.io.Serializable;
import model.base.api.game.IGameAPI;

public abstract class BaseGame implements Serializable, IGameAPI {
	private static final long serialVersionUID = -8916850535813006594L;
	private int appID = 0;
	
	public BaseGame() {}
	public BaseGame( Object appID ) {
		this.setAppID( checkAppID( appID ) );
	}

	protected int checkAppID( Object obj ) {
		if( obj instanceof Long ) {
			return ( ( Long ) obj ).intValue();
		} else if( obj instanceof Integer ) {
			return ( ( Integer ) obj ).intValue();
		} else {
			return 0;
		}
	}
	protected String buildUrlPath( String pathToIMG ) {
		StringBuilder sb = new StringBuilder( "http://media.steampowered.com/steamcommunity/public/images/apps/" );
		sb.append( this.appID );
		sb.append( "/" );
		sb.append( pathToIMG );
		sb.append( ".jpg" );
		return sb.toString();
	}
	public int getAppID() {
		return appID;
	}
	public void setAppID( Object appID ) {
		this.appID = checkAppID( appID );
	}
}