import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{

    JLabel firstLabel, lastLabel, emailLabel, phoneLabel;
    JTextField fname, lname, email, phone;
    JLabel programLabel, feeLabel, insLabel, insfeeLabel, staytype;
    JLabel areaLabel, transportfeeLabel, finalLabel;
    JComboBox program, areaBox, occBox;
    JRadioButton fourins, twelveins, twoins, oneins;
    JRadioButton hostel, transport;
    int tuitionfee, transportfee = 0, hostelfee = 0;

    MyFrame(){
        setTitle("MAHE Student Registration");
        setSize(600,600);

        getContentPane().setBackground(Color.darkGray);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        firstLabel = new JLabel("First Name");
        firstLabel.setForeground(Color.WHITE);
        firstLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        firstLabel.setBounds(20, 20, 80, 20);

        fname = new JTextField(40);
        fname.setForeground(Color.BLACK);
        fname.setFont(new Font("Arial", Font.PLAIN, 15));
        fname.setBounds(120, 20, 120, 20);

        lastLabel = new JLabel("Last Name");
        lastLabel.setForeground(Color.WHITE);
        lastLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        lastLabel.setBounds(20, 50, 80, 20);

        lname = new JTextField(40);
        lname.setForeground(Color.BLACK);
        lname.setFont(new Font("Arial", Font.PLAIN, 15));
        lname.setBounds(120, 50, 120, 20);

        emailLabel = new JLabel("Email ID");
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setBounds(20, 80, 80, 20);

        email = new JTextField(40);
        email.setForeground(Color.BLACK);
        email.setFont(new Font("Arial", Font.PLAIN, 15));
        email.setBounds(120, 80, 120, 20);

        phoneLabel = new JLabel("Mobile No");
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneLabel.setBounds(20, 110, 80, 20);

        phone = new JTextField(40);
        phone.setForeground(Color.BLACK);
        phone.setFont(new Font("Arial", Font.PLAIN, 15));
        phone.setBounds(120, 110, 120, 20);

        programLabel = new JLabel("Program");
        programLabel.setForeground(Color.WHITE);
        programLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        programLabel.setBounds(20, 140, 80, 20);

        String programs[] = {"B.Tech", "BBA", "B.Arch", "B.A"};

        program = new JComboBox<>(programs);
        program.setBounds(120, 140, 120, 20);
        feeLabel = new JLabel();
        program.addActionListener(this);

        insLabel = new JLabel("Choose the no of installments");
        insLabel.setForeground(Color.WHITE);
        insLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        insLabel.setBounds(20, 200, 200, 20);

        fourins = new JRadioButton("4");
        fourins.setForeground(Color.WHITE);
        fourins.setBackground(Color.darkGray);
        fourins.setFont(new Font("Arial", Font.PLAIN, 15));
        fourins.setBounds(20, 230, 50, 20);

        twelveins = new JRadioButton("12");
        twelveins.setForeground(Color.WHITE);
        twelveins.setBackground(Color.darkGray);
        twelveins.setFont(new Font("Arial", Font.PLAIN, 15));
        twelveins.setBounds(80, 230, 50, 20);

        twoins = new JRadioButton("2");
        twoins.setForeground(Color.WHITE);
        twoins.setBackground(Color.darkGray);
        twoins.setFont(new Font("Arial", Font.PLAIN, 15));
        twoins.setBounds(140, 230, 50, 20);

        oneins = new JRadioButton("1");
        oneins.setForeground(Color.WHITE);
        oneins.setBackground(Color.darkGray);
        oneins.setFont(new Font("Arial", Font.PLAIN, 15));
        oneins.setBounds(200, 230, 50, 20);

        insfeeLabel = new JLabel();

        fourins.addActionListener(this);
        twelveins.addActionListener(this);
        twoins.addActionListener(this);
        oneins.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(fourins);
        group.add(twelveins);
        group.add(oneins);
        group.add(twoins);

        staytype = new JLabel("Select one of the following");
        staytype.setForeground(Color.WHITE);
        staytype.setFont(new Font("Arial", Font.PLAIN, 15));
        staytype.setBounds(20, 290, 200, 20);
        
        hostel = new JRadioButton("Hostel");
        hostel.setForeground(Color.WHITE);
        hostel.setBackground(Color.darkGray);
        hostel.setFont(new Font("Arial", Font.PLAIN, 15));
        hostel.setBounds(20, 320, 100, 20);

        transport = new JRadioButton("Transport");
        transport.setForeground(Color.WHITE);
        transport.setBackground(Color.darkGray);
        transport.setFont(new Font("Arial", Font.PLAIN, 15));
        transport.setBounds(120, 320, 100, 20);

        ButtonGroup staygroup = new ButtonGroup();
        staygroup.add(hostel);
        staygroup.add(transport);
    
        areaLabel = new JLabel();

        String areas[] = {"Dubai", "Sharjah", "Ajman"};
        String occs[] = {"Single", "Double", "Triple"};

        areaBox = new JComboBox<>(areas);
        areaBox.setBounds(120, 350, 120, 20);
        areaBox.setVisible(false);

        transportfeeLabel = new JLabel();

        occBox = new JComboBox<>(occs);
        occBox.setBounds(200, 350, 120, 20);
        occBox.setVisible(false);
        
        hostel.addActionListener(this);
        transport.addActionListener(this);

        System.out.println(tuitionfee);
        System.out.println(hostelfee);
        System.out.println(transportfee);

        finalLabel = new JLabel();
        finalLabel.setForeground(Color.WHITE);
        finalLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        finalLabel.setBounds(20, 410, 300, 20);

        add(firstLabel);
        add(fname);

        add(lastLabel);
        add(lname);

        add(emailLabel);
        add(email);

        add(phoneLabel);
        add(phone);

        add(programLabel);
        add(program);
        add(feeLabel);

        add(insLabel);
        add(fourins);
        add(twelveins);
        add(twoins);
        add(oneins);

        add(insfeeLabel);

        add(staytype);
        add(hostel);
        add(transport);
        add(areaLabel);
        add(areaBox);
        add(transportfeeLabel);
        add(occBox);
        add(finalLabel);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == program){
            int index = program.getSelectedIndex();
            
            if (index == 0){
                tuitionfee = 50000;
                feeLabel.setText("Tuition Fee: 50,000 AED");
                feeLabel.setForeground(Color.WHITE);
                feeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                feeLabel.setBounds(20, 170, 250, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));

            }

            else if (index == 1){
                tuitionfee = 40000;
                feeLabel.setText("Tuition Fee: 40,000 AED");
                feeLabel.setForeground(Color.WHITE);
                feeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                feeLabel.setBounds(20, 170, 280, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));

            }

            else if (index == 2){
                tuitionfee = 45000;
                feeLabel.setText("Tuition Fee: 45,000 AED");
                feeLabel.setForeground(Color.WHITE);
                feeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                feeLabel.setBounds(20, 170, 250, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));
            }

            else if (index == 3){
                tuitionfee = 30000;
                feeLabel.setText("Tuition Fee: 30,000 AED");
                feeLabel.setForeground(Color.WHITE);
                feeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                feeLabel.setBounds(20, 170, 250, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));
            }
        }

        if (e.getSource() == fourins){
            insfeeLabel.setText(tuitionfee/4+" per installment");
            insfeeLabel.setForeground(Color.WHITE);
            insfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            insfeeLabel.setBounds(20, 260, 200, 20);

            
        }

        else if (e.getSource() == twoins){
            insfeeLabel.setText(tuitionfee/2+" AED per installment");
            insfeeLabel.setForeground(Color.WHITE);
            insfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            insfeeLabel.setBounds(20, 260, 200, 20);
        }

        else if (e.getSource() == oneins){
            insfeeLabel.setText(tuitionfee+" AED per installment");
            insfeeLabel.setForeground(Color.WHITE);
            insfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            insfeeLabel.setBounds(20, 260, 200, 20);
        }

        else if (e.getSource() == twelveins){
            insfeeLabel.setText(tuitionfee/12+" AED per installment");
            insfeeLabel.setForeground(Color.WHITE);
            insfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            insfeeLabel.setBounds(20, 260, 200, 20);
        }

        if (e.getSource() == transport){
            areaLabel.setText("Select Area");
            areaLabel.setForeground(Color.WHITE);
            areaLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            areaLabel.setBounds(20, 350, 200, 20);

            occBox.setVisible(false);
            areaBox.setVisible(true);
            areaBox.addActionListener(this);

        }

        else if (e.getSource() == hostel){
            areaLabel.setText("Select Occupancy");
            areaLabel.setForeground(Color.WHITE);
            areaLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            areaLabel.setBounds(20, 350, 200, 20);

            areaBox.setVisible(false);
            occBox.setVisible(true);
            occBox.addActionListener(this);
        }

        if (e.getSource() == areaBox){
            if (areaBox.getSelectedIndex() == 0){
                transportfee = 5000;
                transportfeeLabel.setText("Transport Fee: 5000 AED");
                transportfeeLabel.setForeground(Color.WHITE);
                transportfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                transportfeeLabel.setBounds(20, 380, 200, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));

            }

            else if (areaBox.getSelectedIndex() == 1){
                transportfee = 6000;
                transportfeeLabel.setText("Transport Fee: 6000 AED");
                transportfeeLabel.setForeground(Color.WHITE);
                transportfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                transportfeeLabel.setBounds(20, 380, 200, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));

            }

            else if (areaBox.getSelectedIndex() == 2){
                transportfee = 7000;
                transportfeeLabel.setText("Transport Fee: 7000 AED");
                transportfeeLabel.setForeground(Color.WHITE);
                transportfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                transportfeeLabel.setBounds(20, 380, 200, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));
            }
        }

        if (e.getSource() == occBox){
            if (occBox.getSelectedIndex() == 0){
                hostelfee = 35000;
                transportfeeLabel.setText("Hostel Fee: 35,000 AED");
                transportfeeLabel.setForeground(Color.WHITE);
                transportfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                transportfeeLabel.setBounds(20, 380, 200, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));

            }

            else if (occBox.getSelectedIndex() == 1){
                hostelfee = 28000;
                transportfeeLabel.setText("Hostel Fee: 28,000 AED");
                transportfeeLabel.setForeground(Color.WHITE);
                transportfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                transportfeeLabel.setBounds(20, 380, 200, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));
            }

            else if (occBox.getSelectedIndex() == 2){
                hostelfee = 25000;
                transportfeeLabel.setText("Hostel Fee: 25,000 AED");
                transportfeeLabel.setForeground(Color.WHITE);
                transportfeeLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                transportfeeLabel.setBounds(20, 380, 200, 20);

                finalLabel.setText("The total amount to be paid: "+(tuitionfee+hostelfee+transportfee));
            }    
        }
    }
}

public class Main{
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        System.out.println(f);
    }
}