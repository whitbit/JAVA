package elvenar.model.units.unit.base.types;
/**
 * Enumeration for races.
 * @author M.Mucha
 *
 */
public enum Race {
	NONE( 0, "NONE" ),
	HUMANS( 1, "HUMANS" ),
	ELVES( 2, "ELVES" ),
	PROVINCE_UNIT( 3, "PROVINCE UNIT" );

	private int id;
	private String name;

	Race( int id, String name ) {
		this.setId( id );
		this.setName( name );
	}
	
	public int getId() {
		return id;
	}
	private void setId( int id ) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	private void setName( String name ) {
		this.name = name;
	}
}