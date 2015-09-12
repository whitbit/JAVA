package pwir_l_07_08d.view;
import java.awt.EventQueue;

import pwir_l_07_08d.model.gui.CompanyStatusFrame;

/*
 * W RAZIE PROBLEMÓW Z DZIA£ANIEM( NP. BRAK DANYCH AUT, KIEROWCÓW )
 * 
 * IMIONA, NAZWISKA I NAZWY AUT GENEROWANE S¥ Z PLIKÓW W PACZCE:
 * - pwir_l_05_06d.model.dataFromFiles.*
 * 
 * Nale¿y w klasach:
 * - .CarName, .Name, .Surname
 * zmieniæ œcie¿kê dostêpu do plików:
 * - .carNames, .namesFemale, .namesMale, .surnamesFemale, .surnamesMale 
*/

public class StartupGUI {
	private final static String labName = "PWiR Lab.07-08";
	private final static String labAuthor = "Mateusz Mucha 201 IDZ_B";
	private final static String nameOfCompany = "[ " + labName + " - Firma Transportowa, wykonal " + labAuthor + " ]\n";
	private final static int carsValue = 20;
    private final static int delivererValue = 80;
    
    public static void main( String[] args ) {
    	EventQueue.invokeLater( new Runnable() {
    		public void run() {
    			try {
    				CompanyStatusFrame companyStatusFrame = new CompanyStatusFrame( nameOfCompany, carsValue, delivererValue );
    				companyStatusFrame.setVisible( true );
                } catch( Exception e ) {
                    System.err.println( e );
                }
            }
        } );
    }
}
