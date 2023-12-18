import java.awt.*;

class TestFrame8 extends Frame{
    
    TestFrame8(String str) {
        super(str);
        setSize(800, 600);
        setBackground(Color.decode("#0F4274"));
        setForeground(Color.BLACK);
        setVisible(true);

        MenuBar mybar = new MenuBar();
        Menu mymenu = new Menu("File");
        MenuItem i1 = new MenuItem("Open");
        MenuItem i2 = new MenuItem("Close");
        MenuItem i3 = new MenuItem("Save");
        MenuItem i4 = new MenuItem("Save As");

        mymenu.add(i1);
        mymenu.add(i2);
        mymenu.add(i3);
        mymenu.add(i4);

        mybar.add(mymenu);
        setMenuBar(mybar);
    }
}

public class oop18 {
    public static void main(String[] args) {
        TestFrame8 f = new TestFrame8("Menu Bar");
        System.out.println(f);
    }
}
