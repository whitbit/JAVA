package model.creatures;

public class Thief extends Creature{
	public Thief() {
		setName( "Thief" );
		setInformation( /*baseTilesPerHour*/10, /*baseHealth*/400, /*baseHealingRate*/600, /*baseDamage*/20, /*baseRange*/1,
				/*baseAccuracy*/100, /*baseDefense*/40, /*baseCarry*/125, /*basePillage*/0, /*baseMoveDelay*/1, /*baseAwareness*/18,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Poison" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );;
	}
}
