package controller;

import data.creatures.GetCreatureInformation;
import model.creatures.interfaces.CreatureInterface;

public class Creatures {
	private GetCreatureInformation creatureInformation = null;
	public Creatures( CreatureInterface creature ) {
		creatureInformation = new GetCreatureInformation( creature );
	}
	public String getCreatureInformation() {
		return creatureInformation.getCreatureInformation();
	}
}
