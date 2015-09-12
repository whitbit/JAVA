package model.creatures;

public abstract class Creature implements CreatureInterface {
	private int tilesPerHour, health, healingRate, range, accuracy, defense, carry, pillage, moveDelay, awareness, tank, rangeTank;
	private double damage, physic, magic, disease, fire, cold, electric, poison;
	private String name, moveType, damagetype;
	
	public Creature() {
		setName( "Creature" );
		setInformation( /*baseTilesPerHour*/0, /*baseHealth*/0, /*baseHealingRate*/0, /*baseDamage*/0, /*baseRange*/0, /*baseAccuracy*/0, 
				/*baseDefense*/0, /*baseCarry*/0, /*basePillage*/0, /*baseMoveDelay*/0, /*baseAwareness*/0, /*baseTank*/0, /*baseRangeTank*/0, 
				/*baseMoveType*/"None", /*damageType*/"None" );
		setResistance( /*physic*/0.25, /*magic*/0.0, /*disease*/0.0, /*fire*/0.0, /*cold*/0.0, /*electric*/0.0, /*poison*/0.0 );
	}

	public void setResistance( double physic, double magic, double disease, double fire, double cold, double electric, double poison ) {
		this.physic = physic;
		this.magic = magic;
		this.disease = disease;
		this.fire = fire;
		this.cold = cold;
		this.electric = electric;
		this.poison = poison;
	}
	public String getResistance() {
		return "Resistance of: " + getName() + "\n======================\nPhysic: " + ( int )( getResistancePhysic() * 100 ) + "%" + 
				"\nMagic: " + ( int )( getResistanceMagic() * 100 ) + "%" + "\nDisease: " + ( int )(getResistanceDisease() * 100) + "%" + 
				"\nFire: " + ( int )( getResistanceFire() * 100 ) + "%" + "\nCold: " + ( int )( getResistanceCold() * 100 ) + "%" + 
				"\nElectric: " + ( int )( getResistanceElectric() * 100 ) + "%" + "\nPoison: " + ( int )( getResistancePoison() * 100 ) + "%";
	}


	public int getStatisticRange() {
		return range;
	}
	public void setStatisticRange( int range ) {
		this.range = range;
	}
	public int getStatisticTilesPerHour() {
		return tilesPerHour;
	}
	public void setStatisticTilesPerHour( int tilesPerHour ) {
		this.tilesPerHour = tilesPerHour;
	}
	public int getStatisticHealth() {
		return health;
	}
	public void setStatisticHealth( int health ) {
		this.health = health;
	}
	public int getStatisticDefense() {
		return defense;
	}
	public void setStatisticDefense( int defense ) {
		this.defense = defense;
	}
	public int getStatisticTank() {
		return tank;
	}
	public void setStatisticTank( int tank ) {
		this.tank = tank;
	}
	public int getStatisticAccuracy() {
		return accuracy;
	}
	public void setStatisticAccuracy( int accuracy ) {
		this.accuracy = accuracy;
	}
	public int getStatisticAwareness() {
		return awareness;
	}
	public void setStatisticAwareness( int awareness ) {
		this.awareness = awareness;
	}
	public int getStatisticMoveDelay() {
		return moveDelay;
	}
	public void setStatisticMoveDelay( int moveDelay ) {
		this.moveDelay = moveDelay;
	}
	public int getStatisticHealingRate() {
		return healingRate;
	}
	public void setStatisticHealingRate( int healingRate ) {
		this.healingRate = healingRate;
	}
	public int getStatisticPillage() {
		return pillage;
	}
	public void setStatisticPillage( int pillage ) {
		this.pillage = pillage;
	}
	public int getStatisticCarry() {
		return carry;
	}
	public void setStatisticCarry( int carry ) {
		this.carry = carry;
	}
	public int getStatisticRangeTank() {
		return rangeTank;
	}
	public void setStatisticRangeTank( int rangeTank ) {
		this.rangeTank = rangeTank;
	}
	public double getStatisticDamage() {
		return damage;
	}
	public void setStatisticDamage( double damage ) {
		this.damage = damage;
	}
	public String getStatisticMoveType() {
		return moveType;
	}
	public void setStatisticMoveType( String moveType ) {
		this.moveType = moveType;
	}
	public String getStatisticDamageType() {
		return damagetype;
	}
	public void setStatisticDamageType( String damagetype ) {
		this.damagetype = damagetype;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public String getInformation() {
		return "Information about: " + getName() + "\n=====================\nTiles Per Hour: " + getStatisticTilesPerHour() + 
				"\nHealth: " + getStatisticHealth() + "\nHealing Rate: " + getStatisticHealingRate() + "\nDamage: " + getStatisticDamage() + 
				"\nRange: " + getStatisticRange() + "\nAccuracy: " + getStatisticAccuracy() + "\nDefense: " + getStatisticDefense() + 
				"\nCarry: " + getStatisticCarry() + "\nPillage: " + getStatisticPillage() + "\nMove Delay: " + getStatisticMoveDelay() + 
				"\nAwareness: " + getStatisticAwareness() + "\nTank: " + getStatisticTank() + "\nRange Tank: " + getStatisticRangeTank() + 
				"\nMove Type: " + getStatisticMoveType() + "\nDamage Type: " + getStatisticDamageType();
		
	}
	public void setInformation( int tilesPerHour, int health, int healingRate, double damage, int range, int accuracy, int defense, 
			int carry, int pillage, int moveDelay, int awareness, int tank, int rangeTank, String moveType, String damageType ) {
		setStatisticRange( range );
		setStatisticTilesPerHour( tilesPerHour );
		setStatisticHealth( health );
		setStatisticDefense( defense );
		setStatisticTank( tank );
		setStatisticAccuracy( accuracy );
		setStatisticAwareness( awareness );
		setStatisticMoveDelay( moveDelay );
		setStatisticHealingRate( healingRate );
		setStatisticPillage( pillage );
		setStatisticCarry( carry );
		setStatisticRangeTank( rangeTank );
		setStatisticDamage( damage );
		setStatisticMoveType( moveType );
		setStatisticDamageType( damageType );
		
	}

	public double getResistancePoison() {
		return poison;
	}
	public double getResistanceFire() {
		return fire;
	}
	public double getResistanceMagic() {
		return magic;
	}
	public double getResistanceCold() {
		return cold;
	}
	public double getResistanceElectric() {
		return electric;
	}
	public double getResistanceDisease() {
		return disease;
	}

	public double getResistancePhysic() {
		return physic;
	}

		
}
