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
public class Priest extends Humans {
	public Priest() {
		super( UnitClasses.MAGE, HumansType.PRIEST );
		this.setAttributes( /*damageMinimal*/2, /*damageMaximum*/18, /*hitpoints*/30, /*weight*/4, 
				/*movementRange*/1, /*attackRange*/14, /*initiative*/1, /*strikeBack*/false 
		);
		this.setPromotion( false );
	}
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_HM( 0.4 );
		this.getBonuses().setDefenseBonus_SR( 0.6 );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return this.getBonuses().getAttackBonus_HM_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_HM();
	}
	@Override
	public String getDefenseBonus_1_Type() {
		return this.getBonuses().getDefenseBonus_SR_Type();
	}	
	@Override
	public double getDefenseBonus_1() {
		return this.getBonuses().getDefenseBonus_SR();
	}
	@Override
	public String getSpecialAbilityType() {
		return ( isPromotion() )
				? SpecialAbility.DIVINE_CURSE_II.getName()
				: SpecialAbility.DIVINE_CURSE.getName();
	}
	@Override
	public double getSpecialAbility() {
		return ( isPromotion() )
				? SpecialAbility.DIVINE_CURSE_II.getValue()
				: SpecialAbility.DIVINE_CURSE.getValue();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setHumansType( HumansType.PRIEST_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */3, /* damageMaximum */25, /* hitpoints */42 
			);
			this.getBonuses().setAttackBonus_HM( 0.6 );
			this.getBonuses().setDefenseBonus_SR( 0.8 );
		}
	}
}