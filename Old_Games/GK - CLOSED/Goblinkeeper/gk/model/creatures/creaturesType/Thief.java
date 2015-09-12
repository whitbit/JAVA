package model.creatures.creaturesType;

public class Thief extends Creature {
	public Thief() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Thief", /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, 
				/*baseAwareness*/18, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Thief( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Thief", /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, 
				/*baseAwareness*/18, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Thief( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, 
				/*baseAwareness*/18, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Thief( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Thief", /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, 
				/*baseAwareness*/18, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	}
	public Thief( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, 
				/*baseAwareness*/18, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Thief( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, 
				/*baseAwareness*/18, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	} 
}
