import java.awt.*;
import java.awt.event.*;

class TestFrame5 extends Frame implements MouseListener, MouseMotionListener{
    TextField txt1;
    TextField txt2;
    TextField txt3;
    
    TestFrame5(String str) {
        super(str);
        setSize(800, 600);
        setBackground(Color.decode("#B83030"));
        setForeground(Color.WHITE);
        setVisible(true);
        setLayout(new FlowLayout());
        
        txt1 = new TextField(40);
        txt1.setForeground(Color.BLACK);

        txt2 = new TextField(10);
        txt2.setForeground(Color.BLACK);

        txt3 = new TextField(10);
        txt3.setForeground(Color.BLACK);

        addMouseListener(this);
        addMouseMotionListener(this);
        
        add(txt1);
        add(txt2);
        add(txt3);
    }
    
    public void mouseEntered(MouseEvent e) {
        txt1.setText("Mouse Entered");
    }
    
    public void mouseExited(MouseEvent e) {
        txt1.setText("Mouse Exited");
    }
    
    public void mouseClicked(MouseEvent e) {
        txt1.setText("Mouse Clicked");
    }
    
    public void mouseReleased(MouseEvent e) {
        txt1.setText("Mouse Released");
    }
    
    public void mousePressed(MouseEvent e) {
        txt1.setText("Mouse Pressed");
        txt2.setText(""+e.getX());
        txt3.setText(""+e.getY());
    }
    
    public void mouseMoved(MouseEvent e) {
        txt1.setText("Mouse Moving");
    }
    
    public void mouseDragged(MouseEvent e) {
        txt1.setText("Mouse dragged");
    }
}

public class oop15 {
    public static void main(String[] args) {
        TestFrame5 f = new TestFrame5("Mouse Events");
        System.out.println(f);
    }
}