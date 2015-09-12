package model.creatures;

public class Succub extends Creature{
	public Succub() {
		setName( "Succub" );
		setInformation( /*baseTilesPerHour*/5, /*baseHealth*/900, /*baseHealingRate*/500, /*baseDamage*/17.5, /*baseRange*/2,
				/*baseAccuracy*/60, /*baseDefense*/40, /*baseCarry*/100, /*basePillage*/0, /*baseMoveDelay*/2, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Fire" );
		setResistance( /*physic*/0.50, /*magic*/0.0, /*disease*/0.0, /*fire*/0.25, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );
	}
}
