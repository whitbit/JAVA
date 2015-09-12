package model.creatures;

public class Lich extends Creature{
	public Lich() {
		setName( "Lich" );
		setInformation( /*baseTilesPerHour*/4, /*baseHealth*/1400, /*baseHealingRate*/400, /*baseDamage*/46.67, /*baseRange*/5,
				/*baseAccuracy*/200, /*baseDefense*/60, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/2, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistance( /*physic*/0.0, /*magic*/0.50, /*disease*/0.75, /*fire*/0.0, /*cold*/0.50, /*electric*/0.0, /*poison*/0.75 );
	}
}
