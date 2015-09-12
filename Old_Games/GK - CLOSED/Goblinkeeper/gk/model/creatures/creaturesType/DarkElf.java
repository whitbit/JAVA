package model.creatures.creaturesType;

public class DarkElf extends Creature {
	public DarkElf() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"DarkElf", /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, 
				/*baseRange*/7, /*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkElf( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"DarkElf", /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, 
				/*baseRange*/7, /*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkElf( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, 
				/*baseRange*/7, /*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkElf( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"DarkElf", /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, 
				/*baseRange*/7, /*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public DarkElf( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, 
				/*baseRange*/7, /*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkElf( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, 
				/*baseRange*/7, /*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
