package model.base.language;
/**
 * Basic language enumerator using in webservice.
 * @author M.Mucha
 */
public enum Language {
	EN( "english" ),
	PL( "polish" );
	
	private String name;	
	Language( String name ) {
		this.name = name;
	}
	/**
	 * Get the full name of using language.
	 * @return name
	 */
	public String getName() {
		return name;
	}
}