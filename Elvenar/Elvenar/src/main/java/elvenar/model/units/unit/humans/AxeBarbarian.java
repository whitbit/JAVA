package elvenar.model.units.unit.humans;

import elvenar.model.units.unit.base.Humans;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.HumansType;
/**
 * 
 * @author M.Mucha
 *
 */
public class AxeBarbarian extends Humans {
	public AxeBarbarian() {
		super( UnitClasses.LIGHT_MELEE, HumansType.AXE_BARBARIAN );
		this.setAttributes( /* damageMinimal */9, /* damageMaximum */11, /* hitpoints */20, /* weight */1, 
				/* movementRange */3, /* attackRange */1, /* initiative */12, /* strikeBack */true 
		);
		this.setPromotion( false );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return ( this.isPromotion() ) 
				? this.getBonuses().getAttackBonus_HM_Type() 
				: this.getBonuses().getAttackBonus_N_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_HM();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setHumansType( HumansType.AXE_BARBARIAN_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */12, /* damageMaximum */14, /* hitpoints */26 
			);
			this.getBonuses().setAttackBonus_HM( 0.4 );
		}
	}	
}