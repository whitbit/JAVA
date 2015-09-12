package elvenar.model.db.units.types;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import elvenar.model.hibernate.util.HibernateUtil;
import elvenar.model.result.Result;
import elvenar.model.units.unit.base.types.UnitClasses;
/**
 * Class for unit classes.
 * @author M.Mucha
 *
 */
public class ClassesDAO {
	private Classes classes = null;

	public ClassesDAO() {}

	/**
	 * Method gets all classes.
	 * @return
	 */
	private List< UnitClasses > getClasses() {
		List< UnitClasses > list = new ArrayList< UnitClasses >();
		list.add( UnitClasses.HEAVY_MELEE );
		list.add( UnitClasses.HEAVY_RANGED );
		list.add( UnitClasses.LIGHT_MELEE );
		list.add( UnitClasses.MAGE );
		list.add( UnitClasses.SHORT_RANGED );
		return list;
	}
	/**
	 * Method insert all classes to database table Class.
	 */
	public String insertClasses() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction transaction = session.beginTransaction();
			for( UnitClasses uc : getClasses() ) {
				this.classes = new Classes();
				this.classes.setName( uc.getName() );
				this.classes.setDescription( uc.getDescription() );
				session.save( this.classes );
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