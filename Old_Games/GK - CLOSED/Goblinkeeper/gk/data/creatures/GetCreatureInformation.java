package data.creatures;

import model.creatures.interfaces.CreatureInterface;

public class GetCreatureInformation {
	private CreatureInterface creature = null;
	public GetCreatureInformation( CreatureInterface creature ) {
		this.creature = creature;
		System.out.println( getCreatureInformation() );
	}
	public String getCreatureInformation() {
		String getCreatureInformation = "<<::Information about [ ";
		StringBuffer stringBuffer = new StringBuffer( getCreatureInformation );
		stringBuffer.append( creature.getNameOfCreature() );
		stringBuffer.append( " ]::>>\n" );
		stringBuffer.append( getCreatureStatisticInformation() );
		stringBuffer.append( getCreatureResistanceInformation() );
		getCreatureInformation = stringBuffer.toString();
		return getCreatureInformation;
	}
	public double getStatisticPercentage( double valueToPercentage ) {
		return valueToPercentage * 100;
	}
	public String getCreatureStatisticInformation() {
		String getCreatureInformation = "[ STATISTICS ]\n";
		StringBuffer stringBuffer = new StringBuffer( getCreatureInformation );
		stringBuffer.append( " - Level: " );
		stringBuffer.append( creature.getLevelOfCreature() );
		stringBuffer.append( "\n - Happienes Of Creature: " );
		stringBuffer.append( creature.getHappienesOfCreature() );
		stringBuffer.append( "%\n - Status Of Creature: " );
		stringBuffer.append( creature.getStatusOfCreature() );
		stringBuffer.append( "\n - Tiles Per Hour: " );
		stringBuffer.append( creature.getStatisticTilesPerHourOfCreature() );
		stringBuffer.append( "\n - Health: " );
		stringBuffer.append( creature.getStatisticHealthOfCreature() );
		stringBuffer.append( "\n - Healing Rate: " );
		stringBuffer.append( creature.getStatisticHealingRateOfCreature() );
		stringBuffer.append( "\n - Damage: " );
		stringBuffer.append( creature.getStatisticDamageOfCreature() );
		stringBuffer.append( "\n - Range: " );
		stringBuffer.append( creature.getStatisticRangeOfCreature() );
		stringBuffer.append( "\n - Accuracy: " );
		stringBuffer.append( creature.getStatisticAccuracyOfCreature() );
		stringBuffer.append( "\n - Defense: " );
		stringBuffer.append( creature.getStatisticDefenseOfCreature() );
		stringBuffer.append( "\n - Carry: " );
		stringBuffer.append( creature.getStatisticCarryOfCreature() );
		stringBuffer.append( "\n - Pillage: " );
		stringBuffer.append( creature.getStatisticPillageOfCreature() );
		stringBuffer.append( "\n - MoveDelay: " );
		stringBuffer.append( creature.getStatisticMoveDelayOfCreature() );
		stringBuffer.append( "\n - Awareness: " );
		stringBuffer.append( creature.getStatisticAwarenessOfCreature() );
		stringBuffer.append( "\n - Tank: " );
		stringBuffer.append( creature.getStatisticTankOfCreature() );
		stringBuffer.append( "\n - Range Tank: " );
		stringBuffer.append( creature.getStatisticRangeTankOfCreature() );
		stringBuffer.append( "\n - Move Type: " );
		stringBuffer.append( creature.getStatisticMoveTypeOfCreature() );
		stringBuffer.append( "\n - Damage Type: " );
		stringBuffer.append( creature.getStatisticDamageTypeOfCreature() );	
		getCreatureInformation = stringBuffer.toString();
		return getCreatureInformation;
	}
	public String getCreatureResistanceInformation() {
		String getCreatureInformation = "\n[ RESISTANCE ]";
		StringBuffer stringBuffer = new StringBuffer( getCreatureInformation );
		stringBuffer.append( "\n - Physic: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getPhysicResistanceOfCreature() ) );
		stringBuffer.append( "%\n - Magic: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getMagicResistanceOfCreature() ) );
		stringBuffer.append( "%\n - Disease: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getDiseaseResistanceOfCreature() ) );
		stringBuffer.append( "%\n - Fire: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getFireResistanceOfCreature() ) );
		stringBuffer.append( "%\n - Cold: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getColdResistanceOfCreature() ) );
		stringBuffer.append( "%\n - Electric: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getElectricResistanceOfCreature() ) );
		stringBuffer.append( "%\n - Poison: " );
		stringBuffer.append( ( int )getStatisticPercentage( creature.getPoisonResistanceOfCreature() ) );
		stringBuffer.append( "%\n" );
		getCreatureInformation = stringBuffer.toString();
		return getCreatureInformation;
	}
}