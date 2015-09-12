package pwir_l_02d.controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import pwir_l_02d.model.*;

public class StartupFrame extends JFrame {
	public StartupFrame( String nameOfFrame ) {
		super( nameOfFrame );
		setSize( 850, 250  ); 
		setLocation( 300, 300 );			
		setResizable( false );
		setLayout( null );
		Font firstFont = new Font( "Times New Roman", Font.BOLD, 16 );
		Font secondFont = new Font( "Times New Roman", Font.CENTER_BASELINE, 12 );
		Font thirdFont = new Font( "Times New Roman", Font.ITALIC, 14 );
		JLabel firstLabel = new JLabel( "PWiR - Laboratorium II" );
		JLabel secondLabel = new JLabel( "_____________________" );
		JLabel howManyIntegersLabel = new JLabel( "Ilosc liczb calkowitych ( integer ):" );
		JLabel threadNameLabel = new JLabel( "Nazwa Watku" );
		JLabel timeToSleepLabel = new JLabel( "Czas losowania" );
		JTextField howManyIntegersField = new JTextField();
		JTextField firstNameField = new JTextField( "| Thread: 1 |" );
		JTextField firstTimeField = new JTextField( "2" );
		JTextField secondNameField = new JTextField( "| Thread: 2 |" );
		JTextField secondTimeField = new JTextField( "2" );
		JTextField thirdNameField = new JTextField( "| Thread: 3 |" );
		JTextField thirdTimeField = new JTextField( "3" );
		JTextArea logsField = new JTextArea();
		JButton firstButton = new JButton( "START" ); 	
		firstLabel.setBounds( 5, 5, 200, 20 );
		firstLabel.setFont( firstFont );
		secondLabel.setBounds( 5, 5, 180, 20 );
		secondLabel.setFont( firstFont );
		howManyIntegersLabel.setBounds( 10, 30, 200, 30 );
		howManyIntegersLabel.setFont( secondFont );
		threadNameLabel.setBounds( 10, 55, 80, 20 );
		threadNameLabel.setFont( secondFont );
		timeToSleepLabel.setBounds( 140, 55, 90, 20 );
		timeToSleepLabel.setFont( secondFont );
		howManyIntegersField.setBounds( 190, 33, 50, 25 );
		howManyIntegersField.setFont( thirdFont );
		firstNameField.setBounds( 10, 72, 100, 25 );
		firstNameField.setFont( thirdFont );
		firstTimeField.setBounds( 140, 72, 100, 25 );
		firstTimeField.setFont( thirdFont );
		secondNameField.setBounds( 10, 98, 100, 25 );
		secondNameField.setFont( thirdFont );
		secondTimeField.setBounds( 140, 98, 100, 25 );
		secondTimeField.setFont( thirdFont );
		thirdNameField.setBounds( 10, 125, 100, 25 );
		thirdNameField.setFont( thirdFont );
		thirdTimeField.setBounds( 140, 125, 100, 25 );
		thirdTimeField.setFont( thirdFont );
		logsField.setBounds( 250, 5, 600, 210 );	
		firstButton.setBounds( 10, 160, 230, 50 );
		firstButton.setBorder( null );
		firstButton.addActionListener( new ActionListener() { 
			public void actionPerformed( ActionEvent arg0 ) {
				PrintStream printStream = new PrintStream( new StartupOutputStream( logsField ) );
				System.setOut( printStream );
				System.setErr( printStream );
				World world = new World( Integer.parseInt( howManyIntegersField.getText() ) );
				Thread firstThread = new Thread( new SetThread( firstNameField.getText(), world, Integer.parseInt( firstTimeField.getText() ) ) );
				firstThread.start();
				Thread secondThread = new Thread( new SetThread( secondNameField.getText(), world, Integer.parseInt( secondTimeField.getText() ) ) );
				secondThread.start();
				Thread thirdThread = new Thread( new GetThread( thirdNameField.getText(), world, Integer.parseInt( thirdTimeField.getText() ) ) );
				thirdThread.start();
			}	
		} );
		add( firstLabel );
		add( secondLabel );
		add( howManyIntegersLabel );
		add( threadNameLabel );
		add( timeToSleepLabel );
		add( howManyIntegersField );
		add( firstNameField );
		add( firstTimeField );
		add( secondNameField );
		add( secondTimeField );
		add( thirdNameField );
		add( thirdTimeField );
		add( logsField );
		add( firstButton );
		setVisible( true ); 
	}	
}
