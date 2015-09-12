package model.creatures;

import java.util.List;

public class Succub extends Creature{
	public Succub( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, /*baseRange*/2, 
				/*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12, 
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		baseResistance = new Resistance( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, 
				/*electric*/0.25, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/7, /*baseFoodUpkeep*/6, /*basePrimodialFireUpkeep*/3 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBasePrimodialFireUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	public void setBasePrimodialFireUpkeep( int basePrimodialFireUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( basePrimodialFireUpkeep );
	}
	public int getBasePrimodialFireUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Seduce: Can seduce higher level creatures";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Primodial Fire: " + getBasePrimodialFireUpkeep() );
		return getUpkeepList();
	}
}
