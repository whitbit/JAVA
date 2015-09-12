package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Cannoneer extends ProvincesUnits {
	public Cannoneer() {
		super( UnitClasses.HEAVY_RANGED, ProvinceUnitsType.CANNONEER );
		setAttributes( /*damageMinimal*/8, /*damageMaximum*/74, /*hitpoints*/27, /*weight*/6, 
				/*movementRange*/1, /*attackRange*/14, /*initiative*/3, /*strikeBack*/false 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_HM( 0.8 );
		this.getBonuses().setDefenseBonus_SR( 0.8 );
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
	public String getDefenseBonus_1_Type() {
		return this.getBonuses().getDefenseBonus_SR_Type();
	}	
	@Override
	public double getDefenseBonus_1() {
		return this.getBonuses().getDefenseBonus_SR();
	}
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
}