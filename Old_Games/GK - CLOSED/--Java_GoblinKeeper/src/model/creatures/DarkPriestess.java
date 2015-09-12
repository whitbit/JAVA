package model.creatures;

import java.util.List;

public class DarkPriestess extends Creature{
	public DarkPriestess( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, /*baseDamage*/6.67, /*baseRange*/3, 
				/*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, 
				/*electric*/0.0, /*poison*/0.0 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/13, /*baseFoodUpkeep*/5, /*basePrimodialWaterUpkeep*/1 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBasePrimodialWaterUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	public void setBasePrimodialWaterUpkeep( int basePrimodialWaterUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( basePrimodialWaterUpkeep );
	}
	public int getBasePrimodialWaterUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Heal: Increases heal amount";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Primodial Water: " + getBasePrimodialWaterUpkeep() );
		return getUpkeepList();
	}
}
