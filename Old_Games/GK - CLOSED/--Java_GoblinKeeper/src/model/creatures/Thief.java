package model.creatures;

import java.util.List;

public class Thief extends Creature{
	public Thief( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, /*baseRange*/1, 
				/*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18, 
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.50 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/9, /*baseFoodUpkeep*/6 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	public String getSpecialAbility(){
		return "Disarm Trap: Increases chance of disarming, increases chance of discovering traps";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		return getUpkeepList();
	}
}
