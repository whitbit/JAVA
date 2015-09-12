package elvenar.model.units.unit.elves;

import elvenar.model.units.unit.base.Elves;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ElvesType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Archer extends Elves {
	public Archer() {
		super( UnitClasses.SHORT_RANGED, ElvesType.ARCHER );
		this.setAttributes( /* damageMinimal */4, /* damageMaximum */6, /* hitpoints */12, /* weight */1, 
				/* movementRange */3, /* attackRange */4, /* initiative */10, /* strikeBack */false 
		);
		this.setPromotion( false );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return ( this.isPromotion() ) 
				? this.getBonuses().getAttackBonus_SR_Type() 
				: this.getBonuses().getAttackBonus_N_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_SR();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setElvesType( ElvesType.ARCHER_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */6, /* damageMaximum */8, /* hitpoints */16 
			);
			this.getBonuses().setAttackBonus_SR( 0.2 );
		}
	}	
}