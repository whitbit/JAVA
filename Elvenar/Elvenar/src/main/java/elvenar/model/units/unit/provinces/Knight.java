package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Knight extends ProvincesUnits {
	public Knight() {
		super( UnitClasses.HEAVY_MELEE, ProvinceUnitsType.KNIGHT );
		setAttributes( /* damageMinimal */12, /* damageMaximum */20, /* hitpoints */122, /* weight */4, 
				/* movementRange */2, /* attackRange */2, /* initiative */5, /* strikeBack */true 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_LM( 0.6 );
		this.getBonuses().setDefenseBonus_LM( 0.3 );
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
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
}