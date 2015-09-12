package model.creatures;

import java.util.List;

import model.creatures.Resistance;

public interface BaseInfoInterface {
	public List< String > getAllBaseAttributes();
	public List< String > getBaseUpkeep();
	public String getSpecialAbility();
	public String getName();
	public Resistance getResistance();
}
