package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Steinling extends ProvincesUnits {
	public Steinling() {
		super( UnitClasses.HEAVY_RANGED, ProvinceUnitsType.STEINLING );
		setAttributes( /*damageMinimal*/13, /*damageMaximum*/35, /*hitpoints*/61, /*weight*/4, 
				/*movementRange*/3, /*attackRange*/3, /*initiative*/4, /*strikeBack*/false 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_HM( 0.8 );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return this.getBonuses().getAttackBonus_HM_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_HM();
	}
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
}