package model.creatures.creaturesType;

public class Succub extends Creature {
	public Succub() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Succub", /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, 
				/*baseRange*/2, /*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Succub( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Succub", /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, 
				/*baseRange*/2, /*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Succub( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, 
				/*baseRange*/2, /*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Succub( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Succub", /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, 
				/*baseRange*/2, /*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Succub( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, 
				/*baseRange*/2, /*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Succub( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, 
				/*baseRange*/2, /*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, 
				/*baseAwareness*/12, /*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
