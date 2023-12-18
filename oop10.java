import java.awt.*;

class Myframe extends Frame{
    Myframe(String title){
        super(title);
        setSize(600, 400);
        setBackground(Color.BLUE);
        setForeground(Color.BLACK);
        setVisible(true);
    }
}
public class oop10 {
    public static void main(String[] args) {
        Myframe f = new Myframe("Section B");
        System.out.println (f);
    }
}
