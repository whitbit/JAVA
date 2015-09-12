package elvenar.model.units.unit.base;

import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.Race;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.HumansType;
/**
 * 
 * @author M.Mucha
 *
 */
public abstract class Humans extends Unit {
	private HumansType humansType;
	
	public Humans() {
		this.setUnitClass( UnitClasses.NONE );
		this.setHumansType( HumansType.HUMANS );
	}	
	public Humans( UnitClasses UNIT_CLASS, HumansType Humans_TYPE ) {
		this.setUnitClass( UNIT_CLASS );
		this.setHumansType( Humans_TYPE );
	}
	
	public String getRace() {
		return Race.HUMANS.getName();
	}
	@Override
	public String getUnitType() {
		return this.getHumansType().getName();
	}
	@Override
	public void unitPromotion() {}
	protected HumansType getHumansType() {
		return this.humansType;
	}
	protected final void setHumansType( HumansType humansType ) {
		this.humansType = humansType;
	}
	@Override
	public String getAttackBonus_1_Type() {
		return UnitClasses.NONE.getName();
	}
	@Override
	public String getAttackBonus_2_Type() {
		return UnitClasses.NONE.getName();
	}
	@Override
	public String getDefenseBonus_1_Type() {
		return UnitClasses.NONE.getName();
	}
	@Override
	public String getDefenseBonus_2_Type() {
		return UnitClasses.NONE.getName();
	}
	@Override
	public double getAttackBonus_1() {
		return 0;
	}
	@Override
	public double getAttackBonus_2() {
		return 0;
	}
	@Override
	public double getDefenseBonus_1() {
		return 0;
	}
	@Override
	public double getDefenseBonus_2() {
		return 0;
	}
	@Override
	public String getSpecialAbilityType() {
		return SpecialAbility.NONE.getName();
	}
	@Override
	public double getSpecialAbility() {
		return SpecialAbility.NONE.getValue();
	}
	@Override
	public void setBonuses() {}
}