package controller.newsforapp;

import java.util.List;
import com.lukaspradel.steamapi.data.json.appnews.Appnews;
import com.lukaspradel.steamapi.data.json.appnews.GetNewsForApp;
import com.lukaspradel.steamapi.data.json.appnews.Newsitem;
import com.lukaspradel.steamapi.webapi.request.GetNewsForAppRequest;
import model.newsforapp.NewsOfApp;
/**
 * Class using for actions on app news from SteamWebApi.
 * @author M.Mucha
 */
public class NewsOfAppManager {
	private NewsOfApp newsOfApp;

	public NewsOfAppManager( int appID ) {
		setNewsOfApp( appID );
	}
	public NewsOfAppManager( int appID, int count, int maxLength ) {
		setNewsOfApp( appID, count, maxLength );
	}

	/**
	 * Method to gets model of app news.
	 * @return
	 */
	public NewsOfApp getNewsOfApp() {
		return newsOfApp;
	}
	/**
	 * Method to sets model of app news with specific app id.
	 * @param appID
	 */
	public void setNewsOfApp( int appID ) {
		this.newsOfApp = new NewsOfApp( appID );
	}
	/**
	 * Method to sets model of app news with specific app id, count of news and max lenght of article.
	 * @param appID
	 */
	public void setNewsOfApp( int appID, int count, int maxLength ) {
		this.newsOfApp = new NewsOfApp( appID, count, maxLength );
	}
	/**
	 * Method to gets app news from request.
	 * @return
	 */
	public GetNewsForAppRequest getRequest() {
		return getNewsOfApp().getRequest();
	}	
	/**
	 * Method to gets app news from request.
	 * @return
	 */
	public GetNewsForApp getNewsForApp() {
		return getNewsOfApp().getResult();
	}
	/**
	 * Method to gets list of app news from request.
	 * @return
	 */
	public Appnews getListOfAppnews() {
		return getNewsForApp().getAppnews();
	}
	/**
	 * Method to gets app news list.
	 * @return
	 */
	public List< Newsitem > getNews() {
		return getListOfAppnews().getNewsitems();
	}
}