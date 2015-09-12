package gkTaskerAttack;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseTestPanel extends JPanel implements MouseListener, MouseMotionListener {
	private int positionX = 0;
	private int positionY = 0;
	public MouseTestPanel() {
		addMouseListener( this );
		addMouseMotionListener( this );
	}

	@Override
	public void mouseDragged( MouseEvent arg0 ) {
		System.out.println( "mouseDragged" );
	}

	@Override
	public void mouseMoved( MouseEvent arg0 ) {
		this.positionX = arg0.getX();
		this.positionY = arg0.getY();
		System.out.println( "11X: " + positionX + "  Y: " + positionY );
	}

	@Override
	public void mouseClicked( MouseEvent e ) {
		this.positionX = e.getX();
		this.positionY = e.getY();
		System.out.println( "X: " + positionX + "  Y: " + positionY );
	}

	@Override
	public void mouseEntered( MouseEvent e ) {
		this.positionX = e.getX();
		this.positionY = e.getY();
		System.out.println( "X: " + positionX + "  Y: " + positionY );
	}

	@Override
	public void mouseExited( MouseEvent e ) {
		this.positionX = e.getX();
		this.positionY = e.getY();
		System.out.println( "X: " + positionX + "  Y: " + positionY );
	}

	@Override
	public void mousePressed( MouseEvent e ) {
		this.positionX = e.getX();
		this.positionY = e.getY();
		System.out.println( "X: " + positionX + "  Y: " + positionY );
	}

	@Override
	public void mouseReleased( MouseEvent e ) {
		System.out.println( "mouseReleased" );
	}

}
