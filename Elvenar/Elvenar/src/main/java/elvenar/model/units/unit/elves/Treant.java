package elvenar.model.units.unit.elves;

import elvenar.model.units.unit.base.Elves;
import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ElvesType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Treant extends Elves {
	public Treant() {
		super( UnitClasses.HEAVY_MELEE, ElvesType.TREANT );
		this.setAttributes( /*damageMinimal*/86, /*damageMaximum*/106, /*hitpoints*/378, /*weight*/12, 
				/*movementRange*/2, /*attackRange*/1, /*initiative*/7, /*strikeBack*/true 
		);	
		this.setPromotion( false );
	}
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_LM( 0.2 );
		this.getBonuses().setDefenseBonus_LM( 0.7 );
	}	
	@Override
	public String getAttackBonus_1_Type() {
		return this.getBonuses().getAttackBonus_LM_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_LM();
	}
	@Override
	public String getDefenseBonus_1_Type() {
		return this.getBonuses().getDefenseBonus_LM_Type();
	}	
	@Override
	public double getDefenseBonus_1() {
		return this.getBonuses().getDefenseBonus_LM();
	}
	@Override
	public String getSpecialAbilityType() {
		return ( this.isPromotion() )
				? SpecialAbility.DAZE_ENEMIES.getName()
				: SpecialAbility.NONE.getName();
	}
	@Override
	public double getSpecialAbility() {
		return ( this.isPromotion() )
				? SpecialAbility.DAZE_ENEMIES.getValue()
				: SpecialAbility.NONE.getValue();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setElvesType( ElvesType.TREANT_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */115, /* damageMaximum */141, /* hitpoints */504 
			);
			this.getBonuses().setAttackBonus_LM( 0.4 );
			this.getBonuses().setDefenseBonus_LM( 0.9 );
		}
	}
}