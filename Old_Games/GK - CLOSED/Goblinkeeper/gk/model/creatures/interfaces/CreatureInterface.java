package model.creatures.interfaces;


public interface CreatureInterface extends CreatureStatisticInterface, CreatureResistanceInterface {
	public String getNameOfCreature();
	public String getStatusOfCreature();
	public int getLevelOfCreature();
	public int getHappienesOfCreature();
	public void setNameOfCreature( String nameOfCreature );
	public void setLevelOfCreature( int levelOfCreature );
	public void setHappienesOfCreature( int happienesOfCreature );
	public void setStatusOfCreature( String statusOfCreature );
	public void setBaseStatisticOfCreature( String baseNameOfCreature, int baseTilesPerHourOfCreature, int baseHealthOfCreature, int baseHealingRateOfCreature, 
			double baseDamageOfCreature, int baseRangeOfCreature, int baseAccuracyOfCreature, int baseDefenseOfCreature, int baseCarryOfCreature, 
			int basePillageOfCreature, int baseMoveDelayOfCreature, int baseAwarenessOfCreature, int baseTankOfCreature, int baseRangeTankOfCreature, 
			String baseMoveTypeOfCreature, String damageTypeOfCreature );
	public void setResistanceOfCreature( double physicResistanceOfCreature, double magicResistanceOfCreature, double diseaseResistanceOfCreature, 
			double fireResistanceOfCreature, double coldResistanceOfCreature, double electricResistanceOfCreature, double poisonResistanceOfCreature );
}