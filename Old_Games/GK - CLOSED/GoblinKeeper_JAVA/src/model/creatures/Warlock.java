package model.creatures;

public class Warlock extends Creature{
	public Warlock() {
		setName( "Warlock" );
		setInformation( /*baseTilesPerHour*/2, /*baseHealth*/200, /*baseHealingRate*/50, /*baseDamage*/16.67, /*baseRange*/5,
				/*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistance( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.0 );
	}
}
