package model.creatures;

import java.util.List;

public class Saper extends Creature{
	public Saper( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, /*baseRange*/1, 
				/*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12, 
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, 
				/*electric*/0.25, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/30, /*baseFoodUpkeep*/21, /*baseMoonstoneUpkeep*/1, /*basePrimodialEarthUpkeep*/2 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBaseQuicksilverUpkeep( baseUpkeep.getThirdResourceUpkeep() );
		this.setBasePrimodialEarthUpkeep( baseUpkeep.getFourResourceUpkeep() );
	}
	public void setBaseQuicksilverUpkeep( int baseQuicksilverUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( baseQuicksilverUpkeep );
	}
	public void setBasePrimodialEarthUpkeep( int basePrimodialEarthUpkeep ){
		this.baseUpkeep.setFourResourceUpkeep( basePrimodialEarthUpkeep );
	}
	public int getBaseQuicksilverUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public int getBasePrimodialEarthUpkeep(){
		return baseUpkeep.getFourResourceUpkeep();
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Quicksilver: " + getBaseQuicksilverUpkeep() );
		getUpkeepList().add( "Base Primodial Earth: " + getBasePrimodialEarthUpkeep() );
		return getUpkeepList();
	}
}
