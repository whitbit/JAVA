package elvenar.model.units.unit.elves;

import elvenar.model.units.unit.base.Elves;
import elvenar.model.units.unit.base.types.HumansType;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ElvesType;
/**
 * 
 * @author M.Mucha
 *
 */
public class SwordDancer extends Elves {
	public SwordDancer() {
		super( UnitClasses.LIGHT_MELEE, ElvesType.SWORD_DANCER );
		this.setAttributes( /* damageMinimal */7, /* damageMaximum */9, /* hitpoints */24, /* weight */1, 
				/* movementRange */3, /* attackRange */1, /* initiative */12, /* strikeBack */true 
		);
		this.setPromotion( false );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return ( this.isPromotion() ) 
				? this.getBonuses().getAttackBonus_HR_Type() 
				: this.getBonuses().getAttackBonus_N_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_HR();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setElvesType( ElvesType.SWORD_DANCER_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */9, /* damageMaximum */11, /* hitpoints */31 
			);
			this.getBonuses().setAttackBonus_HR( 0.2 );
		}
	}	
}