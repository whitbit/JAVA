package model.creatures;

public interface CreatureInterface {
	public void setName( String Name );
	public String getName();
	public String getInformation();	
	public void setResistance( double physic, double magic, double disease, double fire, double cold, double electric, double poison );
	public String getResistance();
	
	public double getResistancePoison();
	public double getResistanceFire();
	public double getResistanceMagic();
	public double getResistanceCold();
	public double getResistanceElectric();
	public double getResistanceDisease();
	public double getResistancePhysic();
	
	public int getStatisticRange();
	public void setStatisticRange( int range );
	public int getStatisticTilesPerHour();
	public void setStatisticTilesPerHour( int tilesPerHour );
	public int getStatisticHealth();
	public void setStatisticHealth( int health );
	public int getStatisticDefense();
	public void setStatisticDefense( int defense );
	public int getStatisticTank();
	public void setStatisticTank( int tank );
	public int getStatisticAccuracy();
	public void setStatisticAccuracy( int accuracy );
	public int getStatisticAwareness();
	public void setStatisticAwareness( int awareness );
	public int getStatisticMoveDelay();
	public void setStatisticMoveDelay( int moveDelay );
	public int getStatisticHealingRate();
	public void setStatisticHealingRate( int healingRate );
	public int getStatisticPillage();
	public void setStatisticPillage( int pillage );
	public int getStatisticCarry();
	public void setStatisticCarry( int carry );
	public int getStatisticRangeTank();
	public void setStatisticRangeTank( int rangeTank );
	public double getStatisticDamage();
	public void setStatisticDamage( double damage );
	public String getStatisticMoveType();
	public void setStatisticMoveType( String moveType );
	public String getStatisticDamageType();
	public void setStatisticDamageType( String damagetype );
}
