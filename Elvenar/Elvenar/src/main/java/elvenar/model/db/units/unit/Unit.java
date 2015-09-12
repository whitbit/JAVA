package elvenar.model.db.units.unit;
/**
 * Entity for units.
 * @author M.Mucha
 *
 */
public class Unit {
	private int unitId, damageMinimal, damageMaximum, hitpoints, weight, movementRange, attackRange, 
				initiative, strikeBack, promotion;
	private double attackBonus_1_Value, defenseBonus_1_Value, attackBonus_2_Value, defenseBonus_2_Value, 
				specialAbilityValue;
	private String unitType, unitClass, race, attackBonus_1_Type, defensBonus_1_Type, attackBonus_2_Type, 
				defensBonus_2_Type, specialAbilityType;

	public Unit() {}

	public int getUnitId() {
		return unitId;
	}
	public void setUnitId( int unitId ) {
		this.unitId = unitId;
	}
	public int getDamageMinimal() {
		return damageMinimal;
	}
	public void setDamageMinimal( int damageMinimal ) {
		this.damageMinimal = damageMinimal;
	}
	public int getDamageMaximum() {
		return damageMaximum;
	}
	public void setDamageMaximum( int damageMaximum ) {
		this.damageMaximum = damageMaximum;
	}
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints( int hitpoints ) {
		this.hitpoints = hitpoints;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight( int weight ) {
		this.weight = weight;
	}
	public int getMovementRange() {
		return movementRange;
	}
	public void setMovementRange( int movementRange ) {
		this.movementRange = movementRange;
	}
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange( int attackRange ) {
		this.attackRange = attackRange;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative( int initiative ) {
		this.initiative = initiative;
	}
	public int getStrikeBack() {
		return strikeBack;
	}
	public void setStrikeBack( int strikeBack ) {
		this.strikeBack = strikeBack;
	}
	public double getAttackBonus_1_Value() {
		return attackBonus_1_Value;
	}
	public void setAttackBonus_1_Value( double attackBonus_1_Value ) {
		this.attackBonus_1_Value = attackBonus_1_Value;
	}
	public double getDefenseBonus_1_Value() {
		return defenseBonus_1_Value;
	}
	public void setDefenseBonus_1_Value( double defenseBonus_1_Value ) {
		this.defenseBonus_1_Value = defenseBonus_1_Value;
	}
	public double getAttackBonus_2_Value() {
		return attackBonus_2_Value;
	}
	public void setAttackBonus_2_Value( double attackBonus_2_Value ) {
		this.attackBonus_2_Value = attackBonus_2_Value;
	}
	public double getDefenseBonus_2_Value() {
		return defenseBonus_2_Value;
	}
	public void setDefenseBonus_2_Value( double defenseBonus_2_Value ) {
		this.defenseBonus_2_Value = defenseBonus_2_Value;
	}
	public double getSpecialAbilityValue() {
		return specialAbilityValue;
	}
	public void setSpecialAbilityValue( double specialAbilityValue ) {
		this.specialAbilityValue = specialAbilityValue;
	}
	public int getPromotion() {
		return promotion;
	}
	public void setPromotion( int promotion ) {
		this.promotion = promotion;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType( String unitType ) {
		this.unitType = unitType;
	}
	public String getUnitClass() {
		return unitClass;
	}
	public void setUnitClass( String unitClass ) {
		this.unitClass = unitClass;
	}
	public String getRace() {
		return race;
	}
	public void setRace( String race ) {
		this.race = race;
	}
	public String getAttackBonus_1_Type() {
		return attackBonus_1_Type;
	}
	public void setAttackBonus_1_Type( String attackBonus_1_Type ) {
		this.attackBonus_1_Type = attackBonus_1_Type;
	}
	public String getDefensBonus_1_Type() {
		return defensBonus_1_Type;
	}
	public void setDefensBonus_1_Type( String defensBonus_1_Type ) {
		this.defensBonus_1_Type = defensBonus_1_Type;
	}
	public String getAttackBonus_2_Type() {
		return attackBonus_2_Type;
	}
	public void setAttackBonus_2_Type( String attackBonus_2_Type ) {
		this.attackBonus_2_Type = attackBonus_2_Type;
	}
	public String getDefensBonus_2_Type() {
		return defensBonus_2_Type;
	}
	public void setDefensBonus_2_Type( String defensBonus_2_Type ) {
		this.defensBonus_2_Type = defensBonus_2_Type;
	}
	public String getSpecialAbilityType() {
		return specialAbilityType;
	}
	public void setSpecialAbilityType( String specialAbilityType ) {
		this.specialAbilityType = specialAbilityType;
	}
}