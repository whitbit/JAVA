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
public class Sorceress extends Elves {
	public Sorceress() {
		super( UnitClasses.MAGE, ElvesType.SORCERESS );
		this.setAttributes( /*damageMinimal*/7, /*damageMaximum*/13, /*hitpoints*/45, /*weight*/4, 
				/*movementRange*/4, /*attackRange*/4, /*initiative*/2, /*strikeBack*/false 
		);
		this.setPromotion( false );
	}
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_LM( 0.4 );
		this.getBonuses().setAttackBonus_HM( 0.4 );
		this.getBonuses().setDefenseBonus_SR( 0.6 );
		this.getBonuses().setDefenseBonus_HR( 0.6 );
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
		return this.getBonuses().getDefenseBonus_SR_Type();
	}	
	@Override
	public double getDefenseBonus_1() {
		return this.getBonuses().getDefenseBonus_SR();
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
	public String getDefenseBonus_2_Type() {
		return this.getBonuses().getDefenseBonus_HR_Type();
	}	
	@Override
	public double getDefenseBonus_2() {
		return this.getBonuses().getDefenseBonus_HR();
	}
	@Override
	public String getSpecialAbilityType() {
		return ( this.isPromotion() )
				? SpecialAbility.BROKEN_VALOR_II.getName()
				: SpecialAbility.BROKEN_VALOR.getName();
	}
	@Override
	public double getSpecialAbility() {
		return ( this.isPromotion() )
				? SpecialAbility.BROKEN_VALOR_II.getValue()
				: SpecialAbility.BROKEN_VALOR.getValue();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setElvesType( ElvesType.SORCERESS_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */10, /* damageMaximum */18, /* hitpoints */63 
			);
			this.getBonuses().setAttackBonus_LM( 0.6 );
			this.getBonuses().setAttackBonus_HM( 0.6 );
			this.getBonuses().setDefenseBonus_SR( 0.8 );
			this.getBonuses().setDefenseBonus_HR( 0.8 );
		}
	}
}