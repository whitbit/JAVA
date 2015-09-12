package elvenar.model.units.unit.base.stat;

import java.util.HashMap;
/**
 * Statistics object for each unit using enumeration of attributes and sets all statistics.
 * @author M.Mucha
 *
 */
public class Statistics {
	private final HashMap< Attributes, Integer > MAP_STAT = new HashMap< Attributes, Integer >();

	public Statistics() {
		this.setAttributes( 0, 0, 0, 0, 0, 0, 0, false );
	}

	public int getDamageMinimal() {
		return this.MAP_STAT.get( Attributes.DAMAGE_MINIMAL );
	}
	private void setDamageMinimal( int damageMinimal ) {
		this.MAP_STAT.put( Attributes.DAMAGE_MINIMAL, damageMinimal );
	}
	public int getDamageMaximum() {
		return this.MAP_STAT.get( Attributes.DAMAGE_MAXIMUM );
	}
	private void setDamageMaximum( int damageMaximum ) {
		this.MAP_STAT.put( Attributes.DAMAGE_MAXIMUM, damageMaximum );
	}
	public int getHitpoints() {
		return this.MAP_STAT.get( Attributes.HITPOINTS );
	}
	private void setHitpoints( int hitpoints ) {
		this.MAP_STAT.put( Attributes.HITPOINTS, hitpoints );
	}
	public int getWeight() {
		return this.MAP_STAT.get( Attributes.WEIGHT );
	}
	private void setWeight( int weight ) {
		this.MAP_STAT.put( Attributes.WEIGHT, weight );
	}
	public int getMovementRange() {
		return this.MAP_STAT.get( Attributes.MOVEMENT_RANGE );
	}
	private void setMovementRange( int movementRange ) {
		this.MAP_STAT.put( Attributes.MOVEMENT_RANGE, movementRange );
	}
	public int getAttackRange() {
		return this.MAP_STAT.get( Attributes.ATTACK_RANGE );
	}
	private void setAttackRange( int attackRange ) {
		this.MAP_STAT.put( Attributes.ATTACK_RANGE, attackRange );
	}
	public int getInitiative() {
		return this.MAP_STAT.get( Attributes.INITIATIVE );
	}
	private void setInitiative( int initiative ) {
		this.MAP_STAT.put( Attributes.INITIATIVE, initiative );
	}
	public int getStrikeBack() {
		return this.MAP_STAT.get( Attributes.STRIKE_BACK );
	}
	private final int convertBool( boolean valueBool ) {
		return !( valueBool ) ? 0 : 1;
	}
	private void setStrikeBack( boolean strikeBack ) {
		this.MAP_STAT.put( Attributes.STRIKE_BACK, convertBool( strikeBack ) );
	}	
	public final void setAttributes( int damageMinimal, int damageMaximum, int hitpoints, int weight, int movementRange, int attackRange, int initiative, boolean strikeBack ) {		
		this.setDamageMinimal( damageMinimal );
		this.setDamageMaximum( damageMaximum );
		this.setHitpoints( hitpoints );
		this.setWeight( weight );
		this.setMovementRange( movementRange );
		this.setAttackRange( attackRange );
		this.setInitiative( initiative );
		this.setStrikeBack( strikeBack );	
	}
	public final void setPromotionAttributes( int damageMinimal, int damageMaximum, int hitpoints ) {		
		this.setDamageMinimal( damageMinimal );
		this.setDamageMaximum( damageMaximum );
		this.setHitpoints( hitpoints );	
	}
}