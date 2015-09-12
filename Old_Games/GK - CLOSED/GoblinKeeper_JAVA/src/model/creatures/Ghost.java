package model.creatures;

public class Ghost extends Creature{
	public Ghost() {
		setName( "Ghost" );
		setInformation( /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/500, /*baseDamage*/10, /*baseRange*/1,
				/*baseAccuracy*/30, /*baseDefense*/80, /*baseCarry*/75, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Fly", /*damageType*/"Cold" );
		setResistance( /*physic*/0.90, /*magic*/0.0, /*disease*/0.75, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.75 );
	}
}
