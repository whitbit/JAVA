package model.creatures.creaturesType;

public class Warlock extends Creature {
	public Warlock() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Warlock", /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, 
				/*baseRange*/5, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Warlock( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Warlock", /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, 
				/*baseRange*/5, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Warlock( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, 
				/*baseRange*/5, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Warlock( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Warlock", /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, 
				/*baseRange*/5, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Warlock( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, 
				/*baseRange*/5, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Warlock( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, 
				/*baseRange*/5, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
