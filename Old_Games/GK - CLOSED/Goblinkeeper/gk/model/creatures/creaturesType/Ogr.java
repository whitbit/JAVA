package model.creatures.creaturesType;

public class Ogr extends Creature {
	public Ogr() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Ogr", /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ogr( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Ogr", /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ogr( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ogr( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Ogr", /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Ogr( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Ogr( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
