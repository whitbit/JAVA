package model.creatures;

public class Saper extends Creature{
	public Saper() {
		setName( "Saper" );
		setInformation( /*baseTilesPerHour*/15, /*baseHealth*/500, /*baseHealingRate*/200, /*baseDamage*/5, /*baseRange*/1,
				/*baseAccuracy*/10, /*baseDefense*/10, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/4, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
	}
}
