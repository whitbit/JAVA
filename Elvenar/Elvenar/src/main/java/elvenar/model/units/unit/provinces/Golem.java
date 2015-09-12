package elvenar.model.units.unit.provinces;

import elvenar.model.units.unit.base.ProvincesUnits;
import elvenar.model.units.unit.base.bonus.SpecialAbility;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
import elvenar.model.units.unit.base.types.UnitClasses;
/**
 * 
 * @author M.Mucha
 *
 */
public class Golem extends ProvincesUnits {
	public Golem() {
		super( UnitClasses.HEAVY_RANGED, ProvinceUnitsType.GOLEM );
		this.setAttributes( /* damageMinimal */17, /* damageMaximum */51, /* hitpoints */131, /* weight */6, 
				/* movementRange */3, /* attackRange */3, /* initiative */ 6, /* strikeBack */false
		);
		this.setPromotion( false );
	}

	@Override
	public void setBonuses() {		
		this.getBonuses().setAttackBonus_HM( 0.4 );
		this.getBonuses().setDefenseBonus_SR( 0.2 );
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
	public String getAttackBonus_2_Type() {
		return ( this.isPromotion() )
				? this.getBonuses().getAttackBonus_SR_Type()
				: this.getBonuses().getAttackBonus_N_Type();
	}
	@Override
	public double getAttackBonus_2() {
		return this.getBonuses().getAttackBonus_SR();
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
		return ( this.isPromotion() )
				? SpecialAbility.WOUND_ENEMIES.getName()
				: SpecialAbility.NONE.getName();
	}
	@Override
	public double getSpecialAbility() {
		return ( this.isPromotion() )
				? SpecialAbility.WOUND_ENEMIES.getValue()
				: SpecialAbility.NONE.getValue();
	}
	@Override
	public void unitPromotion() {
		this.setPromotion( true );
		if( isPromotion() ) {
			this.setProvinceTypeUnits( ProvinceUnitsType.GOLEM_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */23, /* damageMaximum */69, /* hitpoints */179
			);
			this.getBonuses().setAttackBonus_HM( 0.8 );
			this.getBonuses().setDefenseBonus_SR( 0.4 );
			this.getBonuses().setAttackBonus_SR( 0.2 );
		}
	}
}