package elvenar.model.db.units.types;
/**
 * Entity for special abilities.
 * @author M.Mucha
 *
 */
public class Special_Ability {
	private int specAbilityId;
	private double value;
	private String name, description;

	public Special_Ability() {}

	public int getSpecAbilityId() {
		return specAbilityId;
	}
	public void setSpecAbilityId( int specAbilityId ) {
		this.specAbilityId = specAbilityId;
	}
	public double getValue() {
		return value;
	}
	public void setValue( double value ) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription( String description ) {
		this.description = description;
	}
}