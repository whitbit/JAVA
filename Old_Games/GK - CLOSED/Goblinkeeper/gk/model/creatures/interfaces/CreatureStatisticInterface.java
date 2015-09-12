package model.creatures.interfaces;

public interface CreatureStatisticInterface {
	public int getStatisticCarryIncrementByOneLevel();
	public int getStatisticDamageIncrementByOneLevel();
	public int getStatisticHealthIncrementByOneLevel();
	public void setStatisticRangeOfCreature( int rangeOfCreature );
	public void setStatisticTilesPerHourOfCreature( int tilesPerHourOfCreature );
	public void setStatisticHealthOfCreature( int healthOfCreature );
	public void setStatisticDefenseOfCreature( int defenseOfCreature );
	public void setStatisticTankOfCreature( int tankOfCreature );
	public void setStatisticAccuracyOfCreature( int accuracyOfCreature );
	public void setStatisticAwarenessOfCreature( int awarenessOfCreature );
	public void setStatisticMoveDelayOfCreature( int moveDelayOfCreature );
	public void setStatisticHealingRateOfCreature( int healingRateOfCreature );
	public void setStatisticPillageOfCreature( int pillageOfCreature );
	public void setStatisticCarryOfCreature( int carryOfCreature );
	public void setStatisticRangeTankOfCreature( int rangeTankOfCreature );
	public void setStatisticDamageOfCreature( double damageOfCreature );
	public void setStatisticMoveTypeOfCreature( String moveTypeOfCreature );
	public void setStatisticDamageTypeOfCreature( String damagetypeOfCreature );
	public int getStatisticRangeOfCreature();
	public int getStatisticTilesPerHourOfCreature();
	public int getStatisticHealthOfCreature();
	public int getStatisticDefenseOfCreature();
	public int getStatisticTankOfCreature();
	public int getStatisticAccuracyOfCreature();
	public int getStatisticAwarenessOfCreature();
	public int getStatisticMoveDelayOfCreature();
	public int getStatisticHealingRateOfCreature();
	public int getStatisticPillageOfCreature();
	public int getStatisticCarryOfCreature();
	public int getStatisticRangeTankOfCreature();
	public double getStatisticDamageOfCreature();
	public String getStatisticMoveTypeOfCreature();
	public String getStatisticDamageTypeOfCreature();
	void setBaseStatisticOfCreature( String baseNameOfCreature, int baseTilesPerHourOfCreature, int baseHealthOfCreature, 
			int baseHealingRateOfCreature, double baseDamageOfCreature, int baseRangeOfCreature, int baseAccuracyOfCreature,
			int baseDefenseOfCreature, int baseCarryOfCreature, int basePillageOfCreature, int baseMoveDelayOfCreature, int baseAwarenessOfCreature, 
			int baseTankOfCreature, int baseRangeTankOfCreature, String baseMoveTypeOfCreature, String damageTypeOfCreature );
}