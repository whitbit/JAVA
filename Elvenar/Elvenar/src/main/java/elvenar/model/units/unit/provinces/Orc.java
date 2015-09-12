package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Orc extends ProvincesUnits {
	public Orc() {
		super( UnitClasses.LIGHT_MELEE, ProvinceUnitsType.ORC );
		setAttributes( /*damageMinimal*/9, /*damageMaximum*/13, /*hitpoints*/14, /*weight*/1, 
				/*movementRange*/4, /*attackRange*/1, /*initiative*/8, /*strikeBack*/true 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
	
}