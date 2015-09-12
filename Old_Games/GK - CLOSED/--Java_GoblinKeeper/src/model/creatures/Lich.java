package model.creatures;

import java.util.List;

public class Lich extends Creature{
	public Lich( int idCreature, String name, int level ) {
		super( idCreature, name, level );
		baseAttributes = new Attributes( /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, /*baseRange*/5, 
				/*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		baseResistance = new Resistance( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, 
				/*electric*/0.0, /*poison*/0.75 );
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/22, /*baseFoodUpkeep*/14, /*baseMoonstoneUpkeep*/1 );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
		this.setBaseMoonstoneUpkeep( baseUpkeep.getThirdResourceUpkeep() );
	}
	public void setBaseMoonstoneUpkeep( int baseMoonstoneUpkeep ){
		this.baseUpkeep.setThirdResourceUpkeep( baseMoonstoneUpkeep );
	}
	public int getBaseMoonstoneUpkeep(){
		return baseUpkeep.getThirdResourceUpkeep();
	}
	public String getSpecialAbility(){
		return "Ice Lance: Increases damage";
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		getUpkeepList().add( "Base Moonstone: " + getBaseMoonstoneUpkeep() );
		return getUpkeepList();
	}
}
