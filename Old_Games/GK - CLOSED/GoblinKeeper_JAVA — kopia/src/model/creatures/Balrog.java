package model.creatures;

public class Balrog extends Creature{
	public Balrog() {
		setName( "Balrog" );
		setInformation( /*baseTilesPerHour*/3, /*baseHealth*/7000, /*baseHealingRate*/900, /*baseDamage*/45, /*baseRange*/1,
				/*baseAccuracy*/160, /*baseDefense*/70, /*baseCarry*/1000, /*basePillage*/200, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/4, /*baseRangeTank*/4, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistance( /*physic*/0.0, /*magic*/0.25, /*disease*/0.0, /*fire*/0.90, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
	}
}
