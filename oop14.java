//funtionality to buttons
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class TestFrame4 extends Frame implements ActionListener{

    TextField txt1;
    TextField txt2;
    Button bt;
    Label l1;

    TestFrame4(String str){

        super(str);
        setSize(800,600);
        setBackground(Color.decode("#B83030"));
        setForeground(Color.WHITE);
        setVisible(true);
        setLayout(new FlowLayout());
        
        txt1= new TextField(10);
        txt1.setForeground(Color.BLACK);

        txt2 = new TextField(10);
        txt2.setForeground(Color.BLACK);

        bt= new Button ("ADD");
        bt.setForeground(Color.BLACK);
        l1=new Label();

        add(txt1);
        add(txt2);
        add(bt);
        add(l1);
        bt.addActionListener(this);

    }
    public void actionPerformed (ActionEvent e){
        String str1 = txt1.getText();
        String str2 = txt2.getText();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int num3 = num1 + num2;

        l1.setText(Integer.toString(num3));
    }
}
public class oop14{
    public static void main (String ar[]){
        TestFrame4 f= new TestFrame4("Adder");
        System.out.println (f);
    }
}