package model.creatures;

public class DarkPriestess extends Creature{
	public DarkPriestess() {
		setName( "DarkPriestess" );
		setInformation( /*baseTilesPerHour*/3, /*baseHealth*/300, /*baseHealingRate*/100, /*baseDamage*/6.67, /*baseRange*/3,
				/*baseAccuracy*/60, /*baseDefense*/30, /*baseCarry*/50, /*basePillage*/0, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/1, /*baseRangeTank*/1, /*baseMoveType*/"Ground", /*damageType*/"Magic" );
		setResistance( /*physic*/0.0, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
	}
}
