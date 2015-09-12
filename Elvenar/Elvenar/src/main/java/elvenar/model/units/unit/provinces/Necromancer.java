package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Necromancer extends ProvincesUnits {
	public Necromancer() {
		super( UnitClasses.MAGE, ProvinceUnitsType.NECROMANCER );
		setAttributes( /*damageMinimal*/6, /*damageMaximum*/12, /*hitpoints*/32, /*weight*/4, 
				/*movementRange*/4, /*attackRange*/4, /*initiative*/3, /*strikeBack*/false 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_HR( 0.6 );
		this.getBonuses().setAttackBonus_LM( 0.6 );
		this.getBonuses().setDefenseBonus_SR( 0.8 );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return this.getBonuses().getAttackBonus_HR_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_HR();
	}
	@Override
	public String getAttackBonus_2_Type() {
		return this.getBonuses().getAttackBonus_LM_Type();
	}
	@Override
	public double getAttackBonus_2() {
		return this.getBonuses().getAttackBonus_LM();
	}
	@Override
	public String getDefenseBonus_1_Type() {
		return this.getBonuses().getDefenseBonus_SR_Type();
	}	
	@Override
	public double getDefenseBonus_1() {
		return this.getBonuses().getDefenseBonus_SR();
	}
	@Override
	public String getSpecialAbilityType() {
		return SpecialAbility.PIERCE_CURSE.getName();
	}
	@Override
	public double getSpecialAbility() {
		return SpecialAbility.PIERCE_CURSE.getValue();
	}
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
}