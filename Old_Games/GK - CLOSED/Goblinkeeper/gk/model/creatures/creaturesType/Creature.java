package model.creatures.creaturesType;

import model.creatures.interfaces.CreatureInterface;

public abstract class Creature implements CreatureInterface {
	private String statusOfCreature = "Active";
	private String nameOfCreature = "Creature";
	private String moveTypeOfCreature, damageTypeOfCreature;
	private int levelOfCreature = 1;
	private int happienesOfCreature = 100;
	private int tilesPerHourOfCreature, healthOfCreature, healingRateOfCreature, rangeOfCreature, accuracyOfCreature, defenseOfCreature, 
				carryOfCreature, pillageOfCreature, moveDelayOfCreature, awarenessOfCreature, tankOfCreature, rangeTankOfCreature;
	private double damageOfCreature, physicResistanceOfCreature, magicResistanceOfCreature, diseaseResistanceOfCreature, fireResistanceOfCreature,
					coldResistanceOfCreature, electricResistanceOfCreature, poisonResistanceOfCreature;
	public final int statisticCarryIncrementByOneLevel = 0;
	public final int statisticDamageIncrementByOneLevel = 0;
	public final int statisticHealthIncrementByOneLevel = 0;
	public Creature() {
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, 
				/*baseRange*/1, /*baseAccuracy*/0, /*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0,
				/*baseTank*/0, /*baseRangeTank*/0, /*baseMoveType*/"None", /*damageType*/"None" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( levelOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatusOfCreature( statusOfCreature );
	}
	public Creature( int levelOfCreature ) {
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, 
				/*baseRange*/1, /*baseAccuracy*/0, /*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0,
				/*baseTank*/0, /*baseRangeTank*/0, /*baseMoveType*/"None", /*damageType*/"None" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( levelOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatusOfCreature( statusOfCreature );
	}
	public Creature( String nameOfCreature ) {
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, 
				/*baseRange*/1, /*baseAccuracy*/0, /*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0,
				/*baseTank*/0, /*baseRangeTank*/0, /*baseMoveType*/"None", /*damageType*/"None" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( levelOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatusOfCreature( statusOfCreature );
	}
	public Creature( int levelOfCreature, String statusOfCreature ) {
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, 
				/*baseRange*/1, /*baseAccuracy*/0, /*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0,
				/*baseTank*/0, /*baseRangeTank*/0, /*baseMoveType*/"None", /*damageType*/"None" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( levelOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatusOfCreature( statusOfCreature );
	}
	public Creature( String nameOfCreature, int levelOfCreature ) {
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, 
				/*baseRange*/1, /*baseAccuracy*/0, /*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0,
				/*baseTank*/0, /*baseRangeTank*/0, /*baseMoveType*/"None", /*damageType*/"None" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( levelOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatusOfCreature( statusOfCreature );
	}
	public Creature( String nameOfCreature, int levelOfCreature, String statusOfCreature ) {
		setBaseStatisticOfCreature( /*baseName*/nameOfCreature, /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, 
				/*baseRange*/1, /*baseAccuracy*/0, /*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0,
				/*baseTank*/0, /*baseRangeTank*/0, /*baseMoveType*/"None", /*damageType*/"None" );
		setResistanceOfCreature( /*physic*/0.0, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
		setLevelOfCreature( levelOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatusOfCreature( statusOfCreature );
	}  
	@Override
	public void setNameOfCreature( String nameOfCreature ) {
		this.nameOfCreature = nameOfCreature;
	}
	@Override
	public void setLevelOfCreature( int levelOfCreature ) {
		this.levelOfCreature = levelOfCreature;
	}
	@Override
	public void setHappienesOfCreature( int happienesOfCreature ) {
		this.happienesOfCreature = happienesOfCreature;
	}
	@Override
	public void setStatusOfCreature( String statusOfCreature ) {
		this.statusOfCreature = statusOfCreature;
	}
	@Override
	public String getNameOfCreature() {
		return nameOfCreature;
	}
	@Override
	public int getLevelOfCreature() {
		return levelOfCreature;
	}
	@Override
	public int getHappienesOfCreature() {
		return happienesOfCreature;
	}
	@Override
	public String getStatusOfCreature() {
		return statusOfCreature;
	}
	@Override
	public int getStatisticCarryIncrementByOneLevel() {
		return statisticCarryIncrementByOneLevel;
	}
	@Override
	public int getStatisticDamageIncrementByOneLevel() {
		return statisticDamageIncrementByOneLevel;
	}
	@Override
	public int getStatisticHealthIncrementByOneLevel() {
		return statisticHealthIncrementByOneLevel;
	} 
	@Override
	public void setStatisticRangeOfCreature( int rangeOfCreature ) {
		this.rangeOfCreature = rangeOfCreature;
	}
	@Override
	public void setStatisticTilesPerHourOfCreature( int tilesPerHourOfCreature ) {
		this.tilesPerHourOfCreature = tilesPerHourOfCreature;
	}
	@Override
	public void setStatisticHealthOfCreature( int healthOfCreature ) {
		this.healthOfCreature = healthOfCreature;
	}
	@Override
	public void setStatisticDefenseOfCreature( int defenseOfCreature ) {
		this.defenseOfCreature = defenseOfCreature;
	}
	@Override
	public void setStatisticTankOfCreature( int tankOfCreature ) {
		this.tankOfCreature = tankOfCreature;
	}
	@Override
	public void setStatisticAccuracyOfCreature( int accuracyOfCreature ) {
		this.accuracyOfCreature = accuracyOfCreature;
	}
	@Override
	public void setStatisticAwarenessOfCreature( int awarenessOfCreature ) {
		this.awarenessOfCreature = awarenessOfCreature;
	}
	@Override
	public void setStatisticMoveDelayOfCreature( int moveDelayOfCreature ) {
		this.moveDelayOfCreature = moveDelayOfCreature;
	}
	@Override
	public void setStatisticHealingRateOfCreature( int healingRateOfCreature ) {
		this.healingRateOfCreature = healingRateOfCreature;
	}
	@Override
	public void setStatisticPillageOfCreature( int pillageOfCreature ) {
		this.pillageOfCreature = pillageOfCreature;
	}
	@Override
	public void setStatisticCarryOfCreature( int carryOfCreature ) {
		this.carryOfCreature = carryOfCreature;
	}
	@Override
	public void setStatisticRangeTankOfCreature( int rangeTankOfCreature ) {
		this.rangeTankOfCreature = rangeTankOfCreature;
	}
	@Override
	public void setStatisticDamageOfCreature( double damageOfCreature ) {
		this.damageOfCreature = damageOfCreature;
	}
	@Override
	public void setStatisticMoveTypeOfCreature( String moveTypeOfCreature ) {
		this.moveTypeOfCreature = moveTypeOfCreature;
	}
	@Override
	public void setStatisticDamageTypeOfCreature( String damageTypeOfCreature ) {
		this.damageTypeOfCreature = damageTypeOfCreature;
	}
	@Override
	public void setPhysicResistanceOfCreature( double physicResistanceOfCreature ) {
		this.physicResistanceOfCreature = physicResistanceOfCreature;
	}
	@Override
	public void setMagicResistanceOfCreature( double magicResistanceOfCreature ) {
		this.magicResistanceOfCreature = magicResistanceOfCreature;
	}
	@Override
	public void setDiseaseResistanceOfCreature( double diseaseResistanceOfCreature ) {
		this.diseaseResistanceOfCreature = diseaseResistanceOfCreature;
	}
	@Override
	public void setFireResistanceOfCreature( double fireResistanceOfCreature ) {
		this.fireResistanceOfCreature = fireResistanceOfCreature;
	}
	@Override
	public void setColdResistanceOfCreature( double coldResistanceOfCreature ) {
		this.coldResistanceOfCreature = coldResistanceOfCreature;
	}
	@Override
	public void setElectricResistanceOfCreature( double electricResistanceOfCreature ) {
		this.electricResistanceOfCreature = electricResistanceOfCreature;
	}
	@Override
	public void setPoisonResistanceOfCreature( double poisonResistanceOfCreature ) {
		this.poisonResistanceOfCreature = poisonResistanceOfCreature;
	}
	@Override
	public int getStatisticRangeOfCreature() {
		return rangeOfCreature;
	}
	@Override
	public int getStatisticTilesPerHourOfCreature() {
		return tilesPerHourOfCreature;
	}
	@Override
	public int getStatisticHealthOfCreature() {
		return healthOfCreature;
	}
	@Override
	public int getStatisticDefenseOfCreature() {
		return defenseOfCreature;
	}
	@Override
	public int getStatisticTankOfCreature() {
		return tankOfCreature;
	}
	@Override
	public int getStatisticAccuracyOfCreature() {
		return accuracyOfCreature;
	}
	@Override
	public int getStatisticAwarenessOfCreature() {
		return awarenessOfCreature;
	}
	@Override
	public int getStatisticMoveDelayOfCreature() {
		return moveDelayOfCreature;
	}
	@Override
	public int getStatisticHealingRateOfCreature() {
		return healingRateOfCreature;
	}
	@Override
	public int getStatisticPillageOfCreature() {
		return pillageOfCreature;
	}
	@Override
	public int getStatisticCarryOfCreature() {
		return carryOfCreature;
	}
	@Override
	public int getStatisticRangeTankOfCreature() {
		return rangeTankOfCreature;
	}
	@Override
	public double getStatisticDamageOfCreature() {
		return damageOfCreature;
	}
	@Override
	public String getStatisticMoveTypeOfCreature() {
		return moveTypeOfCreature;
	}
	@Override
	public String getStatisticDamageTypeOfCreature() {
		return damageTypeOfCreature;
	}
	@Override
	public double getPhysicResistanceOfCreature() {
		return physicResistanceOfCreature;
	}
	@Override
	public double getMagicResistanceOfCreature() {
		return magicResistanceOfCreature;
	}
	@Override
	public double getDiseaseResistanceOfCreature() {
		return diseaseResistanceOfCreature;
	}
	@Override
	public double getFireResistanceOfCreature() {
		return fireResistanceOfCreature;
	}
	@Override
	public double getColdResistanceOfCreature() {
		return coldResistanceOfCreature;
	}
	@Override
	public double getElectricResistanceOfCreature() {
		return electricResistanceOfCreature;
	}
	@Override
	public double getPoisonResistanceOfCreature() {
		return poisonResistanceOfCreature;
	}
	@Override
	public void setBaseStatisticOfCreature( String baseNameOfCreature, int baseTilesPerHourOfCreature, int baseHealthOfCreature, int baseHealingRateOfCreature, 
			double baseDamageOfCreature, int baseRangeOfCreature, int baseAccuracyOfCreature, int baseDefenseOfCreature, int baseCarryOfCreature, 
			int basePillageOfCreature, int baseMoveDelayOfCreature, int baseAwarenessOfCreature, int baseTankOfCreature, 
			int baseRangeTankOfCreature, String baseMoveTypeOfCreature, String damageTypeOfCreature ) {
		setNameOfCreature( baseNameOfCreature );
		setLevelOfCreature( levelOfCreature );
		setStatusOfCreature( statusOfCreature );
		setHappienesOfCreature( happienesOfCreature );
		setStatisticTilesPerHourOfCreature( baseTilesPerHourOfCreature );
		setStatisticHealthOfCreature( baseHealthOfCreature );
		setStatisticHealingRateOfCreature( baseHealingRateOfCreature );
		setStatisticRangeOfCreature( baseRangeOfCreature ); 
		setStatisticAccuracyOfCreature( baseAccuracyOfCreature );
		setStatisticDefenseOfCreature( baseDefenseOfCreature ); 
		setStatisticCarryOfCreature( baseCarryOfCreature );
		setStatisticPillageOfCreature( basePillageOfCreature );
		setStatisticMoveDelayOfCreature( baseMoveDelayOfCreature );
		setStatisticAwarenessOfCreature( baseAwarenessOfCreature );
		setStatisticTankOfCreature( baseTankOfCreature );
		setStatisticRangeTankOfCreature( baseRangeTankOfCreature );
		setStatisticDamageOfCreature( baseDamageOfCreature );
		setStatisticMoveTypeOfCreature( baseMoveTypeOfCreature );
		setStatisticDamageTypeOfCreature( damageTypeOfCreature );	
	}
	@Override
	public void setResistanceOfCreature( double physicResistanceOfCreature, double magicResistanceOfCreature, double diseaseResistanceOfCreature,
			double fireResistanceOfCreature, double coldResistanceOfCreature, double electricResistanceOfCreature, double poisonResistanceOfCreature ) {
		setPhysicResistanceOfCreature( physicResistanceOfCreature );
		setMagicResistanceOfCreature( magicResistanceOfCreature );
		setDiseaseResistanceOfCreature( diseaseResistanceOfCreature );
		setFireResistanceOfCreature( fireResistanceOfCreature );
		setColdResistanceOfCreature( coldResistanceOfCreature );
		setElectricResistanceOfCreature( electricResistanceOfCreature );
		setPoisonResistanceOfCreature( poisonResistanceOfCreature );
	}
}