package elvenar.model.units.unit.base.types;
/**
 * Enumeration for humans types.
 * @author M.Mucha
 *
 */
public enum HumansType {
	HUMANS( 0, "Humans" ),
	AXE_BARBARIAN( 1, "AxeBarbarian" ),
	CROSSBOWMAN( 2, "Crossbowman" ),
	CERBERUS( 3, "Cerberus" ),
	PALADIN( 4, "Paladin" ),
	PRIEST( 5, "Priest" ),
	AXE_BARBARIAN_II( 1, "AxeBarbarian II" ),
	CROSSBOWMAN_II( 2, "Crossbowman II" ),
	CERBERUS_II( 3, "Cerberus II" ),
	PALADIN_II( 4, "Paladin II" ),
	PRIEST_II( 5, "Priest II" );
	private int id;
	private String name;
	
	HumansType( int id, String name ) {
		setId( id );
		setName( name );
	}
	
	public int getId() {
		return this.id;
	}
	private void setId( int id ) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	private void setName( String name ) {
		this.name = name;
	}
}