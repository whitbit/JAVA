package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Thief extends ProvincesUnits {
	public Thief() {
		super( UnitClasses.LIGHT_MELEE, ProvinceUnitsType.THIEF );
		setAttributes( /*damageMinimal*/6, /*damageMaximum*/8, /*hitpoints*/19, /*weight*/1, 
				/*movementRange*/3, /*attackRange*/1, /*initiative*/8, /*strikeBack*/true 
		);	
		this.setPromotion( false );
	}	
	
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
	
}