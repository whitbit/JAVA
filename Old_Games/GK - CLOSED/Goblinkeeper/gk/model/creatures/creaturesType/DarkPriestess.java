package model.creatures.creaturesType;

public class DarkPriestess extends Creature {
	public DarkPriestess() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"DarkPriestess", /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, 
				/*baseDamage*/6.67, /*baseRange*/3, /*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkPriestess( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"DarkPriestess", /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, 
				/*baseDamage*/6.67, /*baseRange*/3, /*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkPriestess( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, 
				/*baseDamage*/6.67, /*baseRange*/3, /*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkPriestess( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"DarkPriestess", /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, 
				/*baseDamage*/6.67, /*baseRange*/3, /*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public DarkPriestess( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, 
				/*baseDamage*/6.67, /*baseRange*/3, /*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DarkPriestess( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, 
				/*baseDamage*/6.67, /*baseRange*/3, /*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, 
				/*baseAwareness*/12, /*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	} 
}
