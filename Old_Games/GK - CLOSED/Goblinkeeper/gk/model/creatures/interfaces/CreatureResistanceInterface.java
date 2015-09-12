package model.creatures.interfaces;

public interface CreatureResistanceInterface {
	//public double physicResistanceOfCreature, magicResistanceOfCreature, diseaseResistanceOfCreature, fireResistanceOfCreature,
	//				coldResistanceOfCreature, electricResistanceOfCreature, poisonResistanceOfCreature;
	public void setPhysicResistanceOfCreature( double physicResistanceOfCreature );
	public void setMagicResistanceOfCreature( double magicResistanceOfCreature );
	public void setDiseaseResistanceOfCreature( double diseaseResistanceOfCreature );
	public void setFireResistanceOfCreature( double fireResistanceOfCreature );
	public void setColdResistanceOfCreature( double coldResistanceOfCreature );
	public void setElectricResistanceOfCreature( double electricResistanceOfCreature );
	public void setPoisonResistanceOfCreature( double poisonResistanceOfCreature );
	public double getPhysicResistanceOfCreature();
	public double getMagicResistanceOfCreature();
	public double getDiseaseResistanceOfCreature();
	public double getFireResistanceOfCreature();
	public double getColdResistanceOfCreature();
	public double getElectricResistanceOfCreature();
	public double getPoisonResistanceOfCreature();
}