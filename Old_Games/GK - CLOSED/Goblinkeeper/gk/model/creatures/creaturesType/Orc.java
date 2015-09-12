package model.creatures.creaturesType;

public class Orc extends Creature {
	public Orc() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Orc", /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Orc( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Orc", /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Orc( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Orc( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Orc", /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Orc( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Orc( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, 
				/*baseRange*/1, /*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
