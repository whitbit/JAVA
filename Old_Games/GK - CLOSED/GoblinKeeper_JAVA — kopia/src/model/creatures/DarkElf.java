package model.creatures;

public class DarkElf extends Creature {
	public DarkElf() {
		setName( "DarkElf" );
		setInformation( /*baseTilesPerHour*/7, /*baseHealth*/600, /*baseHealingRate*/700, /*baseDamage*/8, /*baseRange*/7,
				/*baseAccuracy*/90, /*baseDefense*/80, /*baseCarry*/90, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.25, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );;
	}
}
