import java.awt.*;

class TestFrame2 extends Frame{
    TestFrame2(String title){
        super(title);
        setSize(600, 400);
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
        setVisible(true);
    }

    public void paint(Graphics e) {
        e.drawString("Hello World", 400, 250);
        e.drawLine(200, 200, 300, 300);
        e.drawRect(50, 60, 50, 20); 
        e.drawRoundRect(50, 90, 50, 20, 10, 10); 
        e.fillRect(50, 120, 50, 20); 
        e.fillRoundRect(50, 150, 50, 20, 10, 10);
    }
}

public class oop12 {
    public static void main(String[] args) {
        TestFrame2 t = new TestFrame2("Welcome");
        System.out.println (t);
    }
}
