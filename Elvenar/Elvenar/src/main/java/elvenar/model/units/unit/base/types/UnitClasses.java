package elvenar.model.units.unit.base.types;
/**
 * Enumeration for unit classes.
 * @author M.Mucha
 *
 */
public enum UnitClasses {
	NONE( 0, "None" ),
	LIGHT_MELEE( 1, "Light Melee" ),
	SHORT_RANGED( 2, "Short Ranged" ),
	HEAVY_MELEE( 3, "Heavy Melee" ),
	HEAVY_RANGED( 4, "Heavy Ranged" ),
	MAGE( 5, "Mage" );
	private int id;
	private String name, description;
	
	UnitClasses( int id, String name ) {
		setId( id );
		setName( name );
		setDescription();
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
	public String getDescription() {
		return this.description;
	}
	private void setDescription() {
		if( this.id == 0 ) {
			this.description = "No description.";
		}
		if( this.id == 1 ) {
			this.description = "Basic close combat unit (good HP, good damage) ";
		}
		if( this.id == 2 ) {
			this.description = "Basic ranged fighter (good damage, weak HP)";
		}
		if( this.id == 3 ) {
			this.description = "Close combat unit with heavy armor (very good HP, weak damage) ";
		}
		if( this.id == 4 ) {
			this.description = "Special ranged unit (e.g. ranged but armored or long heavy shots but extremely weak HP) with some protection against short ranged units. ";
		}
		if( this.id == 5 ) {
			this.description = "Supporter unit with special magic abilities (weak HP, weak damage, able to modify attributes of target until the end of the following round) ";
		}
	}
}