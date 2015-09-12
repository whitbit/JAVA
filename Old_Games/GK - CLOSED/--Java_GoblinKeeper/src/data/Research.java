package data;

import java.util.ArrayList;
import java.util.List;
import model.creatures.Warlock;

public class Research {
	private int levelOfWarlock1, levelOfWarlock2, levelOfWarlock3, levelOfWarlock4, levelOfWarlock5, levelOfWarlock6, 
		levelOfWarlock7, levelOfWarlock8, summaryResearch;
	private Warlock warlock;
	private List< Warlock > warlockList = new ArrayList< Warlock >();

	public Research( int levelOfWarlock1 ) {
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(0);
		this.setLevelOfWarlock3(0);
		this.setLevelOfWarlock4(0);
		this.setLevelOfWarlock5(0);
		this.setLevelOfWarlock6(0);
		this.setLevelOfWarlock7(0);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2 ) {
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(0);
		this.setLevelOfWarlock4(0);
		this.setLevelOfWarlock5(0);
		this.setLevelOfWarlock6(0);
		this.setLevelOfWarlock7(0);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3 ) {
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(levelOfWarlock3);
		this.setLevelOfWarlock4(0);
		this.setLevelOfWarlock5(0);
		this.setLevelOfWarlock6(0);
		this.setLevelOfWarlock7(0);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
		Warlock warlock3 = new Warlock( 3, "Warlock", levelOfWarlock3 );
		warlockList.add( warlock3 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3, int levelOfWarlock4 ) {
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(levelOfWarlock3);
		this.setLevelOfWarlock4(levelOfWarlock4);
		this.setLevelOfWarlock5(0);
		this.setLevelOfWarlock6(0);
		this.setLevelOfWarlock7(0);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
		Warlock warlock3 = new Warlock( 3, "Warlock", levelOfWarlock3 );
		warlockList.add( warlock3 );
		Warlock warlock4 = new Warlock( 4, "Warlock", levelOfWarlock4 );
		warlockList.add( warlock4 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3, int levelOfWarlock4, int levelOfWarlock5 ) {
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(levelOfWarlock3);
		this.setLevelOfWarlock4(levelOfWarlock4);
		this.setLevelOfWarlock5(levelOfWarlock5);
		this.setLevelOfWarlock6(0);
		this.setLevelOfWarlock7(0);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
		Warlock warlock3 = new Warlock( 3, "Warlock", levelOfWarlock3 );
		warlockList.add( warlock3 );
		Warlock warlock4 = new Warlock( 4, "Warlock", levelOfWarlock4 );
		warlockList.add( warlock4 );
		Warlock warlock5 = new Warlock( 5, "Warlock", levelOfWarlock5 );
		warlockList.add( warlock5 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3, int levelOfWarlock4, int levelOfWarlock5, int levelOfWarlock6 ) {
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(levelOfWarlock3);
		this.setLevelOfWarlock4(levelOfWarlock4);
		this.setLevelOfWarlock5(levelOfWarlock5);
		this.setLevelOfWarlock6(levelOfWarlock6);
		this.setLevelOfWarlock7(0);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
		Warlock warlock3 = new Warlock( 3, "Warlock", levelOfWarlock3 );
		warlockList.add( warlock3 );
		Warlock warlock4 = new Warlock( 4, "Warlock", levelOfWarlock4 );
		warlockList.add( warlock4 );
		Warlock warlock5 = new Warlock( 5, "Warlock", levelOfWarlock5 );
		warlockList.add( warlock5 );
		Warlock warlock6 = new Warlock( 6, "Warlock", levelOfWarlock6 );
		warlockList.add( warlock6 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3, int levelOfWarlock4, int levelOfWarlock5, int levelOfWarlock6,
			int levelOfWarlock7 ) {
		
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(levelOfWarlock3);
		this.setLevelOfWarlock4(levelOfWarlock4);
		this.setLevelOfWarlock5(levelOfWarlock5);
		this.setLevelOfWarlock6(levelOfWarlock6);
		this.setLevelOfWarlock7(levelOfWarlock7);
		this.setLevelOfWarlock8(0);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
		Warlock warlock3 = new Warlock( 3, "Warlock", levelOfWarlock3 );
		warlockList.add( warlock3 );
		Warlock warlock4 = new Warlock( 4, "Warlock", levelOfWarlock4 );
		warlockList.add( warlock4 );
		Warlock warlock5 = new Warlock( 5, "Warlock", levelOfWarlock5 );
		warlockList.add( warlock5 );
		Warlock warlock6 = new Warlock( 6, "Warlock", levelOfWarlock6 );
		warlockList.add( warlock6 );
		Warlock warlock7 = new Warlock( 7, "Warlock", levelOfWarlock7 );
		warlockList.add( warlock7 );
	}
	public Research( int levelOfWarlock1, int levelOfWarlock2, int levelOfWarlock3, int levelOfWarlock4, int levelOfWarlock5, int levelOfWarlock6,
			int levelOfWarlock7, int levelOfWarlock8 ) {
		
		this.setLevelOfWarlock1(levelOfWarlock1);
		this.setLevelOfWarlock2(levelOfWarlock2);
		this.setLevelOfWarlock3(levelOfWarlock3);
		this.setLevelOfWarlock4(levelOfWarlock4);
		this.setLevelOfWarlock5(levelOfWarlock5);
		this.setLevelOfWarlock6(levelOfWarlock6);
		this.setLevelOfWarlock7(levelOfWarlock7);
		this.setLevelOfWarlock8(levelOfWarlock8);
		Warlock warlock1 = new Warlock( 1, "Warlock", levelOfWarlock1 );
		warlockList.add( warlock1 );
		Warlock warlock2 = new Warlock( 2, "Warlock", levelOfWarlock2 );
		warlockList.add( warlock2 );
		Warlock warlock3 = new Warlock( 3, "Warlock", levelOfWarlock3 );
		warlockList.add( warlock3 );
		Warlock warlock4 = new Warlock( 4, "Warlock", levelOfWarlock4 );
		warlockList.add( warlock4 );
		Warlock warlock5 = new Warlock( 5, "Warlock", levelOfWarlock5 );
		warlockList.add( warlock5 );
		Warlock warlock6 = new Warlock( 6, "Warlock", levelOfWarlock6 );
		warlockList.add( warlock6 );
		Warlock warlock7 = new Warlock( 7, "Warlock", levelOfWarlock7 );
		warlockList.add( warlock7 );
		Warlock warlock8 = new Warlock( 8, "Warlock", levelOfWarlock8 );
		warlockList.add( warlock8 );
	}
	
	public int getSummaryResearch() {
		for( int i = 0; i < warlockList.size(); i++ ) {
			warlock = ( Warlock )warlockList.get( i );
			summaryResearch += warlock.getBaseResearch();
		}
		return summaryResearch;
	}
	
	public int getLevelOfWarlock6() {
		return levelOfWarlock6;
	}
	public void setLevelOfWarlock6( int levelOfWarlock6 ) {
		this.levelOfWarlock6 = levelOfWarlock6;
	}
	public int getLevelOfWarlock1() {
		return levelOfWarlock1;
	}
	public void setLevelOfWarlock1( int levelOfWarlock1 ) {
		this.levelOfWarlock1 = levelOfWarlock1;
	}
	public int getLevelOfWarlock5() {
		return levelOfWarlock5;
	}
	public void setLevelOfWarlock5( int levelOfWarlock5 ) {
		this.levelOfWarlock5 = levelOfWarlock5;
	}
	public int getLevelOfWarlock3() {
		return levelOfWarlock3;
	}
	public void setLevelOfWarlock3( int levelOfWarlock3 ) {
		this.levelOfWarlock3 = levelOfWarlock3;
	}
	public int getLevelOfWarlock2() {
		return levelOfWarlock2;
	}
	public void setLevelOfWarlock2( int levelOfWarlock2 ) {
		this.levelOfWarlock2 = levelOfWarlock2;
	}
	public int getLevelOfWarlock7() {
		return levelOfWarlock7;
	}
	public void setLevelOfWarlock7( int levelOfWarlock7 ) {
		this.levelOfWarlock7 = levelOfWarlock7;
	}
	public int getLevelOfWarlock8() {
		return levelOfWarlock8;
	}
	public void setLevelOfWarlock8( int levelOfWarlock8 ) {
		this.levelOfWarlock8 = levelOfWarlock8;
	}
	public int getLevelOfWarlock4() {
		return levelOfWarlock4;
	}
	public void setLevelOfWarlock4( int levelOfWarlock4 ) {
		this.levelOfWarlock4 = levelOfWarlock4;
	}
}
