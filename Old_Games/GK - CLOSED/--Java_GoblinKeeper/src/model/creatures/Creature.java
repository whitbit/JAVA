package model.creatures;

import java.util.ArrayList;
import java.util.List;

import model.creatures.Attributes;
import model.creatures.Resistance;
import model.creatures.Upkeep;

public abstract class Creature implements BaseInfoInterface {
	private List< String > upkeepList = new ArrayList< String >();
	private int idCreature, level;
	private String name;
	Attributes baseAttributes = null;
	Resistance baseResistance = null;
	Upkeep baseUpkeep = null;
	//BaseAttributesInterface newc = new ArchFiend( 1, "lol", 2 );
	
	public Creature( /*ID*/int idCreature, /*NAME*/String name, /*LEVEL*/int level ) {
		baseAttributes = new Attributes( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "None", "None" );
		baseResistance = new Resistance( 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 );	
		baseUpkeep = new Upkeep( /*baseGoldUpkeep*/0, /*baseFoodUpkeep*/0 );
		this.setName( name );
		this.setIdCreature( idCreature );
		this.setLevel( level );
		this.setBaseGoldUpkeep( baseUpkeep.getFirstResourceUpkeep() );
		this.setBaseFoodUpkeep( baseUpkeep.getSecondResourceUpkeep() );
	}
	//*SETTERS*//
	public void setName( String name ) {
		this.name = name;
	}
	public void setIdCreature( int idCreature ) {
		this.idCreature = idCreature;
	}
	public void setLevel( int level ) {
		this.level = level;
	}
	public void setBaseGoldUpkeep( int baseGoldUpkeep ) {
		this.baseUpkeep.setFirstResourceUpkeep( baseGoldUpkeep );
	}
	public void setBaseFoodUpkeep( int baseFoodpkeep ) {
		this.baseUpkeep.setSecondResourceUpkeep( baseFoodpkeep );
	}
	public void setBaseResistance( Resistance baseResistance ) {
		this.baseResistance = baseResistance;
	}
	public void setBaseAttributes( Attributes baseAttributes ) {
		this.baseAttributes = baseAttributes;
	}
	public void setUpkeepList( List< String > upkeepList ) {
		this.upkeepList = upkeepList;
	}
	public void setBaseUpkeep( Upkeep baseUpkeep ) {
		this.baseUpkeep = baseUpkeep;
	}
	//*GETTERS*//
	public String getName() {
		return name;
	}
	public int getIdCreature() {
		return idCreature;
	}
	public int getLevel() {
		return level;
	}
	public Resistance getResistance(){
		return baseResistance;
	}
	public Attributes getAttributes(){
		return baseAttributes;
	}
	public String getSpecialAbility(){
		return "None";
	}
	public Upkeep getUpkeep(){
		return baseUpkeep;
	}
	public List< String > getUpkeepList() {
		return upkeepList;
	}
	public List< String > getBaseUpkeep(){
		getUpkeepList().add( "Base Gold Upkeep: " + getBaseGoldUpkeep() );
		getUpkeepList().add( "Base Food Upkeep: " + getBaseFoodUpkeep() );
		return getUpkeepList();
	}
	public int getBaseFoodUpkeep() {
		return baseUpkeep.getSecondResourceUpkeep();
	}
	public int getBaseGoldUpkeep() {
		return baseUpkeep.getFirstResourceUpkeep();
	}
	public List< String > getAllBaseAttributes() {
		return baseAttributes.getAllBaseAttributes();
	}
}
