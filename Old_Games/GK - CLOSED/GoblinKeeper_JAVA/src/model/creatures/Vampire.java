package model.creatures;

public class Vampire extends Creature{
	public Vampire() {
		setName( "Vampire" );
		setInformation( /*baseTilesPerHour*/8, /*baseHealth*/1800, /*baseHealingRate*/2200, /*baseDamage*/40, /*baseRange*/1,
				/*baseAccuracy*/140, /*baseDefense*/90, /*baseCarry*/25, /*basePillage*/20, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Cold" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.50 );;
	}
}