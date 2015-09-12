package elvenar.model.db.units.types;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import elvenar.model.hibernate.util.HibernateUtil;
import elvenar.model.result.Result;
import elvenar.model.units.unit.base.bonus.SpecialAbility;
/**
 * Class for special abilities database.
 * @author M.Mucha
 *
 */
public class SpecialAbilityDAO {
	Special_Ability specialA = null;

	public SpecialAbilityDAO() {}
	
	/**
	 * Method gets all special abilities.
	 * @return
	 */
	private List< SpecialAbility > getSpecialAbility() {
		List< SpecialAbility > list = new ArrayList< SpecialAbility >();
		list.add( SpecialAbility.BROKEN_VALOR );
		list.add( SpecialAbility.BROKEN_VALOR_II );
		list.add( SpecialAbility.DAZE_ENEMIES );
		list.add( SpecialAbility.DAZE_ENEMIES_II );
		list.add( SpecialAbility.DIVINE_CURSE );
		list.add( SpecialAbility.DIVINE_CURSE_II );
		list.add( SpecialAbility.PIERCE_CURSE );
		list.add( SpecialAbility.PIERCE_CURSE_II );
		list.add( SpecialAbility.WOUND_ENEMIES );
		list.add( SpecialAbility.WOUND_ENEMIES_II );
		return list;
	}
	/**
	 * Method insert all special abilities to database table specialability.
	 */
	public String insertSpecialAbilities() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction transaction = session.beginTransaction();
			for( SpecialAbility sa : getSpecialAbility() ) {
				this.specialA = new Special_Ability();
				this.specialA.setName( sa.getName() );
				this.specialA.setValue( sa.getValue() );
				this.specialA.setDescription( sa.getDescription() );
				session.save( this.specialA );
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