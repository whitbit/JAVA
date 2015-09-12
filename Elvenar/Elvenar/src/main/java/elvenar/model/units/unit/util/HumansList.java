package elvenar.model.units.unit.util;

import java.util.ArrayList;
import java.util.List;

import elvenar.model.units.unit.IUnit;
import elvenar.model.units.unit.humans.*;
/**
 * List of Humans.
 * @author M.Mucha
 *
 * @param <Unit>
 */
public class HumansList< Unit > extends ArrayList< Unit > {
	private static List< IUnit > unitList = new ArrayList< IUnit >( 5 );

	public HumansList() {
		super();
		setHumansList();
	}
	
	public List< IUnit > getHumansList() {
		return HumansList.unitList;
	}
	private static final void setHumansList() {
		HumansList.unitList.add( new AxeBarbarian() );
		HumansList.unitList.add( new Crossbowman() );
		HumansList.unitList.add( new Cerberus() );
		HumansList.unitList.add( new Paladin() );
		HumansList.unitList.add( new Priest() );
	}	
	@Override 
	public int size() {
		return this.getHumansList().size();
	}
}