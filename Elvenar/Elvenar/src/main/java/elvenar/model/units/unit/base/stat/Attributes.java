package elvenar.model.units.unit.base.stat;
/**
 * Enumeration for attribute statistics.
 * @author M.Mucha
 *
 */
public enum Attributes {
	DAMAGE_MINIMAL( 0, "DAMAGE_MINIMAL" ),
	DAMAGE_MAXIMUM( 1, "DAMAGE_MAXIMUM" ),
	HITPOINTS( 2, "HITPOINTS" ),
	WEIGHT( 3, "WEIGHT" ),
	MOVEMENT_RANGE( 4, "MOVEMENT_RANGE" ),
	ATTACK_RANGE( 5, "ATTACK_RANGE" ),
	INITIATIVE( 6, "INITIATIVE" ),
	STRIKE_BACK( 7, "STRIKE_BACK" );
	private int id;
	private String name;
	
	Attributes( int id, String name ) {
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