package pwir_l_07_08d.model.gui;
import pwir_l_07_08d.controller.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CompanyStatusFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static JPanel panel = null;  
	private static Company company = null;	
    
    public CompanyStatusFrame( String nameOfCompany, int carsValue, int delivererValue ) throws IOException {
    	setDetails( nameOfCompany, carsValue, delivererValue );
        company.carsGoToWork();
	}
    
    private static JLabel getJLabel( String description ) {
    	JLabel label = new JLabel( description.toUpperCase() );
    	Font f = label.getFont();
    	label.setFont( new Font( f.getFontName(), f.getStyle(), 15 ) );
    	label.setForeground( Color.WHITE );
    	return label;
	}
    private void setCompany( Company typeCompany ) {
    	setForeground( Color.WHITE );
    	company = typeCompany;
    }
    private static JScrollPane getJScrollPane( int carsValue ) {
    	return new JScrollPane( getSetsToMainPanel( carsValue ) );
    }
    private static void setPanelDetails( JPanel panel ) {
    	panel.setBackground( Color.BLACK );
        panel.setSize( new Dimension( 100, 30 ) );
        panel.setPreferredSize( new Dimension( 100, 30 ) );
        panel.setMaximumSize( new Dimension( 100, 30 ) );
        panel.setMinimumSize( new Dimension( 100, 30 ) );       
        panel.setLayout( new GridLayout( 1, 3 ) );
        panel.setEnabled( true );
    }
    private static JPanel getTitleInformationsPanel() {
        JPanel panel = new JPanel();
        setPanelDetails( panel );
        panel.add( getJLabel( "     Pojazd" ) );
        panel.add( getJLabel( "     Dostawca" ) );
        panel.add( getJLabel( "     Miejsce dostawy" ) );
        panel.add( getJLabel( "     Status" ) );
        return panel;
    }
    private static JPanel getSetsToMainPanel( int carsValue ) {
    	panel = new JPanel();
        panel.add( getTitleInformationsPanel() );
        if( carsValue != 0 ) {
            panel.setLayout( new GridLayout( carsValue + 1, 1 ) );
        }
        return panel;
    }
    private void setVehicleStatusPanels( List< Car > carList ) {
        for( Car car: carList ) {
            panel.add( new CarPanel( car ) );
        }
    }
    private void setDetails( String nameOfCompany, int carsValue, int delivererValue ) throws IOException {
    	setCompany( new Company( nameOfCompany, carsValue, delivererValue ) );
    	setTitle( company.getNameOfCompany().toUpperCase().toString() );
    	setBounds( 140, 15, 1000, 700 );
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	add( getJScrollPane( carsValue ) );
        setVehicleStatusPanels( company.getCarThreadList() );
    }
}