package model.creatures;

public class Imp extends Creature{
	public Imp() {
		setName( "Imp" );
		setInformation( /*baseTilesPerHour*/8, /*baseHealth*/200, /*baseHealingRate*/300, /*baseDamage*/10, /*baseRange*/4,
				/*baseAccuracy*/50, /*baseDefense*/160, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/16,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistance( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.50, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
	}
}
