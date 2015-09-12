package model.creatures;

import java.util.List;

public class Zombie extends Creature{
	public Zombie( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, /*baseRange*/1, 
				/*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, /*baseAwareness*/10, 
				/*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		baseResistance = new Resistance( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.75 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/10, /*baseFoodUpkeep*/6 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		return getUpkeepList();
	}
}
