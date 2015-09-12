package model.creatures;

public class Ogr extends Creature{
	public Ogr() {
		setName( "Ogr" );
		setInformation( /*baseTilesPerHour*/1, /*baseHealth*/2500, /*baseHealingRate*/600, /*baseDamage*/45, /*baseRange*/1,
				/*baseAccuracy*/120, /*baseDefense*/10, /*baseCarry*/400, /*basePillage*/125, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistance( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
	}
}
