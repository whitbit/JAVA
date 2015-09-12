package model.creatures.creaturesType;

public class Imp extends Creature {
	public Imp() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Imp", /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, 
				/*baseRange*/4, /*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Imp( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Imp", /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, 
				/*baseRange*/4, /*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Imp( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, 
				/*baseRange*/4, /*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Imp( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Imp", /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, 
				/*baseRange*/4, /*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Imp( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, 
				/*baseRange*/4, /*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Imp( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, 
				/*baseRange*/4, /*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
