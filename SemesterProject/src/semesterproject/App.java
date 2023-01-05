package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class App extends JFrame implements ItemListener {

    JFrame frame1 = new JFrame();
    
    public App() {
        Initilizer();
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    public JLabel lbIcon = new JLabel();
    public JLabel Welcome = new JLabel();
    public JCheckBox rob = new JCheckBox();
    public JLabel ann = new JLabel();
    adminside ans = new adminside();
    Border b = BorderFactory.createLineBorder(Color.WHITE, 2);

    Font f = new Font("Times New Roman", Font.BOLD, 25);
    Font f1 = new Font("Times New Roman", Font.BOLD, 15);
    public void Initilizer() {
        
        frame1.setVisible(true);
        frame1.setSize(500, 678);
        frame1.getContentPane().setBackground(Color.WHITE);
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("Emirates");
        frame1.setLayout(null);
        Icon ic = new ImageIcon(this.getClass().getResource("first 1.png"));
        lbIcon.setBounds(0, 20, 500, 400);
        lbIcon.setIcon(ic);
        this.add(lbIcon);
        frame1.add(lbIcon);
        Welcome.setText("Welcome! Dear Passenger");
        Welcome.setBounds(100, 400, 300, 40);
        Welcome.setForeground(Color.BLACK);
        Welcome.setBackground(Color.WHITE);
        Welcome.setFont(f);
        Welcome.setOpaque(true);
        this.add(Welcome);
        frame1.add(Welcome);

        rob.setBounds(140, 450, 300, 40);
        rob.setText("Confirm you are not robort");
        rob.setFont(f1);
        rob.setBackground(Color.WHITE);
        rob.addItemListener(this);
        rob.setFocusable(false);
        this.add(rob);
        frame1.add(rob);

        ann.setText(read());
        ann.setBounds(100, 500, 500, 40);
        ann.setFont(f1);
        ann.setBackground(Color.WHITE);
        ann.setForeground(Color.red);
        ann.setFocusable(false);
        this.add(ann);
        frame1.add(ann);
    }

    public String read() {
        try {
            String ln = "";
            File f = new File("announcements.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                ln = input.nextLine();
            }
//                ann.setText(ln);
            input.close();
            return ln;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return "";
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (rob.isSelected()) {

            JOptionPane.showMessageDialog(rob, "Verified");
            frame1.dispose();
            User ans = new User();
        }
    }

}
