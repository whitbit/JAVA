package model.creatures.creaturesType;

public class Vampire extends Creature {
	public Vampire() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Vampire", /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, 
				/*baseRange*/1, /*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Vampire( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Vampire", /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, 
				/*baseRange*/1, /*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Vampire( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, 
				/*baseRange*/1, /*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Vampire( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Vampire", /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, 
				/*baseRange*/1, /*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	}
	public Vampire( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, 
				/*baseRange*/1, /*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Vampire( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, 
				/*baseRange*/1, /*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	} 
}