import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Date;
import java.util.Calendar;


class TestFrame extends JFrame implements ActionListener{
    JLabel namLabel,eidLabel, nationLabel, ageLabel, vacLabel,dateLabel;
    JTextField namField, eidField, ageField;
    JComboBox Nationality, DayBox, MonthBox;
    JRadioButton pfizer, sinopharm, astra;
    Calendar secondDate, firstDate = Calendar.getInstance();
    Date d1,d2, currDate = new Date();
    JLabel firstDateLabel, secondDateLabel, finalLabel;
    JButton submitButton;



    TestFrame(){
        setSize(600,600);
        setTitle("COVID 19 VACCINATION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        namLabel = new JLabel("Name");
        namLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        namLabel.setBounds(20,20,50,20);

        namField = new JTextField(40);
        namField.setFont(new Font("Arial", Font.PLAIN, 15));
        namField.setBounds(150,20,100,20);        

        eidLabel = new JLabel("Emirates ID No");
        eidLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        eidLabel.setBounds(20,60,100,20);

        eidField = new JTextField(40);
        eidField.setFont(new Font("Arial", Font.PLAIN, 15));
        eidField.setBounds(150,60,100,20);   

        nationLabel = new JLabel("Nationality");
        nationLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nationLabel.setBounds(20,100,70,20);

        String countries[] = {"India", "Pakistan", "Bangladesh", "UAE", 
        "Saudi Arabia", "Afghanistan"};
        
        Nationality = new JComboBox<>(countries);
        Nationality.setFont(new Font("Arial", Font.PLAIN, 15));
        Nationality.setBounds(150,100,100,20);

        ageLabel = new JLabel("Age");
        ageLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        ageLabel.setBounds(20,140,70,20);

        ageField = new JTextField(20);
        ageField.setFont(new Font("Arial", Font.PLAIN, 15));
        ageField.setBounds(150,140,40,20);

        vacLabel = new JLabel("Choose Vaccine Type");
        vacLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        vacLabel.setBounds(20,180,150,20);

        pfizer = new JRadioButton("Pfizer");
        pfizer.setFont(new Font("Arial", Font.PLAIN, 15));
        pfizer.setBounds(20,220,100,20);

        sinopharm = new JRadioButton("Sinopharm");
        sinopharm.setFont(new Font("Arial", Font.PLAIN, 15));
        sinopharm.setBounds(90,220,100,20);

        astra = new JRadioButton("Astra Zeneca");
        astra.setFont(new Font("Arial", Font.PLAIN, 15));
        astra.setBounds(190,220,150,20);

        ButtonGroup vacGroup = new ButtonGroup();
        vacGroup.add(pfizer);
        vacGroup.add(sinopharm);
        vacGroup.add(astra);

        dateLabel = new JLabel("Date of Vaccine Dose I");
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        dateLabel.setBounds(20,260,200,20);

        String[] days = new String[31];
        for (int i = 1; i < 31; i++){
            days[i-1] = Integer.toString(i);
        }

        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};

        MonthBox = new JComboBox<>(months);
        MonthBox.setFont(new Font("Arial", Font.PLAIN, 15));
        MonthBox.setBounds(20,300,150,20);

        DayBox = new JComboBox<>(days);
        DayBox.setFont(new Font("Arial", Font.PLAIN, 15));
        DayBox.setBounds(200,300,70,20);

        firstDateLabel = new JLabel();
        secondDateLabel = new JLabel();
        finalLabel = new JLabel();

        MonthBox.addActionListener(this);
        DayBox.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setBounds(20,340,80,20); 
        
        submitButton.addActionListener(this);

        add(namLabel);
        add(namField);

        add(eidLabel);
        add(eidField);

        add(nationLabel);
        add(Nationality);

        add(ageLabel);
        add(ageField);

        add(vacLabel);
        add(pfizer);
        add(sinopharm);
        add(astra);

        add(dateLabel);
        add(MonthBox);
        add(DayBox);

        add(submitButton);

        add(firstDateLabel);
        add(secondDateLabel);
        add(finalLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DayBox){
            int monthIndex = MonthBox.getSelectedIndex();
            int dayIndex = DayBox.getSelectedIndex();
            dayIndex++;
            
            firstDate.set(Calendar.DATE, dayIndex);
            firstDate.set(Calendar.MONTH, monthIndex);
            firstDate.set(Calendar.YEAR, 2023);

            secondDate = Calendar.getInstance();
            secondDate.set(Calendar.DATE, dayIndex);
            secondDate.set(Calendar.MONTH, monthIndex);
            secondDate.set(Calendar.YEAR, 2023);
            secondDate.add(Calendar.DATE, 21);

            d1 = firstDate.getTime();
            d2 = secondDate.getTime();
        }

        if (e.getSource() == submitButton){
            firstDateLabel.setText("First Dose: "+d1);
            firstDateLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            firstDateLabel.setBounds(20,380,300,20); 

            secondDateLabel.setText("Second Dose: "+d2);
            secondDateLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            secondDateLabel.setBounds(20,400,300,20);

            if (d1.after(currDate)){
                finalLabel.setText("No Dose is taken");
                finalLabel.setForeground(Color.RED);
                finalLabel.setFont(new Font("Arial", Font.BOLD, 15));
                finalLabel.setBounds(20,440,300,20);
            }

            else if (d2.after(currDate)){
                finalLabel.setText("Only One Dose is taken");
                finalLabel.setForeground(Color.GRAY);
                finalLabel.setFont(new Font("Arial", Font.BOLD, 15));
                finalLabel.setBounds(20,440,300,20);
            }

            else{
                finalLabel.setText("Both Doses are taken");
                finalLabel.setForeground(Color.GREEN);
                finalLabel.setFont(new Font("Arial", Font.BOLD, 15));
                finalLabel.setBounds(20,440,300,20);
            }
        }
    }
}

public class batch3Question{
    public static void main(String[] args){
        TestFrame t = new TestFrame();
        System.out.println(t);
    }
}