package test;

import java.util.List;
import elvenar.model.db.units.types.ClassesDAO;
import elvenar.model.db.units.types.RaceDAO;
import elvenar.model.db.units.types.SpecialAbilityDAO;
import elvenar.model.db.units.unit.UnitDAO;
import elvenar.model.units.unit.*;
import elvenar.model.units.unit.elves.Archer;
import elvenar.model.units.unit.elves.Golem;
import elvenar.model.units.unit.elves.Sorceress;
import elvenar.model.units.unit.elves.SwordDancer;
import elvenar.model.units.unit.elves.Treant;
import elvenar.model.units.unit.humans.AxeBarbarian;
import elvenar.model.units.unit.humans.Cerberus;
import elvenar.model.units.unit.humans.Paladin;
import elvenar.model.units.unit.humans.Priest;
import elvenar.model.units.unit.provinces.Cannoneer;
import elvenar.model.units.unit.provinces.Necromancer;
import elvenar.model.units.unit.provinces.Orc;
import elvenar.model.units.unit.provinces.WarDog;
import elvenar.model.units.unit.util.UnitList;

public class View {
	public View() {}
	
	public static void main( String[] args ) {
		IUnit u1 = new Sorceress();
		System.out.println( 
				u1.getUnitType() + " || " + u1.getUnitClass() + " || " +
				u1.getDamageMinimal() + " - " + u1.getDamageMaximum() + " || " +
				u1.getSpecialAbilityType() + " - " + u1.getSpecialAbility() + " || " +
				u1.getAttackBonus_1_Type() + " - " + u1.getAttackBonus_1() + " || " +
				u1.getAttackBonus_2_Type() + " - " + u1.getAttackBonus_2() + " || " +
				u1.getDefenseBonus_1_Type() + " - " + u1.getDefenseBonus_1() + " || " +
				u1.getDefenseBonus_2_Type() + " - " + u1.getDefenseBonus_2() + " || " + "\n"
		);
		u1.unitPromotion();
		System.out.println( 
				u1.getUnitType() + " || " + u1.getUnitClass() + " || " +
				u1.getDamageMinimal() + " - " + u1.getDamageMaximum() + " || " +
				u1.getSpecialAbilityType() + " - " + u1.getSpecialAbility() + " || " +
				u1.getAttackBonus_1_Type() + " - " + u1.getAttackBonus_1() + " || " +
				u1.getAttackBonus_2_Type() + " - " + u1.getAttackBonus_2() + " || " +
				u1.getDefenseBonus_1_Type() + " - " + u1.getDefenseBonus_1() + " || " +
				u1.getDefenseBonus_2_Type() + " - " + u1.getDefenseBonus_2() + " || " + "\n"
		);
	}
}