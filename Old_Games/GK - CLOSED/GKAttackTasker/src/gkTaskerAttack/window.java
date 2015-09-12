package gkTaskerAttack;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.MouseInfo;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class window {
	 
    JFrame okno;
    TextField tf1, tf2, tf3;
    TextArea ta[]= new TextArea[8];
    Button b1;
    Label l1;
    int x,y;
    Panel panel;
 
    window(){
 
 
        okno = new JFrame();
        okno.setSize(500,500);
        okno.setLocation(200,200);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        panel= new Panel();
        okno.add(panel);
        panel.setLayout(new GridLayout (4,1));
 
        Panel pan1= new Panel();
        Panel pan2= new Panel();
        Panel pan3= new Panel();
        pan3.setLayout(new GridLayout(2,4));
        Panel pan4= new Panel();
 
        tf1= new TextField(4);
        tf2= new TextField(4);
        tf3= new TextField(8);
        b1= new Button("OK");
        l1= new Label("Na ksiê¿ycu wa¿ysz:");
 
        for(int i=0; i<8; i++)
        {
                ta[i]=new TextArea(1,30);
                pan3.add(ta[i]);
        }
 
        pan1.add(tf1);
        pan1.add(b1);
        pan2.add(l1);
        pan2.add(tf2);
        pan4.add(tf3);
 
 
        panel.add(pan1);
        panel.add(pan2);
        panel.add(pan3);
        panel.add(pan4);
 
        okno.setVisible(true);
 
 
        MouseAdapter mysz = new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                double x;
                x=Double.valueOf(tf1.getText());
                x=x/3;
                tf2.setText(String.valueOf(x));
            }
        };
 
 
        MouseAdapter mysz2 = new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                for(int i=0; i<8; i++)
                {   if(e.getSource()==ta[i])
                    ta[i].setText("Wjecha³eœ");
                }
            }
 
            public void mouseExited(MouseEvent e){
                for(int i=0; i<8; i++)
                {   if(e.getSource()==ta[i])
                    ta[i].setText("Wyjecha³eœ");
                }
            }
        };
 
        MouseAdapter mysz3 = new MouseAdapter(){
 
            public void mouseMoved(MouseEvent e){
                x= e.getY();
                y= e.getX();
                tf3.setText("x: " + String.valueOf(x) + "  y: " + String.valueOf(y));
            }
 
            public void mouseDragged(MouseEvent e){
                x= MouseInfo.getPointerInfo().getLocation().x;
                y= MouseInfo.getPointerInfo().getLocation().y;
                tf3.setText("x: " + String.valueOf(x) + "  y: " + String.valueOf(y));
            }
        };
 
        b1.addMouseListener(mysz);
 
        for (int i = 0; i < 8; i++)
        {
        ta[i].addMouseListener(mysz2);
        ta[i].addMouseMotionListener(mysz3);
        }
 
        panel.addMouseListener(mysz3);
       
 
    }
 
}
