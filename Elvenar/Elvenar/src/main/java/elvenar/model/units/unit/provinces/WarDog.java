package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.UnitClasses;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * 
 * @author M.Mucha
 *
 */
public class WarDog extends ProvincesUnits {
	public WarDog() {
		super( UnitClasses.LIGHT_MELEE, ProvinceUnitsType.WAR_DOG );
		setAttributes( /*damageMinimal*/4, /*damageMaximum*/6, /*hitpoints*/13, /*weight*/1, 
				/*movementRange*/6, /*attackRange*/1, /*initiative*/8, /*strikeBack*/true 
		);
		this.setPromotion( false );
	}	
	
	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_SR( 0.9 );
		this.getBonuses().setAttackBonus_HR( 0.5 );
		this.getBonuses().setDefenseBonus_SR( 0.8 );
		this.getBonuses().setDefenseBonus_HR( 0.5 );
	}
	
	@Override
	public String getAttackBonus_1_Type() {
		return this.getBonuses().getAttackBonus_SR_Type();
	}
	@Override
	public double getAttackBonus_1() {
		return this.getBonuses().getAttackBonus_SR();
	}
	@Override
	public String getAttackBonus_2_Type() {
		return this.getBonuses().getAttackBonus_HR_Type();
	}
	@Override
	public double getAttackBonus_2() {
		return this.getBonuses().getAttackBonus_HR();
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
				? SpecialAbility.DAZE_ENEMIES.getName()
				: SpecialAbility.WOUND_ENEMIES.getName();
	}
	@Override
	public double getSpecialAbility() {
		return ( this.isPromotion() )
				? SpecialAbility.DAZE_ENEMIES.getValue()
				: SpecialAbility.WOUND_ENEMIES.getValue();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setProvinceTypeUnits( ProvinceUnitsType.CERBERUS_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */7, /* damageMaximum */9, /* hitpoints */21 
			);
			this.getBonuses().setAttackBonus_HR( 0.4 );
			this.getBonuses().setDefenseBonus_HR( 0.4 );
			this.getBonuses().setAttackBonus_SR( 0.9 );
			this.getBonuses().setDefenseBonus_SR( 0.8 );
		}
	}
}