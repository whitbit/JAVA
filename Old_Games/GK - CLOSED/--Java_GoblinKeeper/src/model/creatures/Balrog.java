package model.creatures;

import java.util.List;

public class Balrog extends Creature{
	public Balrog( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, /*baseRange*/1, 
				/*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/24, /*baseFoodUpkeep*/60, /*baseRubyUpkeep*/2 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBaseRubyUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Ruby: " + getBaseRubyUpkeep() );
		return getUpkeepList();
	}
	public void setBaseRubyUpkeep( int baseRubyUpkeep ){
		baseUpkeep.setThirdResourceUpkeep( baseRubyUpkeep );
	}
	public int getBaseRubyUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
}
