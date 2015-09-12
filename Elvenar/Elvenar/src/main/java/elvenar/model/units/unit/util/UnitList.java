package elvenar.model.units.unit.util;

import java.util.ArrayList;
import java.util.List;

import elvenar.model.units.unit.IUnit;
/**
 * 
 * @author M.Mucha
 *
 * @param <Unit>
 */
public class UnitList< Unit > extends ArrayList< Unit > {
	private static List< IUnit > unitList = new ArrayList< IUnit >();	
	
	public UnitList() {
		super();
		setUnitList();
	}

	public List< IUnit > getUnitList() {
		return UnitList.unitList;
	}
	private static final void setUnitList() {
		List< IUnit > elves = new ElvesList< IUnit >().getElvesList();
		List< IUnit > humans = new HumansList< IUnit >().getHumansList();
		List< IUnit > province = new ProvinceUnitList< IUnit >().getProvinceUnitList();
		
		UnitList.unitList.addAll( elves );
		UnitList.unitList.addAll( humans );
		UnitList.unitList.addAll( province );
	}
	@Override 
	public int size() {
		return this.getUnitList().size();
	}
}