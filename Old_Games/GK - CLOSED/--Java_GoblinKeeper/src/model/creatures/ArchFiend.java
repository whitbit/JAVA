package model.creatures;

import java.util.ArrayList;
import java.util.List;

public class ArchFiend extends Creature {	
	public ArchFiend( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, /*baseDamage*/85, /*baseRange*/1, 
				/*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, 
				/*electric*/0.25, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/60, /*baseFoodUpkeep*/110, /*baseShallowMantleUpkeep*/1 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBaseShallowMantleUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}

	public String getSpecialAbility(){
		return "Banish: Can banish higher level creatures (it's correct that if Banish is triggered the Arch Fiend will always decide to do it, assuming a valid target)";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Shallow Mantle: " + getBaseShallowMantleUpkeep() );
		return getUpkeepList();
	}
	public void setBaseShallowMantleUpkeep( int baseShallowMantleUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( baseShallowMantleUpkeep );
	}
	public int getBaseShallowMantleUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
}
