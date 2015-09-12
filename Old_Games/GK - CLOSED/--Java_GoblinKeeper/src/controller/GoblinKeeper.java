package controller;

import java.util.ArrayList;
import java.util.List;
import data.CreatureBaseInfo;
import data.Research;
import model.creatures.BaseInfoInterface;
import model.creatures.Creature;

public class GoblinKeeper {
	private BaseInfoInterface creature;
	private List< BaseInfoInterface > creaturesList = new ArrayList< BaseInfoInterface >();
	private CreatureBaseInfo creatureBaseInfo = new CreatureBaseInfo();
	private Research research;
	
	public BaseInfoInterface getCreatureBaseInformation( String nameOfCreature ) throws Exception {
		return ( BaseInfoInterface )creatureBaseInfo.getCreatureBaseInfo( nameOfCreature );
	}
	public List< BaseInfoInterface > getCreaturesBaseInformation() {
		creaturesList = creatureBaseInfo.getCreatureBaseInfo();
		for( int i = 0; i < creaturesList.size(); i++ ) {
			creature = ( BaseInfoInterface ) creaturesList.get( i );
			System.out.println( "||Creature: " + creature.getName() + "||\n" + "+ Base Statistic:\n" + creature.getAllBaseAttributes() 
					+ "\n+ Base Resistance\n" + creature.getResistance().getAllResistance() + "\n+ Base Upkeep\n" + creature.getBaseUpkeep() 
					+ "\n" );
		}
		return creaturesList;
	}
	public Research getResearch( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3, int levelOfWarlock4, int levelOfWarlock5, int levelOfWarlock6,
			int levelOfWarlock7, int levelOfWarlock8 ) {
		
		research = new Research( levelOfWarlock1, levelOfWarlock2, levelOfWarlock3, levelOfWarlock4, levelOfWarlock5, levelOfWarlock6,
				levelOfWarlock7, levelOfWarlock8 );
		return research;
	}
}
