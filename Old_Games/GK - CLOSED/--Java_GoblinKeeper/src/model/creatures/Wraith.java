package model.creatures;

import java.util.List;

public class Wraith extends Creature{
	public Wraith( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, /*baseRange*/1, 
				/*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12, 
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.50, /*poison*/0.50 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/12, /*baseFoodUpkeep*/6, /*basePrimodialWaterUpkeep*/3 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBasePrimodialWaterUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	public void setBasePrimodialWaterUpkeep( int basePrimodialWaterUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( basePrimodialWaterUpkeep );
	}
	public int getBasePrimodialWaterUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Dark Aura: Can damage higher level creatures AND causes more damage";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Primodial Water: " + getBasePrimodialWaterUpkeep() );
		return getUpkeepList();
	}
}