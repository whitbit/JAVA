package elvenar.model.units.unit.util;

import java.util.ArrayList;
import java.util.List;

import elvenar.model.units.unit.IUnit;
import elvenar.model.units.unit.provinces.*;
/**
 * List of ProvinceUnits.
 * @author M.Mucha
 *
 * @param <Unit>
 */
public class ProvinceUnitList< Unit > extends ArrayList< Unit > {
	private static List< IUnit > provinceUnitList = new ArrayList< IUnit >( 10 );

	public ProvinceUnitList() {
		super();
		setProvinceUnitList();
	}
	
	public List< IUnit > getProvinceUnitList() {
		return ProvinceUnitList.provinceUnitList;
	}
	private static final void setProvinceUnitList() {
		ProvinceUnitList.provinceUnitList.add( new Archery() );
		ProvinceUnitList.provinceUnitList.add( new Bandit() );
		ProvinceUnitList.provinceUnitList.add( new Knight() );
		ProvinceUnitList.provinceUnitList.add( new Cannoneer() );
		ProvinceUnitList.provinceUnitList.add( new Necromancer() );
		ProvinceUnitList.provinceUnitList.add( new Orc() );
		ProvinceUnitList.provinceUnitList.add( new Steinling() );
		ProvinceUnitList.provinceUnitList.add( new SwampMonster() );
		ProvinceUnitList.provinceUnitList.add( new Thief() );
		ProvinceUnitList.provinceUnitList.add( new WarDog() );	
	}
	@Override 
	public int size() {
		return this.getProvinceUnitList().size();
	}
}