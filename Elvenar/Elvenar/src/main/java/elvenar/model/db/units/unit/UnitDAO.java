package elvenar.model.db.units.unit;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import elvenar.model.hibernate.util.HibernateUtil;
import elvenar.model.result.Result;
import elvenar.model.units.unit.IUnit;
import elvenar.model.units.unit.util.HumansList;
import elvenar.model.units.unit.util.ElvesList;
import elvenar.model.units.unit.util.ProvinceUnitList;
/**
 * Class for units database.
 * @author M.Mucha
 *
 */
public class UnitDAO {
	Unit u = null;

	public UnitDAO() {}

	/**
	 * Method gets all player units without promotion.
	 * @return
	 */
	private List< IUnit > getUnits() {
		List< IUnit > list = new ArrayList< IUnit >();
		list.addAll( new ElvesList< Unit >().getElvesList() );
		list.addAll( new HumansList< Unit >().getHumansList() );
		return list;
	}
	/**
	 * Method gets all province units without promotion.
	 * @return
	 */
	private List< IUnit > getUnitsProvinces() {
		List< IUnit > list = new ArrayList< IUnit >();
		list.addAll( new ProvinceUnitList< Unit >().getProvinceUnitList() );
		return list;
	}
	/**
	 * Method sets all data entity to database.
	 * @param u
	 * @param unit
	 */
	private void setDetailsOfUnits( Unit u, IUnit unit ) {
		this.u = u;
		this.u.setAttackBonus_1_Type( unit.getAttackBonus_1_Type() );
		this.u.setAttackBonus_1_Value( unit.getAttackBonus_1() );
		this.u.setAttackBonus_2_Type( unit.getAttackBonus_2_Type() );
		this.u.setAttackBonus_2_Value( unit.getAttackBonus_2() );
		
		this.u.setDefensBonus_1_Type( unit.getDefenseBonus_1_Type() );
		this.u.setDefenseBonus_1_Value( unit.getDefenseBonus_1() );
		this.u.setDefensBonus_2_Type( unit.getDefenseBonus_2_Type() );
		this.u.setDefenseBonus_2_Value( unit.getDefenseBonus_2() );
		
		this.u.setSpecialAbilityType( unit.getSpecialAbilityType() );
		this.u.setSpecialAbilityValue( unit.getSpecialAbility() );
		
		this.u.setAttackRange( unit.getAttackRange() );
		this.u.setDamageMaximum( unit.getDamageMaximum() );
		this.u.setDamageMinimal( unit.getDamageMinimal() );
		this.u.setHitpoints( unit.getHitpoints() );
		this.u.setInitiative( unit.getInitiative() );
		this.u.setMovementRange( unit.getMovementRange() );
		this.u.setStrikeBack( unit.getStrikeBack() );
		this.u.setWeight( unit.getWeight() );
		
		this.u.setUnitClass( unit.getUnitClass() );
		this.u.setUnitType( unit.getUnitType() );
		this.u.setRace( unit.getRace() );
		this.u.setPromotion( unit.getPromotion() );
	}
	/**
	 * Method insert all units to database table Class.
	 * First loop sets only player units like elves and humans,
	 * second loop sets only province units actually withour promotion.
	 */
	public String insertUnits() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction transaction = session.beginTransaction();
			/* Loop for player units. */
			for( IUnit unit : getUnits() ) {
				setDetailsOfUnits( new Unit(), unit );
				session.save( this.u );
				
				unit.unitPromotion();
				setDetailsOfUnits( new Unit(), unit );
				session.save( this.u );
			}
			/* Loop for province units. */
			for( IUnit unit : getUnitsProvinces() ) {
				setDetailsOfUnits( new Unit(), unit );
				session.save( this.u );
			}			
			transaction.commit();
			return Result.SUCCESS.getResult();
		} catch( Exception e ) {
			e.getStackTrace();
			return Result.FAILED.getResult();
		} finally {
			session.close();
		}		
	}	
}