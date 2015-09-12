package model.creatures;

public class Wraith extends Creature{
	public Wraith() {
		setName( "Wraith" );
		setInformation( /*baseTilesPerHour*/6, /*baseHealth*/800, /*baseHealingRate*/1600, /*baseDamage*/25, /*baseRange*/1,
				/*baseAccuracy*/70, /*baseDefense*/70, /*baseCarry*/150, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Fly", /*damageType*/"Disease" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.50, /*poison*/0.50 );
	}
}