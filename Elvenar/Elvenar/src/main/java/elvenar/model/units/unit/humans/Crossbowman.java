package elvenar.model.units.unit.humans;

import elvenar.model.units.unit.base.Humans;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.HumansType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Crossbowman extends Humans {
	public Crossbowman() {
		super( UnitClasses.SHORT_RANGED, HumansType.CROSSBOWMAN );
		this.setAttributes( /* damageMinimal */5, /* damageMaximum */7, /* hitpoints */10, /* weight */1, 
				/* movementRange */3, /* attackRange */4, /* initiative */10, /* strikeBack */false
		);
		this.setPromotion( false );
	}	

	@Override
	public String getAttackBonus_1_Type() {
		return ( this.isPromotion() ) 
				? this.getBonuses().getAttackBonus_LM_Type() 
				: this.getBonuses().getAttackBonus_N_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_LM();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setHumansType( HumansType.CROSSBOWMAN_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */6, /* damageMaximum */10, /* hitpoints */14 
			);
			this.getBonuses().setAttackBonus_LM( 0.2 );
		}
	}
}