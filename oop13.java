import java.awt.*;

class TestFrame3 extends Frame{
    TestFrame3(String title){
        
        super(title);
        setSize(600, 400);
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        setLayout(new FlowLayout());

        Label lb1 = new Label("Welcome");

        Button bt = new Button("Submit");
        bt.setForeground(Color.BLACK);

        TextField txt = new TextField("Enter your name",40);
        txt.setForeground(Color.BLACK);
        //radio buttons, check boxes & drop boxes can also be used


        add(lb1);
        add(bt);
        add(txt);

        setVisible(true);
    }
}

public class oop13 {
    public static void main(String[] args) {
        TestFrame3 t = new TestFrame3("Welcome");
        System.out.println (t);
    }
}
