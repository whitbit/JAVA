package data;

import java.util.ArrayList;
import java.util.List;
import model.creatures.*;

public class CreatureBaseInfo {
	private BaseInfoInterface creature;
	private List< BaseInfoInterface > creaturesList = new ArrayList< BaseInfoInterface >();

	public BaseInfoInterface getCreatureBaseInfo( String nameOfCreature ) throws Exception {
		getCreatureBaseInfo();		
		for ( int i = 0; i < creaturesList.size(); i++ ) {
			creature = ( BaseInfoInterface )creaturesList.get( i );
			if ( creature.getName() == nameOfCreature ) {	
				System.out.println( "||Creature: " + creature.getName() + "||\n" + "+ Base Statistic:\n" + creature.getAllBaseAttributes() 
						+ "\n+ Base Resistance\n" + creature.getResistance().getAllResistance() + "\n+ Base Upkeep\n" + creature.getBaseUpkeep() );
			}
		}
		return creature;
	}
	public List< BaseInfoInterface > getCreatureBaseInfo() {
		BaseInfoInterface archFiend = new ArchFiend( 1, "ArchFiend", 1 );
		creaturesList.add( archFiend );
		BaseInfoInterface balrog = new Balrog( 2, "Balrog", 1 );
		creaturesList.add( balrog );
		BaseInfoInterface darkElf = new DarkElf( 3, "DarkElf", 1 );
		creaturesList.add( darkElf );
		BaseInfoInterface darkPriestess = new DarkPriestess( 4, "DarkPriestess", 1 );
		creaturesList.add( darkPriestess );
		BaseInfoInterface deathKnight = new DeathKnight( 5, "DeathKnight", 1 );
		creaturesList.add( deathKnight );
		BaseInfoInterface ghost = new Ghost( 6, "Ghost", 1 );
		creaturesList.add( ghost );
		BaseInfoInterface imp = new Imp( 7, "Imp", 1 );
		creaturesList.add( imp );
		BaseInfoInterface lich = new Lich( 8, "Lich", 1 );
		creaturesList.add( lich );
		BaseInfoInterface ogr = new Ogr( 9, "Ogr", 1 );
		creaturesList.add( ogr );
		BaseInfoInterface orc = new Orc( 10, "Orc", 1 );
		creaturesList.add( orc );
		BaseInfoInterface saper = new Saper( 11, "Saper", 1 );
		creaturesList.add( saper );
		BaseInfoInterface succub = new Succub( 12, "Succub", 1 );
		creaturesList.add( succub );
		BaseInfoInterface thief = new Thief( 13, "Thief", 1 );
		creaturesList.add( thief );
		BaseInfoInterface vampire = new Vampire( 14, "Vampire", 1 );
		creaturesList.add( vampire );
		BaseInfoInterface warlock = new Warlock( 15, "Warlock", 1 );
		creaturesList.add( warlock );
		BaseInfoInterface wraith = new Wraith( 16, "Wraith", 1 );
		creaturesList.add( wraith );
		BaseInfoInterface zombie = new Zombie( 17, "Zombie", 1 );
		creaturesList.add( zombie );		
		return creaturesList;
	}
}
