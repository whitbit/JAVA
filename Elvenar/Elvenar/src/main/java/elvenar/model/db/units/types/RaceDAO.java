package elvenar.model.db.units.types;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import elvenar.model.hibernate.util.HibernateUtil;
import elvenar.model.result.Result;
import elvenar.model.units.unit.base.types.ElvesType;
import elvenar.model.units.unit.base.types.HumansType;
import elvenar.model.units.unit.base.types.ProvinceUnitsType;
/**
 * Insert races to DB.
 * @author M.Mucha
 *
 */
public class RaceDAO {
	private Race race = null;

	public RaceDAO() {}
	
	/**
	 * Method gets all races.
	 * @return
	 */
	private List< String > getRaces() {
		List< String > list = new ArrayList< String >();
		list.add( HumansType.HUMANS.getName() );
		list.add( ElvesType.ELVES.getName() );
		list.add( ProvinceUnitsType.PROVINCE_UNIT.getName() );
		return list;
	}
	/**
	 * Method insert all races to database table Race.
	 */
	public String insertRace() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction transaction = session.beginTransaction();
			for( String name : this.getRaces() ) {
				this.race = new Race();
				this.race.setName( name );
				session.save( this.race );
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