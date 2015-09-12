package gkTaskerAttack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tasker extends JFrame implements Runnable {
	private JTextField tekstField = new JTextField();
	public void run() {
		setTaskerFrame();
		System.out.println( "lol" );
	}
	public void setTaskerFrame() {
		setTitle( "GoblinKeeper Attacks - Tasker" );
		setSize( 100, 100 ); 
		setLocation( 300, 300 );
		setResizable( false );
		setLayout( null );
		JLabel description = new JLabel( "How many attacks?" );
		this.tekstField.setBounds( 10, 25, 115, 35 );
		description.setBounds( 10, 5, 115, 15 );
		add( description );
		add( tekstField );
		setVisible( true );
	}
	public String getTekstField() {
		return tekstField.getText();
	}
}
