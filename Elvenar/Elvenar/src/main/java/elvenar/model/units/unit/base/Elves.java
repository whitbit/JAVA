package elvenar.model.units.unit.base;

import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.Race;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ElvesType;
/**
 * 
 * @author M.Mucha
 *
 */
public abstract class Elves extends Unit {
	private ElvesType elvesType;
	
	public Elves() {
		this.setUnitClass( UnitClasses.NONE );
		this.setElvesType( ElvesType.ELVES );
	}
	public Elves( UnitClasses UNIT_CLASS, ElvesType Elves_TYPE ) {
		this.setUnitClass( UNIT_CLASS );
		this.setElvesType( Elves_TYPE );
	}
	
	public String getRace() {
		return Race.ELVES.getName();
	}
	@Override
	public String getUnitType() {
		return this.getElvesType().getName();
	}
	@Override
	public void unitPromotion() {}
	protected ElvesType getElvesType() {
		return this.elvesType;
	}
	protected final void setElvesType( ElvesType elvesType ) {
		this.elvesType = elvesType;
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