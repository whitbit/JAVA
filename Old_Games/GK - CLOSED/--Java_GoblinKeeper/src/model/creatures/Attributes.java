package model.creatures;

import java.util.ArrayList;
import java.util.List;

public class Attributes {
	private List< String > attributesList = new ArrayList< String >();
	private int baseTilesPerHour, baseHealth, baseHealingRate, baseRange, baseAccuracy, baseDefense, baseCarry, basePillage, baseMoveDelay, 
				baseAwareness, baseTank, baseRangeTank;
	private double baseDamage;
	private String baseMoveType, damageType;
	
	public Attributes( int baseTilesPerHour, int baseHealth, int baseHealingRate, double baseDamage, int baseRange, int baseAccuracy, 
			int baseDefense, int baseCarry, int basePillage, int baseMoveDelay, int baseAwareness, int baseTank, int baseRangeTank, 
			String baseMoveType, String damageType ) {
		
		this.baseTilesPerHour = baseTilesPerHour;
		this.baseHealth = baseHealth;
		this.baseHealingRate = baseHealingRate;
		this.baseDamage = baseDamage;
		this.baseRange = baseRange;
		this.baseAccuracy = baseAccuracy;
		this.baseDefense = baseDefense;
		this.baseCarry = baseCarry;
		this.basePillage = basePillage;
		this.baseMoveDelay = baseMoveDelay;
		this.baseAwareness = baseAwareness;
		this.baseTank = baseTank;
		this.baseRangeTank = baseRangeTank;
		this.baseMoveType = baseMoveType;
		this.damageType = damageType;
	}
	
	public void setBaseAttributes( int baseTilesPerHour, int baseHealth, int baseHealingRate, double baseDamage, int baseRange, 
			int baseAccuracy, int baseDefense, int baseCarry, int basePillage, int baseMoveDelay, int baseAwareness, int baseTank, 
			int baseRangeTank, String baseMoveType, String damageType ) {
		
		this.baseTilesPerHour = baseTilesPerHour;
		this.baseHealth = baseHealth;
		this.baseHealingRate = baseHealingRate;
		this.baseDamage = baseDamage;
		this.baseRange = baseRange;
		this.baseAccuracy = baseAccuracy;
		this.baseDefense = baseDefense;
		this.baseCarry = baseCarry;
		this.basePillage = basePillage;
		this.baseMoveDelay = baseMoveDelay;
		this.baseAwareness = baseAwareness;
		this.baseTank = baseTank;
		this.baseRangeTank = baseRangeTank;
		this.baseMoveType = baseMoveType;
		this.damageType = damageType;
	}
	public List< String > getAllBaseAttributes() {
		attributesList.add( "Base Tiles Per Hour: " + getBaseTilesPerHour() );
		attributesList.add( "Base Health: " + getBaseHealth() );
		attributesList.add( "Base Healing Rater: " + getBaseHealingRate() );
		attributesList.add( "Base Damage: " + getBaseDamage() );
		attributesList.add( "Base Range: " + getBaseRange() );
		attributesList.add( "Base Accuracy: " + getBaseAccuracy() );
		attributesList.add( "Base Defense: " + getBaseDefense() );
		attributesList.add( "Base Carry: " + getBaseCarry() ); 
		attributesList.add( "Base Pillage: " + getBasePillage() );
		attributesList.add( "Base Move Delay: " + getBaseMoveDelay() );
		attributesList.add( "Base Awareness: " + getBaseAwareness() );
		attributesList.add( "Base Tank: " + getBaseTank() );
		attributesList.add( "Base Range Tank: " + getBaseRangeTank() );
		attributesList.add( "Base Move Type: " + getBaseMoveType() );
		attributesList.add( "Base Damage Type: " + getBaseDamageType() );
		return attributesList;
	}
	public void setBaseTilesPerHour( int baseTilesPerHour ) {
		this.baseTilesPerHour = baseTilesPerHour;
	}
	public void setBaseHealth( int baseHealth ) {
		this.baseHealth = baseHealth;
	}
	public void setBaseHealingRate( int baseHealingRate ) {
		this.baseHealingRate = baseHealingRate;
	}
	public void setBaseDamage( double baseDamage ) {
		this.baseDamage = baseDamage;
	}
	public void setBaseRange( int baseRange ) {
		this.baseRange = baseRange;
	}
	public void setBaseAccuracy( int baseAccuracy ) {
		this.baseAccuracy = baseAccuracy;
	}
	public void setBaseDefense( int baseDefense ) {
		this.baseDefense = baseDefense;
	}
	public void setBaseCarry( int baseCarry ) {
		this.baseCarry = baseCarry;
	}
	public void setBasePillage( int basePillage ) {
		this.basePillage = basePillage;
	}
	public void setBaseMoveDelay( int baseMoveDelay ) {
		this.baseMoveDelay = baseMoveDelay;
	}
	public void setBaseAwareness( int baseAwareness ) {
		this.baseAwareness = baseAwareness;
	}
	public void setBaseTank( int baseTank ) {
		this.baseTank = baseTank;
	}
	public void setBaseRangeTank( int baseRangeTank ) {
		this.baseRangeTank = baseRangeTank;
	}
	public void setBaseMoveType( String baseMoveType ) {
		this.baseMoveType = baseMoveType;
	}
	public void setBaseDamageType( String baseDamageType ) {
		this.damageType = baseDamageType;
	}
	public int getBaseTilesPerHour() {
		return baseTilesPerHour;
	}
	public int getBaseHealth() {
		return baseHealth;
	}
	public int getBaseHealingRate() {
		return baseHealingRate;
	}
	public double getBaseDamage() {
		return baseDamage;
	}
	public int getBaseRange() {
		return baseRange;
	}
	public int getBaseAccuracy() {
		return baseAccuracy;
	}
	public int getBaseAwareness() {
		return baseAwareness;
	}
	public int getBaseDefense() {
		return baseDefense;
	}
	public int getBaseRangeTank() {
		return baseRangeTank;
	}
	public int getBaseTank() {
		return baseTank;
	}
	public int getBaseCarry() {
		return baseCarry;
	}
	public int getBasePillage() {
		return basePillage;
	}
	public int getBaseMoveDelay() {
		return baseMoveDelay;
	}
	public String getBaseDamageType() {
		return damageType;
	}
	public String getBaseMoveType() {
		return baseMoveType;
	}
}
