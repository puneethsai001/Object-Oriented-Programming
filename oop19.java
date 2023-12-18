import java.awt.*;
import java.awt.event.*;

class TestFrame9 extends Frame implements ActionListener{
    Button bt;
    Label lb1;
    Label lb2;
    Dialog dg;

    TestFrame9(String str){
        super(str);
        setSize(800, 600);
        setBackground(Color.decode("#096c75"));
        setForeground(Color.WHITE);
        setVisible(true);
        setLayout(new FlowLayout());

        Frame f1 = new Frame();
        dg = new Dialog(f1, "Dialog Box");

        dg.setSize(200, 200);
        dg.setBackground(Color.WHITE);
        dg.setForeground(Color.BLACK);
        dg.setVisible(false);
        dg.setLayout(new FlowLayout());

        lb2 = new Label("Click to continue");
        dg.add(lb2);

        lb1 = new Label("Click to open dialog box");
        lb1.setFont(new Font("Serif", Font.PLAIN, 20));
        add(lb1);

        bt = new Button("Click");
        bt.setForeground(Color.black);
        bt.setFont(new Font("Serif", Font.PLAIN, 20));
        add(bt);
        bt.addActionListener(this);
    }

    public void actionPerformed (ActionEvent e){
        dg.setVisible(true);
    }
}

public class oop19 {
    public static void main(String[] args) {
        TestFrame9 f = new TestFrame9("Dialog Box Window");
        System.out.println(f);
    }
}
