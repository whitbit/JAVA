package elvenar.model.units.unit.base.types;
/**
 * Enumeration for elves type.
 * @author M.Mucha
 *
 */
public enum ElvesType {
	ELVES( 0, "Elves" ),
	SWORD_DANCER( 1, "SwordDancer" ),
	ARCHER( 2, "Archer" ),
	TREANT( 3, "Treant" ),
	GOLEM( 4, "Golem" ),
	SORCERESS( 5, "Sorceress" ),
	SWORD_DANCER_II( 6, "SwordDancer II" ),
	ARCHER_II( 7, "Archer II" ),
	TREANT_II( 8, "Treant II" ),
	GOLEM_II( 9, "Golem II" ),
	SORCERESS_II( 10, "Sorceress II" );
	private int id;
	private String name;
	
	ElvesType( int id, String name ) {
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