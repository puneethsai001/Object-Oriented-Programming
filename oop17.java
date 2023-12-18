import java.awt.*;
import java.awt.event.*;

class TestFrame7 extends Frame implements ItemListener{
    TextField txt;
    Choice c;
    
    TestFrame7(String str) {
        super(str);
        setSize(800, 600);
        setBackground(Color.decode("#0F4274"));
        setForeground(Color.WHITE);
        setVisible(true);
        setLayout(new FlowLayout());
        
        txt = new TextField("Not selected", 30);
        txt.setForeground(Color.BLACK);
        add(txt);
        
        c = new Choice();
        c.setForeground(Color.BLACK);
        String options[] = {"Abu Dhabi", "Dubai", "Sharjah","Ajman",
        "Umm Al Quwain","Ras Al Khaimah","Fujairah"};

        for (String s : options) {
            c.add(s);
        }

        c.addItemListener(this);
        add(c);
    }
    
    public void itemStateChanged(ItemEvent e) {
        txt.setText(c.getSelectedItem());
    }
}

public class oop17 {
    public static void main(String[] args) {
        TestFrame7 f = new TestFrame7("Emirares");
        System.out.println(f);
    }
}