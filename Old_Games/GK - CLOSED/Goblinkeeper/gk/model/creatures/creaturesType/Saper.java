package model.creatures.creaturesType;

public class Saper extends Creature {
	public Saper() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Orc", /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, 
				/*baseRange*/1, /*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Saper( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Orc", /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, 
				/*baseRange*/1, /*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Saper( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, 
				/*baseRange*/1, /*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Saper( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Orc", /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, 
				/*baseRange*/1, /*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Saper( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, 
				/*baseRange*/1, /*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Saper( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, 
				/*baseRange*/1, /*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
