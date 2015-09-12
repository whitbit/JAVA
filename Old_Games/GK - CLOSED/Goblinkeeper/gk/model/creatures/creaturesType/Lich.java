package model.creatures.creaturesType;

public class Lich extends Creature {
	public Lich() {
		super();
		setBaseStatisticOfCreature( /*baseName*/"Lich", /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, 
				/*baseRange*/5, /*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Lich( int levelOfCreature ) {
		super( levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Lich", /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, 
				/*baseRange*/5, /*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Lich( String nameOfCreature ) {
		super( nameOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, 
				/*baseRange*/5, /*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
		setLevelOfCreature( 1 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Lich( int levelOfCreature, String statusOfCreature ) {
		super( levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/"Lich", /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, 
				/*baseRange*/5, /*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
	}
	public Lich( String nameOfCreature, int levelOfCreature ) {
		super( nameOfCreature, levelOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, 
				/*baseRange*/5, /*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
		setStatusOfCreature( "Active" );
	}
	public Lich( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		super( nameOfCreature, levelOfCreature, statusOfCreature );
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, 
				/*baseRange*/5, /*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
		setHappienesOfCreature( 100 );
	} 
}
