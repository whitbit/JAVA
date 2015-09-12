package model.creatures;

import java.util.List;

public class DarkElf extends Creature{
	public DarkElf( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, /*baseRange*/7, 
				/*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18, 
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/6, /*baseFoodUpkeep*/6 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	public String getSpecialAbility(){
		return "Detect Invisible: Increases chance of detecting";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		return getUpkeepList();
	}
}
