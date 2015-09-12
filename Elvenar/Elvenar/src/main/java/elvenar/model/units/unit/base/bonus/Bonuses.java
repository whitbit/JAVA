package elvenar.model.units.unit.base.bonus;

import java.util.HashMap;

import elvenar.model.units.unit.base.types.UnitClasses;
/**
 * Attack bonuses && Defense bonuses for units.
 * @author M.Mucha
 *
 */
public class Bonuses {
	private final HashMap< UnitClasses, Double > MAP_ATTACK = new HashMap< UnitClasses, Double >();
	private final HashMap< UnitClasses, Double > MAP_DEFENSE = new HashMap< UnitClasses, Double >();

	public Bonuses() {
		this.setBonuses();
	}

	public String getAttackBonus_N_Type() {
		return UnitClasses.NONE.getName();
	}
	public String getAttackBonus_HM_Type() {
		return UnitClasses.HEAVY_MELEE.getName();
	}
	public double getAttackBonus_HM() {
		return this.MAP_ATTACK.get( UnitClasses.HEAVY_MELEE );
	}
	public void setAttackBonus_HM( double value ) {
		this.MAP_ATTACK.put( UnitClasses.HEAVY_MELEE, value );
	}
	public String getAttackBonus_HR_Type() {
		return UnitClasses.HEAVY_RANGED.getName();
	}
	public double getAttackBonus_HR() {
		return this.MAP_ATTACK.get( UnitClasses.HEAVY_RANGED );
	}
	public void setAttackBonus_HR( double value ) {
		this.MAP_ATTACK.put( UnitClasses.HEAVY_RANGED, value );
	}
	public String getAttackBonus_LM_Type() {
		return UnitClasses.LIGHT_MELEE.getName();
	}
	public double getAttackBonus_LM() {
		return this.MAP_ATTACK.get( UnitClasses.LIGHT_MELEE );
	}
	public void setAttackBonus_LM( double value ) {
		this.MAP_ATTACK.put( UnitClasses.LIGHT_MELEE, value );
	}
	public String getAttackBonus_M_Type() {
		return UnitClasses.MAGE.getName();
	}
	public double getAttackBonus_M() {
		return this.MAP_ATTACK.get( UnitClasses.MAGE );
	}
	public void setAttackBonus_M( double value ) {
		this.MAP_ATTACK.put( UnitClasses.MAGE, value );
	}
	public String getAttackBonus_SR_Type() {
		return UnitClasses.SHORT_RANGED.getName();
	}
	public double getAttackBonus_SR() {
		return this.MAP_ATTACK.get( UnitClasses.SHORT_RANGED );
	}
	public void setAttackBonus_SR( double value ) {
		this.MAP_ATTACK.put( UnitClasses.SHORT_RANGED, value );
	}
	public String getDefenseBonus_N_Type() {
		return UnitClasses.NONE.getName();
	}
	public String getDefenseBonus_HM_Type() {
		return UnitClasses.HEAVY_MELEE.getName();
	}
	public double getDefenseBonus_HM() {
		return this.MAP_DEFENSE.get( UnitClasses.HEAVY_MELEE );
	}
	public void setDefenseBonus_HM( double value ) {
		this.MAP_DEFENSE.put( UnitClasses.HEAVY_MELEE, value );
	}
	public String getDefenseBonus_HR_Type() {
		return UnitClasses.HEAVY_RANGED.getName();
	}
	public double getDefenseBonus_HR() {
		return this.MAP_DEFENSE.get( UnitClasses.HEAVY_RANGED );
	}
	public void setDefenseBonus_HR( double value ) {
		this.MAP_DEFENSE.put( UnitClasses.HEAVY_RANGED, value );
	}
	public String getDefenseBonus_LM_Type() {
		return UnitClasses.LIGHT_MELEE.getName();
	}
	public double getDefenseBonus_LM() {
		return this.MAP_DEFENSE.get( UnitClasses.LIGHT_MELEE );
	}
	public void setDefenseBonus_LM( double value ) {
		this.MAP_DEFENSE.put( UnitClasses.LIGHT_MELEE, value );
	}
	public String getDefenseBonus_M_Type() {
		return UnitClasses.MAGE.getName();
	}
	public double getDefenseBonus_M() {
		return this.MAP_DEFENSE.get( UnitClasses.MAGE );
	}
	public void setDefenseBonus_M( double value ) {
		this.MAP_DEFENSE.put( UnitClasses.MAGE, value );
	}
	public String getDefenseBonus_SR_Type() {
		return UnitClasses.SHORT_RANGED.getName();
	}
	public double getDefenseBonus_SR() {
		return this.MAP_DEFENSE.get( UnitClasses.SHORT_RANGED );
	}
	public void setDefenseBonus_SR( double value ) {
		this.MAP_DEFENSE.put( UnitClasses.SHORT_RANGED, value );
	}
	
	private final void setBonuses() {
		setAttackBonus_HM( 0.0 );
		setAttackBonus_HR( 0.0 );
		setAttackBonus_LM( 0.0 );
		setAttackBonus_M( 0.0 );
		setAttackBonus_SR( 0.0 );
		
		setDefenseBonus_HM( 0.0 );
		setDefenseBonus_HR( 0.0 );
		setDefenseBonus_LM( 0.0 );
		setDefenseBonus_M( 0.0 );
		setDefenseBonus_SR( 0.0 );
	}
}