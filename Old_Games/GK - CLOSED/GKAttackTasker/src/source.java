import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class source {
	public static void main( String[] args ) {
		JFrame frame = new JFrame( "Program Okienkowy - Testowy" );//utworzenie ramki z tytulem
		frame.setSize( 550, 350  ); //rozmiar dlugoscXwysokosc
		frame.setLocation( 300, 300 );//polozenie od lewego gornego rogu
		frame.setResizable( false );//false - nie mozna zmieniac rozmiaru okna( strzalkami )
		frame.setLayout( null );//widoczne pola na tle
		
		JTextField tekstField = new JTextField();//pole tekstowe
		tekstField.setBounds( 10, 10, 230, 50 );// lokalizacja pola tekstowego i rozmiar
		Font font = new Font( "Times New Roman", Font.BOLD, 14 );//utworzenie czcionki w polu tekstowym
		tekstField.setFont( font );//ustawienie czcionki w polu tekstowym
		tekstField.setText( "Pole tekstowe - testowe" );//ustawienie poczatkowego tekstu w polu tekstowym
		frame.add( tekstField );//dodanie pola tekstowego do ramki
		
		JButton button = new JButton( "Testowy Przycisk" );//tworzenie przycisku o tytule
		button.setBounds( 300, 10, 230, 50 );//lokalziacja i rozmiar buttonu
		button.setBorder( null );//null - wtopiony w tlo
		button.addActionListener( new ActionListener() { //funkcja dodaje AKCJE do przycisku
			public void actionPerformed( ActionEvent arg0 ) {//implementowana metoda
				int standardValue = 976;
				tekstField.setText( "Tekst po nacisnieciu przycisku: " + standardValue );//zwykly test
			}
			
		} );
		frame.add( button );//dodanie buttony do ramki
		
		frame.setVisible( true ); //widocznosc
	}
	public int testFunction() {
		return 1992;
	}
}
