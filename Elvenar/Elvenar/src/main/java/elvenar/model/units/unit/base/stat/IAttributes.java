package elvenar.model.units.unit.base.stat;
/**
 * Attributes interface.
 * @author M.Mucha
 *
 */
public interface IAttributes {
	public int getDamageMinimal();
	public int getDamageMaximum();
	public int getHitpoints();
	public int getWeight();
	public int getMovementRange();
	public int getAttackRange();
	public int getInitiative();
	public int getStrikeBack();
}