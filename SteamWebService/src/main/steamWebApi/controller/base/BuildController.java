package controller.base;

import java.util.ArrayList;
import java.util.List;
/**
 * Specified builder to further inherits and make correct builder operations on specific model in controller.
 * @author M.Mucha
 */
public abstract class BuildController extends SteamWebApiBaseController {
	public BuildController() {
		super();
	}
	/**
	 * Base builder using for actions needed specific steam id.
	 * @author M.Mucha
	 */
	public abstract static class BaseBuilderWithSteamID extends BaseBuilder {
		private String steamID = null;
		public BaseBuilderWithSteamID( String steamID ) {
			this.steamID = steamID;
		}
		/**
		 * Method to gets steam id of user.
		 * @return steamID
		 */
		protected String getSteamID() {
			return steamID;
		}
	}
	/**
	 * Base builder using for actions needed specific steam id list.
	 * @author M.Mucha
	 */
	public abstract static class BaseBuilderWithSteamIDList extends BaseBuilder {
		private List< String > steamIDs = null;
		public BaseBuilderWithSteamIDList( List< String > steamIDs ) {
			this.steamIDs = steamIDs;
		}
		public BaseBuilderWithSteamIDList( String... steamIDsParams ) {
			this.steamIDs = convertListFromParams( steamIDsParams );
		}
		/**
		 * Method to convert from string params to list of strings.
		 * @param steamIDsParams
		 * @return List< String > list
		 */
		private List< String > convertListFromParams( String... steamIDsParams ) {
			List< String > list = new ArrayList<String >();
			for( String id : steamIDsParams ) {
				list.add( id );
			}
			return list;
		}
		/**
		 * Method to gets list of steam ids.
		 * @return List< String > 
		 */
		protected List< String > getSteamIDsList() {
			return steamIDs;
		}
	}
	/**
	 * Base builder using for actions needed specific app id.
	 * @author M.Mucha
	 */
	public abstract static class BaseBuilderWithAppID extends BaseBuilder {
		private Integer appID = null;
		public BaseBuilderWithAppID( int appID ) {
			this.appID = appID;
		}
		/**
		 * Method to gets id of app.
		 * @return appID
		 */
		protected Integer getAppID() {
			return appID;
		}
	}
}