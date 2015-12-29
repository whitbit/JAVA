package controller.newsforapp;

import java.util.List;
import model.exception.connection.ConnectionException;
import model.newsforapp.ISteamNewsOfApp;
import model.newsforapp.NewsOfApp;
import com.lukaspradel.steamapi.data.json.appnews.Appnews;
import com.lukaspradel.steamapi.data.json.appnews.GetNewsForApp;
import com.lukaspradel.steamapi.data.json.appnews.Newsitem;
import com.lukaspradel.steamapi.webapi.request.GetNewsForAppRequest;

import controller.base.BuildController;
/**
 * Class using for actions on app news from SteamWebApi.
 * @author M.Mucha
 */
public class NewsForAppControl extends BuildController {
	private static ISteamNewsOfApp newsOfApp = null;

	public NewsForAppControl() {}
	private NewsForAppControl( Builder builder ) {
		newsOfApp = builder.initialize();
	}

	/**
	 * Builder using to build object of app news controller to further actions.
	 * @author M.Mucha
	 */
	public static class Builder extends BuildController.BaseBuilderWithAppID {	
		private Integer count, maxLength = null;
		public Builder( int appID ) {
			super( appID );
		}
		/**
		 * Sets count of news for app.
		 * @param count
		 * @return Builder
		 */
		public Builder setCount( int count ) {
			this.count = count;
			return this;
		}
		/**
		 * Sets max length of news.
		 * @param maxLength
		 * @return Builder
		 */
		public Builder setMaxLength( int maxLength ) {
			this.maxLength = maxLength;
			return this;
		}	
		
		@SuppressWarnings("unchecked")
		@Override
		protected ISteamNewsOfApp initialize() {
			if( this.count == null && this.maxLength == null ) {
				return new NewsOfApp( this.getAppID() );
			} else {
				return new NewsOfApp( this.getAppID(), this.count, this.maxLength );
			}
		}	
		@SuppressWarnings("unchecked")
		@Override
		public NewsForAppControl build() {
			return new NewsForAppControl( this );
		}
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public NewsOfApp getBasicModel() {
		return newsOfApp.getModel();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetNewsForAppRequest getRequest() {
		try {
			return getBasicModel().getRequest();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GetNewsForApp getResult() {
		try {
			return getBasicModel().getResult();
		} catch( ConnectionException e ) {
			this.getLogger().showExceptionLogging( e );
			return null;
		}
	}

	/**
	 * Method to gets app news object from request to further actions.
	 * @return Appnews
	 */
	public Appnews getAppnewsObject() {
		return getResult().getAppnews();
	}
	
	/**
	 * Method to gets app news list.
	 * @return List< Newsitem >
	 */
	public List< Newsitem > getNewsList() {
		return getAppnewsObject().getNewsitems();
	}
}