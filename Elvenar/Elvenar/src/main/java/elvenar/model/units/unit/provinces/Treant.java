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
public class Treant extends ProvincesUnits {
	public Treant() {
		super( UnitClasses.HEAVY_MELEE, ProvinceUnitsType.TREANT );
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
			this.setProvinceTypeUnits( ProvinceUnitsType.TREANT_II );
			this.getStatistics().setPromotionAttributes( 
					/* damageMinimal */115, /* damageMaximum */141, /* hitpoints */504 
			);
			this.getBonuses().setAttackBonus_LM( 0.4 );
			this.getBonuses().setDefenseBonus_LM( 0.8 );
		}
	}
}