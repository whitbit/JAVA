package model.creatures;

import java.util.List;

public class DeathKnight extends Creature{
	public DeathKnight( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, /*baseRange*/1, 
				/*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		baseResistance = new Resistance( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.50 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/30, /*baseFoodUpkeep*/36, /*baseMoonstoneUpkeep*/1 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBaseMoonstoneUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	public void setBaseMoonstoneUpkeep( int baseMoonstoneUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( baseMoonstoneUpkeep );
	}
	public int getBaseMoonstoneUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Bloodlust: Increases chance of successful hit and damage amount";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Moonstone: " + getBaseMoonstoneUpkeep() );
		return getUpkeepList();
	}
}
