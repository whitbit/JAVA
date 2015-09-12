package model.creatures;

public class DeathKnight extends Creature{
	public DeathKnight() {
		setName( "DeathKnight" );
		setInformation( /*baseTilesPerHour*/3, /*baseHealth*/4000, /*baseHealingRate*/1100, /*baseDamage*/60, /*baseRange*/1,
				/*baseAccuracy*/180, /*baseDefense*/100, /*baseCarry*/100, /*basePillage*/25, /*baseMoveDelay*/3, /*baseAwareness*/12,
				/*baseTank*/3, /*baseRangeTank*/3, /*baseMoveType*/"Ground", /*damageType*/"Physic" );
		setResistance( /*physic*/0.50, /*magic*/0.0, /*disease*/0.50, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.50 );;
	}
}
