package model.creatures.creaturesType;

public class DeathKnight extends Creature {
	public DeathKnight() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"DeathKnight", /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, 
				/*baseRange*/1, /*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DeathKnight( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"DeathKnight", /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, 
				/*baseRange*/1, /*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DeathKnight( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, 
				/*baseRange*/1, /*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DeathKnight( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"DeathKnight", /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, 
				/*baseRange*/1, /*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	}
	public DeathKnight( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, 
				/*baseRange*/1, /*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public DeathKnight( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, 
				/*baseRange*/1, /*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistanceOfCreature( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );
		setHappienesOfCreature( 100 );
	} 
}
