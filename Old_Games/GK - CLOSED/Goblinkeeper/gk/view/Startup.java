package view;

import controller.Creatures;
import model.creatures.creaturesType.*;
import model.creatures.interfaces.CreatureInterface;

public class Startup {
	public static void main( String[] args ) {
		Creatures creatureManager = new Creatures( new Wraith() );
		creatureManager.getCreatureInformation();
		CreatureInterface creature = new Wraith();
		System.out.println( creature.getStatisticCarryIncrementByOneLevel() );
	}	
}