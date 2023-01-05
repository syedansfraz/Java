package semesterproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class print extends JFrame {

    JFrame frame = new JFrame();
    JLabel label1, label2;
    public JLabel lbIcon = new JLabel();
    JLabel se = new JLabel();
    JLabel se1 = new JLabel();
            JLabel se2 = new JLabel();

    JButton print = new JButton();

    public void initlizer() {
        frame = new JFrame("Ticket");
        frame.setLayout(null);
        frame.setBounds(60, 350, 400, 225);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.WHITE);
        // frame.add(panel1);
        frame.setVisible(true);

        Icon ic = new ImageIcon(this.getClass().getResource("ticket 1.png"));
        lbIcon.setBounds(5, 110, 310, 90);
        lbIcon.setIcon(ic);
        this.add(lbIcon);
        frame.add(lbIcon);

        label2 = new JLabel();
        label2.setText("Name      Father Name      Passport No.      Age      Gender");
        label2.setBackground(Color.white);
        label2.setForeground(Color.red);
        label2.setBounds(10, 10, 350, 40);
        this.add(label2);
        frame.add(label2);

        print.setText("Print");
        print.setBackground(Color.white);
        print.setForeground(Color.red);
        print.setBounds(280, 130, 70, 40);
        print.setFocusable(false);

        this.add(print);
        frame.add(print);

        label1 = new JLabel();
        label1.setForeground(Color.BLACK);
        label1.setBounds(5, 40, 350, 40);
        this.add(label1);
        se.setBounds(10, 70, 240, 40);
        se.setBackground(Color.white);
        se.setForeground(Color.black);
        this.add(se);
        se.setFocusable(false);
        frame.add(se);

        se1.setBounds(90, 70, 240, 40);
        se1.setBackground(Color.BLACK);
        se1.setForeground(Color.black);
        this.add(se1);
        se1.setFocusable(false);
        frame.add(se1);

        se2.setBounds(230, 70, 240, 40);
        se2.setBackground(Color.black);
        se2.setForeground(Color.BLACK);
        se2.setFocusable(false);
        this.add(se2);
        frame.add(se2);

        try {
            File f = new File("User.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                String ln = input.nextLine();
                System.out.println(ln);
                label1.setText(ln);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        frame.add(label1);
        try {
            File f = new File("seats.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                String ln = input.nextLine();
                System.out.println(ln);
                se.setText("Seats: " + ln);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            File f = new File("Filled.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                String ln = input.nextLine();
                System.out.println(ln);
                se1.setText("Seat No:" + ln);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            File f = new File("price.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                String ln = input.nextLine();
                System.out.println(ln);
                se2.setText("Total Amount:"+ ln);  
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
        

}
