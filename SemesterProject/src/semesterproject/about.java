package semesterproject;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class about extends JFrame{
        JFrame frame;
    JLabel label1, label2, label3, label4, label5,label6;
    public void initilizer(){
        frame = new JFrame("About");
        frame.setLayout(null);
        frame.setBounds(60, 350, 320, 250);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.WHITE);
        // frame.add(panel1);
        frame.setVisible(true);

        label1 = new JLabel("45843 Employees (as of 31 Mar,2022)");
        label1.setForeground(Color.red);
        label1.setBounds(10, 20, 250, 30);

        label2 = new JLabel("19M Passenger Flown in 21-22");
        label2.setForeground(Color.red);
        label2.setBounds(10, 50, 250, 30);

        label3 = new JLabel("262 Fleet size");
        label3.setForeground(Color.red);
        label3.setBounds(10, 80, 300, 30);

        label4 = new JLabel("152 Destinations");
        label4.setForeground(Color.red);
        label4.setBounds(10, 110, 300, 30);

        label5 = new JLabel("160 Nationalities");
        label5.setForeground(Color.red);
        label5.setBounds(10, 140, 300, 30);
        
        label6 = new JLabel("General queries: +9221111225535");
        label6.setForeground(Color.red);
        label6.setBounds(10, 170, 300, 30);

        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);

    }
}
