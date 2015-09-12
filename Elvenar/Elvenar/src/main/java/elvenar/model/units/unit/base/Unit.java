package elvenar.model.units.unit.base;

import elvenar.model.units.unit.IUnit;
import elvenar.model.units.unit.base.bonus.Bonuses;
import elvenar.model.units.unit.base.stat.Statistics;
import elvenar.model.units.unit.base.types.Race;
import elvenar.model.units.unit.base.types.UnitClasses;
/**
 * Base abstract Unit class.
 * @author M.Mucha
 */
public abstract class Unit implements IUnit {
	private String unitType;
	private UnitClasses classes;
	private Bonuses bonuses;
	private Statistics statistics;
	private boolean promotion = false;
	
	public abstract void setBonuses();
	public abstract String getAttackBonus_1_Type();
	public abstract String getAttackBonus_2_Type();
	public abstract String getDefenseBonus_1_Type();
	public abstract String getDefenseBonus_2_Type();
	public abstract double getAttackBonus_1();
	public abstract double getAttackBonus_2();
	public abstract double getDefenseBonus_1();
	public abstract double getDefenseBonus_2();
	public abstract String getSpecialAbilityType();
	public abstract double getSpecialAbility();
	public abstract void unitPromotion();

	public Unit() {
		this.setUnitClass( UnitClasses.NONE );
		this.unitType = UnitClasses.NONE.getName();
		this.statistics = new Statistics();
		this.setAttributes( /* damageMinimal */0, /* damageMaximum */0, /* hitpoints */0, /* weight */0, 
				/* movementRange */0, /* attackRange */0, /* initiative */0, /* strikeBack */ false 
		);
		this.setBonuses( new Bonuses() );
		this.setBonuses();
		this.setPromotion( false );
	}

	/* Base methods.
	 */
	public String getUnitType() {
		return this.unitType;
	}
	public int getPromotion() {
		return ( promotion ) ? 1 : 0;
	}
	protected void setPromotion( boolean is ) {
		this.promotion = is;
	}
	protected boolean isPromotion() {
		return this.promotion;
	}
	public String getUnitClass() {
		return this.classes.getName();
	}
	protected void setUnitClass( UnitClasses calasses ) {
		this.classes = calasses;
	}
	public String getRace() {
		return Race.NONE.getName();
	}
	protected Statistics getStatistics() {
		return this.statistics;
	}
	public Bonuses getBonuses() {
		return bonuses;
	}
	private void setBonuses( Bonuses bonuses ) {
		this.bonuses = bonuses;
	}
	public int getDamageMinimal() {
		return this.statistics.getDamageMinimal();
	}
	public int getDamageMaximum() {
		return this.statistics.getDamageMaximum();
	}
	public int getHitpoints() {
		return this.statistics.getHitpoints();
	}
	public int getWeight() {
		return this.statistics.getWeight();
	}
	public int getMovementRange() {
		return this.statistics.getMovementRange();
	}
	public int getAttackRange() {
		return this.statistics.getAttackRange();
	}
	public int getInitiative() {
		return this.statistics.getInitiative();
	}
	public int getStrikeBack() {
		return this.statistics.getStrikeBack();
	}	
	/**
	 * Method sets all base attributes.
	 * @param damageMinimal
	 * @param damageMaximum
	 * @param hitpoints
	 * @param weight
	 * @param movementRange
	 * @param attackRange
	 * @param initiative
	 * @param strikeBack
	 */
	protected final void setAttributes( int damageMinimal, int damageMaximum, int hitpoints, int weight, int movementRange, int attackRange, int initiative, boolean strikeBack ) {		
		this.statistics = new Statistics();
		this.statistics.setAttributes( damageMinimal, damageMaximum, hitpoints, weight, movementRange, attackRange, initiative, strikeBack );	
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder( getUnitType() );
		return sb.toString();
	}
}