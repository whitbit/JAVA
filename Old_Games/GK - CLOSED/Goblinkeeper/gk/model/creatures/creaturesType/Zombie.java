package model.creatures.creaturesType;

public class Zombie extends Creature {
	public Zombie() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Zombie", /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, 
				/*baseAwareness*/10, /*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Zombie( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Zombie", /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, 
				/*baseAwareness*/10, /*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Zombie( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, 
				/*baseAwareness*/10, /*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Zombie( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Zombie", /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, 
				/*baseAwareness*/10, /*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
	}
	public Zombie( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, 
				/*baseAwareness*/10, /*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Zombie( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/900, /*baseHealingRate*/300, /*baseDamage*/8, 
				/*baseRange*/1, /*baseAccuracy*/30, /*baseDefense*/15, /*baseCarry*/120, /*basePillage*/50, /*baseMoveDelay*/3, 
				/*baseAwareness*/10, /*baseTank*/3, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.75, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
	}  
}
