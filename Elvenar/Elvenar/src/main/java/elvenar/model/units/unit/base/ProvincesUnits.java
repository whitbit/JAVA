package elvenar.model.units.unit.base;

import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.Race;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public abstract class ProvincesUnits extends Unit {
	private ProvinceUnitsType provinceTypeUnits;
	
	public ProvincesUnits() {
		this.setUnitClass( UnitClasses.NONE );
		this.setProvinceTypeUnits( ProvinceUnitsType.PROVINCE_UNIT );
	}
	public ProvincesUnits( UnitClasses UNIT_CLASS, ProvinceUnitsType ProvinceTypeUnits ) {
		this.setUnitClass( UNIT_CLASS );
		this.setProvinceTypeUnits( ProvinceTypeUnits );
	}

	public String getRace() {
		return Race.PROVINCE_UNIT.getName();
	}
	@Override
	public String getUnitType() {
		return this.getProvinceTypeUnits().getName();
	}
	@Override
	public void unitPromotion() {}
	protected ProvinceUnitsType getProvinceTypeUnits() {
		return this.provinceTypeUnits;
	}
	protected final void setProvinceTypeUnits( ProvinceUnitsType provinceTypeUnits ) {
		this.provinceTypeUnits = provinceTypeUnits;;
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