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
public class SwampMonster extends ProvincesUnits {
	public SwampMonster() {
		super( UnitClasses.HEAVY_MELEE, ProvinceUnitsType.SWAMP_MONSTER );
		setAttributes( /*damageMinimal*/25, /*damageMaximum*/53, /*hitpoints*/108, /*weight*/6, 
				/*movementRange*/2, /*attackRange*/1, /*initiative*/7, /*strikeBack*/true 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_LM( 0.3 );
		this.getBonuses().setDefenseBonus_LM( 0.6 );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return this.getBonuses().getAttackBonus_LM_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_LM();
	}
	@Override
	public String getDefenseBonus_1_Type() {
		return this.getBonuses().getDefenseBonus_LM_Type();
	}	
	@Override
	public double getDefenseBonus_1() {
		return this.getBonuses().getDefenseBonus_LM();
	}
	@Override
	public String getSpecialAbilityType() {
		return SpecialAbility.DAZE_ENEMIES.getName();
	}
	@Override
	public double getSpecialAbility() {
		return SpecialAbility.DAZE_ENEMIES.getValue();
	}
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
}