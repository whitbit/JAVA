package model.creatures.creaturesType;

public class Wraith extends Creature {
	public Wraith() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Wraith", /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, 
				/*baseRange*/1, /*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Wraith( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Wraith", /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, 
				/*baseRange*/1, /*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Wraith( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, 
				/*baseRange*/1, /*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Wraith( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Wraith", /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, 
				/*baseRange*/1, /*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	}
	public Wraith( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, 
				/*baseRange*/1, /*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Wraith( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, 
				/*baseRange*/1, /*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	} 
}