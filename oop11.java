import java.awt.*;

class TestFrame1 extends Frame{
    TestFrame1(String title){
        super(title);
        setSize(600, 400);
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
        setVisible(true);
    }

    public void paint(Graphics e) {
        e.drawString("Dubai", 100, 150);
    }
}

public class oop11 {
    public static void main(String[] args) {
        TestFrame1 t = new TestFrame1("Welcome");
        System.out.println (t);
    }
}
