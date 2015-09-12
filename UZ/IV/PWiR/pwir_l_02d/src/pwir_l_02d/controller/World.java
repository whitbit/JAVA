package pwir_l_02d.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
	private List< Integer > arrayOfIntegers = null;
	private static Random integerGenerator = null;
	private int howManyIntegers = 0;		
	public World( int howManyIntegers ) {
		try {
			if( howManyIntegers < 0 || howManyIntegers > Integer.MAX_VALUE ) {
				throw new Exception( "Too much for Integer !" );
			} else {
				this.howManyIntegers = howManyIntegers;
				arrayOfIntegers = new ArrayList< Integer >();
				integerGenerator = new Random();
			}
		} catch( Exception e ) {
			System.out.println( "ErrorLog: " + e.getMessage() );
		}
	}
	public synchronized void setInteger( String nameOfThread ) {
		int intValueGenerate = integerGenerator.nextInt( Integer.MAX_VALUE );
		arrayOfIntegers.lastIndexOf( arrayOfIntegers.add( intValueGenerate ) );
		System.out.println( "Setting value of Integer to collection: " + "[ " + intValueGenerate + " ] to index: " + 
							arrayOfIntegers.lastIndexOf( intValueGenerate ) + ". From Thread ==>  " + nameOfThread );
	}
	public int getHowManyIntegers() {
		return howManyIntegers;
	}
	public synchronized List< Integer > getArrayOfIntegers() {
		return arrayOfIntegers;
	} 
}