package model.creatures.creaturesType;

public class ArchFiend extends Creature {
	public ArchFiend() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"ArchFiend", /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, 
				/*baseDamage*/85, /*baseRange*/1, /*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, 
				/*baseMoveDelay*/3, /*baseAwareness*/12, /*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public ArchFiend( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"ArchFiend", /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, 
				/*baseDamage*/85, /*baseRange*/1, /*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, 
				/*baseMoveDelay*/3, /*baseAwareness*/12, /*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public ArchFiend( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, 
				/*baseDamage*/85, /*baseRange*/1, /*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, 
				/*baseMoveDelay*/3, /*baseAwareness*/12, /*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public ArchFiend( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"ArchFiend", /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, 
				/*baseDamage*/85, /*baseRange*/1, /*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, 
				/*baseMoveDelay*/3, /*baseAwareness*/12, /*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
	public ArchFiend( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, 
				/*baseDamage*/85, /*baseRange*/1, /*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, 
				/*baseMoveDelay*/3, /*baseAwareness*/12, /*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public ArchFiend( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, 
				/*baseDamage*/85, /*baseRange*/1, /*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, 
				/*baseMoveDelay*/3, /*baseAwareness*/12, /*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
		setHappienesOfCreature( 100 );
	}
}