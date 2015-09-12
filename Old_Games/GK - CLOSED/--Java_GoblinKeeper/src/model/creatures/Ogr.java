package model.creatures;

import java.util.List;

public class Ogr extends Creature{
	public Ogr( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, /*baseRange*/1, 
				/*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		baseResistance = new Resistance( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/4, /*baseFoodUpkeep*/20 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		return getUpkeepList();
	}
}
