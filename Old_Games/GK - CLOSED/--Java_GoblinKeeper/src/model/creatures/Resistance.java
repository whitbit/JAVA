package model.creatures;

import java.util.ArrayList;
import java.util.List;

public class Resistance {
	private List< String > resistanceList = new ArrayList< String >();
	private double physic, magic, disease, fire, cold, electric, poison;

	public Resistance( double physic, double magic, double disease, double fire, double cold, double electric, double poison ) {
		this.physic = physic;
		this.magic = magic;
		this.disease = disease;
		this.fire = fire;
		this.cold = cold;
		this.electric = electric;
		this.poison = poison;
	}
	
	public List< String > getAllResistance() {
		resistanceList.add( "Physic: " + ( int ) ( getPhysic() * 100 ) + "%" );
		resistanceList.add( "Magic: " + ( int ) ( getMagic() * 100 ) + "%" );
		resistanceList.add( "Disease: " + ( int ) ( getDisease() * 100 ) + "%" );
		resistanceList.add( "Fire: " + ( int ) ( getFire() * 100 ) + "%" );
		resistanceList.add( "Cold: " + ( int ) ( getCold() * 100 ) + "%" );
		resistanceList.add( "Electric: " + ( int ) ( getElectric() * 100 ) + "%" );
		resistanceList.add( "Poison: " + ( int ) ( getPoison() * 100 ) + "%" );
		return resistanceList;
	}
	public double getPhysic() {
		return physic;
	}
	public double getMagic() {
		return magic;
	}
	public double getDisease() {
		return disease;
	}
	public double getFire() {
		return fire;
	}
	public double getCold() {
		return cold;
	}
	public double getElectric() {
		return electric;
	}
	public double getPoison() {
		return poison;
	}
}