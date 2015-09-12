package elvenar.model.units.unit.base.bonus;
/**
 * Enumeration for special abilities of units.
 * @author M.Mucha
 *
 */
public enum SpecialAbility {
	NONE( 0, "NONE", 0.0 ),
	DIVINE_CURSE( 1, "DIVINE CURSE", 0.3 ),
	BROKEN_VALOR( 2, "BROKEN VALOR", 0.5 ),
	WOUND_ENEMIES( 3, "WOUND ENEMIES", 0.1 ),
	DAZE_ENEMIES( 4, "DAZE ENEMIES", 0.2 ),
	PIERCE_CURSE( 5, "PIERCE CURSE", 0.5 ),
	DIVINE_CURSE_II( 6, "DIVINE CURSE II", 0.4 ),
	BROKEN_VALOR_II( 7, "BROKEN VALOR II", 0.9 ),
	WOUND_ENEMIES_II( 8, "WOUND ENEMIES II", 0.2 ),
	DAZE_ENEMIES_II( 9, "DAZE ENEMIES II", 0.4 ),
	PIERCE_CURSE_II( 10, "PIERCE CURSE II", 0.9 );
	
	private int id;
	private double value;
	private String name, description;

	SpecialAbility( int id, String name, double value ) {
		this.setId( id );
		this.setName( name );
		this.setValue( value );
		this.setDescription();
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
	public double getValue() {
		return value;
	}
	private void setValue( double value ) {
		this.value = value;
	}
	private void setDescription() {
		if( this.id == 0 ) {
			this.description = "No description.";
		}
		if( this.id == 1 || this.id == 6 ) {
			this.description = "Increases incoming damage on target until the end of next round.";
		}
		if( this.id == 2 || this.id == 7 ) {
			this.description = "Weakens attack of target until the end of next round.";
		}
		if( this.id == 3 || this.id == 8 ) {
			this.description = "Increases incoming damage on target in the current round.";
		}
		if( this.id == 4 || this.id == 9 ) {
			this.description = "Weakens attack of target in the current round.";
		}
		if( this.id == 5 || this.id == 10 ) {
			this.description = "Increases incoming damage on target until the end of next round.";
		}
	}
}