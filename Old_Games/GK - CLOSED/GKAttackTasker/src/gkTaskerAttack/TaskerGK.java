package gkTaskerAttack;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaskerGK extends JFrame implements MouseListener, MouseMotionListener, ActionListener {
	private JTextField tekstFieldX = new JTextField();
	private JTextField tekstFieldY = new JTextField();
	private JLabel textLabelX = new JLabel();
	private JLabel textLabelY = new JLabel();
	private JButton buttonStartTasker = new JButton( "START" );
	private Font font = new Font( "Arial Black", Font.BOLD, 10 );
	private int positionX = 0;
	private int positionY = 0;
	TaskerGK() {
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setSize( 265, 75 ); 
		setLocation( 300, 300 );
		setResizable( false );
		textLabelX.setText( "X: " + tekstFieldX );
		textLabelX.setBounds( 5, 5, 37, 25 );
		add( textLabelX );
		textLabelY.setText( "X: " + tekstFieldX );
		textLabelY.setBounds( 44, 5, 37, 25 );
		add( textLabelY );
		tekstFieldX.setBounds( 81, 5, 37, 25 );
		add( tekstFieldX );
		tekstFieldY.setBounds( 118, 5, 40, 25 );
		add( tekstFieldY );
		buttonStartTasker.setBounds( 156, 5, 95, 25 );
		buttonStartTasker.setFont( font );
		buttonStartTasker.addActionListener( this );
		add( buttonStartTasker );
		addMouseListener( this );
		addMouseMotionListener( this );
		setLayout( null );
		setVisible( true );
	}

	public static void main( String[] args ) {
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				new TaskerGK();
			}
		});
	}
	public void taskerRun() {
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved( MouseEvent arg0 ) {
		this.positionX = arg0.getX();
		this.positionY = arg0.getY();
		System.out.println( "X: " );
		this.textLabelX.setText( Integer.toString( positionX ) );
		System.out.println( "X: " );
		this.textLabelY.setText( Integer.toString( positionY ) );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited( MouseEvent e ) {
		this.positionX = e.getX();
		this.positionY = e.getY();
		System.out.println( "X: " );
		this.textLabelX.setText( Integer.toString( positionX ) );
		System.out.println( "X: " );
		this.textLabelY.setText( Integer.toString( positionY ) );
	}

	@Override
	public void mousePressed( MouseEvent e ) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed( ActionEvent arg0 ) {
		Object source = arg0.getSource();
		if( source == buttonStartTasker ) {
			System.out.println( "X: " );
			this.textLabelX.setText( Integer.toString( positionX ) );
			System.out.println( "X: " );
			this.textLabelY.setText( Integer.toString( positionY ) );
		}
		
	}
}
