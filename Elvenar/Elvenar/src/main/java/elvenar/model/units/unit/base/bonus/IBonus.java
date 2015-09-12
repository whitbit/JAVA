package elvenar.model.units.unit.base.bonus;
/**
 * Bonuses interface.
 * @author M.Mucha
 *
 */
public interface IBonus {
	public abstract String getAttackBonus_1_Type();
	public abstract String getAttackBonus_2_Type();
	
	public abstract String getDefenseBonus_1_Type();
	public abstract String getDefenseBonus_2_Type();
	
	public abstract double getAttackBonus_1();
	public abstract double getAttackBonus_2();
	
	public abstract double getDefenseBonus_1();
	public abstract double getDefenseBonus_2();
	
	public abstract String getSpecialAbilityType();
	public abstract double getSpecialAbility();
}