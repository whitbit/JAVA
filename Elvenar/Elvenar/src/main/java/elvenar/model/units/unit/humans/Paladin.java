package elvenar.model.units.unit.humans;

import elvenar.model.units.unit.base.Humans;
import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.HumansType;
/**
 * 
 * @author M.Mucha
 *
 */
public class Paladin extends Humans {
	public Paladin() {
		super( UnitClasses.HEAVY_MELEE, HumansType.PALADIN );
		this.setAttributes( /*damageMinimal*/22, /*damageMaximum*/32, /*hitpoints*/284, /*weight*/6, 
				/*movementRange*/2, /*attackRange*/2, /*initiative*/8, /*strikeBack*/true 
		);	
		this.setPromotion( false );
	}
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_LM( 0.7 );
		this.getBonuses().setAttackBonus_HM( 0.2 );
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
	public String getAttackBonus_2_Type() {
		return this.getBonuses().getAttackBonus_HM_Type();
	}	
	@Override
	public double getAttackBonus_2() {
		return this.getBonuses().getAttackBonus_HM();
	}
	@Override
	public String getDefenseBonus_1_Type() {
		return ( this.isPromotion() )
				? this.getBonuses().getDefenseBonus_LM_Type()
				: this.getBonuses().getDefenseBonus_N_Type();
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
			this.setHumansType( HumansType.PALADIN_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */30, /* damageMaximum */44, /* hitpoints */389 
			);
			this.getBonuses().setAttackBonus_LM( 0.9 );
			this.getBonuses().setAttackBonus_HM( 0.4 );
			this.getBonuses().setDefenseBonus_LM( 0.3 );
		}
	}
}