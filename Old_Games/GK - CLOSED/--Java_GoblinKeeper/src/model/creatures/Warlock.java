package model.creatures;

import java.util.List;

public class Warlock extends Creature{
	private final int baseResearch = 6;

	public Warlock( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, /*baseRange*/5, 
				/*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.50, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/7, /*baseFoodUpkeep*/4 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		return getUpkeepList();
	}
	public int getBaseResearch() {
		return baseResearch;
	}
}
