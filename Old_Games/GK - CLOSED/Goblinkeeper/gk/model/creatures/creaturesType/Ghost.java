package model.creatures.creaturesType;

public class Ghost extends Creature {
	public Ghost() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Ghost", /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ghost( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Ghost", /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ghost( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ghost( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Ghost", /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
	}
	public Ghost( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ghost( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistanceOfCreature( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
	} 
}
