package model.creatures.creaturesType;

public class Balrog extends Creature {
	public Balrog() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Balrog", /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Balrog( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Balrog", /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Balrog( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Balrog( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Balrog", /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public Balrog( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Balrog( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, 
				/*baseRange*/1, /*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
