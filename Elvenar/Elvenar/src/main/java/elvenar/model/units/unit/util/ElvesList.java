package elvenar.model.units.unit.util;

import java.util.ArrayList;
import java.util.List;

import elvenar.model.units.unit.IUnit;
import elvenar.model.units.unit.elves.*;
/**
 * List of Elves.
 * @author M.Mucha
 *
 * @param <Unit>
 */
public class ElvesList< Unit > extends ArrayList< Unit > {
	private static List< IUnit > elvesList = new ArrayList< IUnit >( 5 );

	public ElvesList() {
		super();
		setElvesList();
	}
	
	public List< IUnit > getElvesList() {
		return ElvesList.elvesList;
	}
	private static final void setElvesList() {
		ElvesList.elvesList.add( new SwordDancer() );
		ElvesList.elvesList.add( new Archer() );
		ElvesList.elvesList.add( new Treant() );
		ElvesList.elvesList.add( new Golem() );
		ElvesList.elvesList.add( new Sorceress() );
	}
	@Override 
	public int size() {
		return this.getElvesList().size();
	}
}