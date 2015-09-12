package pwir_l_03_04d.view;
import pwir_l_03_04d.controller.MuseumOpen;

public class Startup {
	public static void main( String[] args ) throws Exception {
		MuseumOpen museumOpen = new MuseumOpen( 16, 1000, 2000, 30000 );
		museumOpen.museumOpen();
	}
}