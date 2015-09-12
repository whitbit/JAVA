package pwir_l_07_08d.model.gui;
import pwir_l_07_08d.controller.Car;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public CarPanel( Car car ) {
		setPanelDetails( this ); 
		setDetails( car );
    }
	
	private static void setFonstToPanel( JLabel label ) {
    	Font f = label.getFont();
    	label.setFont( new Font( f.getFontName(), f.getStyle(), 15 ) );
    	label.setForeground( Color.WHITE );
    }
	private static void setPanelDetails( JPanel panel ) {
		panel.setBackground( Color.DARK_GRAY );
        panel.setSize( new Dimension( 100, 30 ) );
        panel.setPreferredSize( new Dimension( 100, 30 ) );
        panel.setMaximumSize( new Dimension( 100, 30 ) );
        panel.setMinimumSize( new Dimension( 100, 30 ) );       
        panel.setLayout( new GridLayout( 1, 3 ) );
        panel.setEnabled( true );
    }
	private void setDetails( Car car ) {
		JLabel carName = new JLabel( ( car.getCarID() + 1 ) + "] " + car.getNameOfCar() );
		setFonstToPanel( carName );
		carName.setForeground( Color.yellow.darker() );
        add( carName);
        JLabel deliverer = new JLabel( "" );
        setFonstToPanel( deliverer );
        add( deliverer );
        JLabel customer = new JLabel( "" );
        setFonstToPanel( customer );
        add( customer );
        JLabel status = new JLabel( "" );
        setFonstToPanel( status );
        add( status );
        car.setStatusDeliverer( deliverer );
        car.setStatusCustomer( customer );
        car.setStatus( status );
    }
}
