package semesterproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class seats extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JButton del = new JButton();
    JButton del2 = new JButton();
    int ff=0;
    JButton del1 = new JButton();
    
    JLabel lab = new JLabel();
        JLabel lab1 = new JLabel();
    JTextField se = new JTextField();
    JTextField se2 = new JTextField();
//    JLabel c=new JLabel();

    Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    Font f = new Font("Times New Roman", Font.PLAIN, 15);
    JLabel se1 = new JLabel();
    int i;
    public void initilizer() {

        frame = new JFrame("Seats");
        frame.setLayout(null);
        frame.setSize(500, 678);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);

        del.setText("Available Flights");
        del.setBounds(120, 60, 250, 40);
        del.setBackground(Color.white);
        del.setForeground(Color.black);
        this.add(del);
        del.setFont(f1);
        del.setFocusable(false);
        del.addActionListener(this);
        frame.add(del);

        del2.setText("Find");
        del2.setBounds(190, 290, 100, 40);
        del2.setBackground(Color.white);
        del2.setForeground(Color.black);
        this.add(del2);
        del2.setFont(f1);
        del2.setFocusable(false);
        del2.addActionListener(this);
        frame.add(del2);
        
//        se.setText
//        se.setBounds(240, 140, 240, 40);
//        se.setBackground(Color.white);
//        se.setForeground(Color.black);
//        this.add(se);
//        se.setFont(f1);
//        se.setFocusable(false);
//        frame.add(se);

        se1.setText("How many seats:");
        se1.setBounds(120, 140, 250, 40);
        se1.setBackground(Color.white);
        se1.setForeground(Color.black);
        this.add(se1);
        se1.setFont(f1);
        se1.setFocusable(false);
        frame.add(se1);
        
        lab1.setText("Flight Name:");
        lab1.setBounds(120, 220, 250, 40);
        lab1.setBackground(Color.white);
        lab1.setForeground(Color.black);
        this.add(lab1);
        lab1.setFont(f1);
        lab1.setFocusable(false);
        frame.add(lab1);
        
        se2.setText("");
        se2.setBounds(270, 140, 100, 40);
        se2.setBackground(Color.white);
        se2.setForeground(Color.black);
        this.add(se2);
        se2.setFont(f);
        frame.add(se2);
        
        se.setText("");
        se.setBounds(240, 220, 100, 40);
        se.setBackground(Color.white);
        se.setForeground(Color.black);
        this.add(se);
        se.setFont(f);
        frame.add(se);

//        SpinnerModel value
//                = new SpinnerNumberModel(0,
//                        0,
//                        10,
//                        1);
//        JSpinner spinner = new JSpinner(value);
//        spinner.setBounds(320, 140, 50, 30);
//        frame.add(spinner);
//        spinner.addChangeListener(new ChangeListener() {
//            public void stateChanged(ChangeEvent e) {
////               i= (JSpinner) e.getSource()).getValue();
//                se.setText("Seats:" + ((JSpinner) e.getSource()).getValue());
//                try {
////                file=Flight.txt;
//                    FileWriter file = new FileWriter("seats.txt", false);
//                    file.write(se.getText() + "\n");
//
//                    file.close();
//                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
//                }
//            }

    }
    public void getting(String a)
    {
                           int pri,price;
                           try{
                           FileWriter file1 = new FileWriter("price.txt", false);
                           pri= Integer.parseInt(a);
                           int par= Integer.parseInt(se2.getText());
                            System.out.println(a);
//                            int par=1;
                            price=pri*par;
                            file1.write(price + "\n");
                            file1.close();
                            System.out.println(price);
                           }
                           catch (Exception ae) {
                ae.printStackTrace();
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();
        if (op.compareTo("Available Flights") == 0) {
            try {
                Container pane = getContentPane();
                JLabel label;
                lab.setText("     Name      Route     Durat.     Ticket     Departure");
                lab.setBounds(50, 50, 400, 100);
                lab.setBackground(Color.white);
                lab.setForeground(Color.red);
                this.add(lab);
                lab.setFont(f);
                pane.add(lab);
                BufferedReader reader = new BufferedReader(new FileReader("Flight.txt"));
                String str = "";
                pane.setLayout(new FlowLayout());
                while ((str = reader.readLine()) != null) {
                    label = new JLabel(str);
                    pane.add(label);
                }
                reader.close();
//setDefaultCloseOperation(EXIT_ON_CLOSE);
                setSize(400, 300);
                setVisible(true);
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        } else if (op.compareTo("Find") == 0) {
                int par;
//                int ff=0;
                String lastWord;
                par= Integer.parseInt(se2.getText());
                try {
                    FileWriter file = new FileWriter("seats.txt", false);
                    file.write(se2.getText() + "\n");
                                        file.close();
                    BufferedReader reader = new BufferedReader(new FileReader("Flight.txt"));
                    String str = "";
                    while ((str = reader.readLine()) != null) {
                        if (str.contains(se.getText())) {
                            ff = 1;
                            lastWord = str.substring(str.lastIndexOf(" ")+1);
                            getting(lastWord);
//                            
                        }
                    }
                    if (ff == 1) {
                        System.out.println("Found");
                        JOptionPane.showMessageDialog(del2, "Flight Found", "Information", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(str);
                        booking ans = new booking();
                        for(int i=0;i<par;i++)
                        {
                        JOptionPane.showMessageDialog(null,
                                "Seat number 1-10 (First Class) while seat number 11-20 (Economy Class)");
                        int choice = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Press 1 for first class and 2 for economy class.)"));
                        switch (choice) {
                            case 1:
                                ans.first_class();
                                break;
                            case 2:
                                ans.econmy_class();
                                break;
                        }
                        
                        }
                        ans.display_info();
                    } else {
                        JOptionPane.showMessageDialog(del2, "Flight Not Found", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    reader.close();
                } catch (Exception ae) {
                }
            }
        }

    }

