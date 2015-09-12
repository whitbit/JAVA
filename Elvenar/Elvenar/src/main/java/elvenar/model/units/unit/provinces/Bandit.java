package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Bandit extends ProvincesUnits {
	public Bandit() {
		super( UnitClasses.SHORT_RANGED, ProvinceUnitsType.BANDIT );
		setAttributes( /* damageMinimal */5, /* damageMaximum */9, /* hitpoints */7, /* weight */1, 
				/* movementRange */3, /* attackRange */4, /* initiative */7, /* strikeBack */false 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
	
}