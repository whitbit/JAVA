package model.creatures;

import java.util.List;

public class Vampire extends Creature{
	public Vampire( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, /*baseRange*/1, 
				/*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, 
				/*electric*/0.0, /*poison*/0.50 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/18, /*baseFoodUpkeep*/10, /*basePrimodialEarthUpkeep*/2, /*basePrimodialFireUpkeep*/2 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBasePrimodialEarthUpkeep( baseUpkeep.getThirdResourceUpkeep() );
		this.setBasePrimodialFireUpkeep( baseUpkeep.getFourResourceUpkeep() );
	}
	public void setBasePrimodialEarthUpkeep( int basePrimodialEarthUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( basePrimodialEarthUpkeep );
	}
	public void setBasePrimodialFireUpkeep( int basePrimodialFireUpkeep ){
		this.baseUpkeep.setFourResourceUpkeep( basePrimodialFireUpkeep );
	}
	public int getBasePrimodialEarthUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public int getBasePrimodialFireUpkeep(){
		return baseUpkeep.getFourResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Life Drain: Increases heal amount, but not damage amount to enemy";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Primodial Earth: " + getBasePrimodialEarthUpkeep() );
		getUpkeepList().add( "Base Primodial Fire: " + getBasePrimodialFireUpkeep() );
		return getUpkeepList();
	}
}