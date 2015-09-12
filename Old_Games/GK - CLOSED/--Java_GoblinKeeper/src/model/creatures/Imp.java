package model.creatures;

import java.util.List;

public class Imp extends Creature{
	public Imp( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, /*baseRange*/4, 
				/*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16, 
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/3, /*baseFoodUpkeep*/3, /*baseQuicksilverUpkeep*/1 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBaseQuicksilverUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	public void setBaseQuicksilverUpkeep( int baseQuicksilverUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( baseQuicksilverUpkeep );
	}
	public int getBaseQuicksilverUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Enrage: Can aggro higher level creatures";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Quicksilver: " + getBaseQuicksilverUpkeep() );
		return getUpkeepList();
	}
}
