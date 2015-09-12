package elvenar.model.units.unit;

import elvenar.model.units.unit.base.bonus.IBonus;
import elvenar.model.units.unit.base.stat.IAttributes;
import elvenar.model.units.unit.base.types.IType;
/**
 * Interface for units.
 * @author M.Mucha
 *
 */
public interface IUnit extends IAttributes, IType, IBonus {
	public abstract void unitPromotion();
	public int getPromotion();
}