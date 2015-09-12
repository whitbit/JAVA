package model.creatures;

public class ArchFiend extends Creature {
	public ArchFiend() {
		setName( "ArchFiend" );
		setInformation( /*baseTilesPerHour*/3, /*baseHealth*/10000, /*baseHealingRate*/1000, /*baseDamage*/85, /*baseRange*/1, 
				/*baseAccuracy*/175, /*baseDefense*/115, /*baseCarry*/2000, /*basePillage*/500, /*baseMoveDelay*/3, /*baseAwareness*/12, 
				/*baseTank*/5, /*baseRangeTank*/5, /*baseMoveType*/"Ground", /*damageType*/"Electric" );
		setResistance( /*physic*/0.0, /*magic*/0.75, /*disease*/0.0, /*fire*/0.75, /*cold*/0.25, /*electric*/0.25, /*poison*/0.0 );;
	}

}
