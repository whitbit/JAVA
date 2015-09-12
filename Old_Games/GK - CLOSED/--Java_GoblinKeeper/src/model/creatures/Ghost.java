package model.creatures;

import java.util.List;

public class Ghost extends Creature{
	public Ghost( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, /*baseRange*/1, 
				/*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12, 
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		baseResistance = new Resistance( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.75 );
		baseUpkeep = new Upkeep( /*bPrimodialIceUpkeep*/2, /*baseFoodUpkeep*/6 );
		this.setBasePrimodialIceUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	public void setBasePrimodialIceUpkeep( int basePrimodialIceUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( basePrimodialIceUpkeep );
	}
	public int getBasePrimodialIceUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Fear: Can cause fear in higher level creatures";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Primodial Ice Upkeep: " + getBasePrimodialIceUpkeep() );
		return getUpkeepList();
	}
}
