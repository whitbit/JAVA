package model.creatures;

public class Orc extends Creature{
	public Orc() {
		setName( "Orc" );
		setInformation( /*baseTilesPerHour*/4, /*baseHealth*/800, /*baseHealingRate*/200, /*baseDamage*/20, /*baseRange*/1,
				/*baseAccuracy*/50, /*baseDefense*/20, /*baseCarry*/200, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/2, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.25, /*poison*/0.0 );
	}
}
