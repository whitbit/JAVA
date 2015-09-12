package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Archery extends ProvincesUnits {
	public Archery() {
		super( UnitClasses.SHORT_RANGED, ProvinceUnitsType.ARCHERY );
		setAttributes( /* damageMinimal */4, /* damageMaximum */6, /* hitpoints */12, /* weight */1, 
				/* movementRange */3, /* attackRange */4, /* initiative */7, /* strikeBack */false 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void unitPromotion() {
		// TODO Auto-generated method stub
		
	}
	
}