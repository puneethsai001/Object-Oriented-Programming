import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class TestFrame6 extends Frame implements ItemListener{
    TextField txt;
    Checkbox chk;

    TestFrame6(String title){
        
        super(title);
        setSize(600, 400);
        setBackground(Color.decode("#0F4274"));
        setForeground(Color.WHITE);
        setLayout(new FlowLayout());

        txt = new TextField("Not Married");
        txt.setForeground(Color.BLACK);

        chk = new Checkbox("Married");
        chk.addItemListener(this);

        add(txt);
        add(chk);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){
        int state = e.getStateChange();
            if (state == 1)
                txt.setText("Married");
            else
                txt.setText("Unmarried");
    }
}

public class oop16 {
    public static void main(String[] args) {
        TestFrame6 t = new TestFrame6("Marriage Program");
        System.out.println (t);
    }
}