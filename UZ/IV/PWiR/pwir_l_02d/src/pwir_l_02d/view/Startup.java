package pwir_l_02d.view;
import javax.swing.JFrame;

import pwir_l_02d.controller.StartupFrame;
import pwir_l_02d.controller.World;
import pwir_l_02d.model.GetThread;
import pwir_l_02d.model.SetThread;

public class Startup {
	/*private static final int firstTimeToSleep = 2;
	private static final int secondTimeToSleep = 3;
	private static final int howManyIntegers = 5;*/
	public static void main( String[] args ) throws Exception {
		/*World world = new World( howManyIntegers );
		Thread firstThread = new Thread( new SetThread( "| Thread: 1 |", world, firstTimeToSleep ) );
		firstThread.start();
		Thread secondThread = new Thread( new SetThread( "| Thread: 2 |", world, firstTimeToSleep ) );
		secondThread.start();
		Thread thirdThread = new Thread( new GetThread( "| Thread: 3 |", world, secondTimeToSleep ) );
		thirdThread.start();*/
		JFrame startupFrame = new StartupFrame( "PWiR - Laboratorium II || 201 IDZ_B" );
	}
}