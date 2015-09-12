package model.creatures;

import java.util.ArrayList;
import java.util.List;

public class Upkeep {
	private int firstResourceUpkeep, secondResourceUpkeep, thirdResourceUpkeep, fourResourceUpkeep;
	
	public Upkeep( int firstResourceUpkeep, int secondResourceUpkeep ) {
		this.firstResourceUpkeep = firstResourceUpkeep;
		this.secondResourceUpkeep = secondResourceUpkeep;
		this.thirdResourceUpkeep = 0;
		this.fourResourceUpkeep = 0;
	}
	public Upkeep( int firstResourceUpkeep, int secondResourceUpkeep, int thirdResourceUpkeep ) {
		this.firstResourceUpkeep = firstResourceUpkeep;
		this.secondResourceUpkeep = secondResourceUpkeep;
		this.thirdResourceUpkeep = thirdResourceUpkeep;
		this.fourResourceUpkeep = 0;
	}
	public Upkeep( int firstResourceUpkeep, int secondResourceUpkeep, int thirdResourceUpkeep, int fourResourceUpkeep ) {
		this.firstResourceUpkeep = firstResourceUpkeep;
		this.secondResourceUpkeep = secondResourceUpkeep;
		this.thirdResourceUpkeep = thirdResourceUpkeep;
		this.fourResourceUpkeep = fourResourceUpkeep;
	}
	
	public int getFirstResourceUpkeep(){
		return firstResourceUpkeep;
	}
	public int getSecondResourceUpkeep(){
		return secondResourceUpkeep;
	}
	public int getThirdResourceUpkeep(){
		return thirdResourceUpkeep;
	}
	public int getFourResourceUpkeep(){
		return fourResourceUpkeep;
	}
	public void setFirstResourceUpkeep( int firstResourceUpkeep ) {
		this.firstResourceUpkeep = firstResourceUpkeep;
	}
	public void setSecondResourceUpkeep( int secondResourceUpkeep ) {
		this.secondResourceUpkeep = secondResourceUpkeep;
	}
	public void setThirdResourceUpkeep( int thirdResourceUpkeep ) {
		this.thirdResourceUpkeep = thirdResourceUpkeep;
	}
	public void setFourResourceUpkeep( int fourResourceUpkeep ) {
		this.fourResourceUpkeep = fourResourceUpkeep;
	}
}

