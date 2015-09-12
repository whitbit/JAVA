package elvenar.controller.db;

import elvenar.model.db.units.types.ClassesDAO;
import elvenar.model.db.units.types.RaceDAO;
import elvenar.model.db.units.types.SpecialAbilityDAO;
import elvenar.model.db.units.unit.UnitDAO;
/**
 * Class specialized to insert all based data to database.
 * Use this class only if you have empty database without base data.
 * @author M.Mucha
 *
 */
public class InsertBaseDataToDatabase {
	private static RaceDAO race;
	private static ClassesDAO classes;
	private static SpecialAbilityDAO specialAbility;
	private static UnitDAO unit;

	public InsertBaseDataToDatabase() {}

	public static void main( String[] args ) {
		try {
			insertRace();
			insertClasses();
			insertSpecialAbility();
			insertUnit();
		} catch( Exception e ) {
			e.getStackTrace();
		}
	}
	
	private static final void insertRace() {
		race = new RaceDAO();
		System.out.println( race.insertRace() );
	}
	private static final void insertClasses() {
		classes = new ClassesDAO();
		System.out.println( classes.insertClasses() );
	}
	private static final void insertSpecialAbility() {
		specialAbility = new SpecialAbilityDAO();
		System.out.println( specialAbility.insertSpecialAbilities() );
	}
	private static final void insertUnit() {
		unit = new UnitDAO();
		System.out.println( unit.insertUnits() );
	}
}