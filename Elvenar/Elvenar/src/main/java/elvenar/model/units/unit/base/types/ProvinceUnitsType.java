package elvenar.model.units.unit.base.types;
/**
 * Enumeration for procinves units type.
 * @author ulQuiorra
 *
 */
public enum ProvinceUnitsType {
	PROVINCE_UNIT( 0, "ProvinceUnits" ),
	THIEF( 1, "Thief" ),
	BANDIT( 2, "Bandit" ),
	WAR_DOG( 3, "WarDog" ),
	ORC( 4, "Orc" ),
	ARCHERY( 5, "Archery" ),
	KNIGHT( 6, "Knight" ),
	STEINLING( 7, "Steinling" ),
	SWAMP_MONSTER( 8, "SwampMonster" ),
	NECROMANCER( 9, "Necromancer" ),
	CANNONEER( 10, "Cannoneer" ),
	GOLEM( 11, "Golem" ),
	GOLEM_II( 12, "Golem II" ),
	TREANT( 11, "Treant" ),
	TREANT_II( 12, "Treant II" ),
	CERBERUS_II( 13, "Cerberus II" );
	private int id;
	private String name;
	
	ProvinceUnitsType( int id, String name ) {
		setId( id );
		setName( name );
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