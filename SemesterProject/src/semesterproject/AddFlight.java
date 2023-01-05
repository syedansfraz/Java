package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddFlight extends JFrame implements ActionListener {

    JFrame frame4 = new JFrame();

    public AddFlight() {
        initilizer();
    }
    JLabel info = new JLabel();
    JLabel name = new JLabel();
    JLabel dt = new JLabel();
    JLabel route = new JLabel();
    JLabel dur = new JLabel();
    JLabel price = new JLabel();
    JTextField dt1 = new JTextField();
    JTextField n = new JTextField();
    JTextField fn = new JTextField();
    JTextField pas = new JTextField();
    JTextField ag = new JTextField();
    JButton sub=new JButton("Submit");
    Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    Font f = new Font("Times New Roman", Font.PLAIN, 15);

    public void initilizer() {
        frame4.setVisible(true);
        frame4.setSize(500, 678);
        frame4.getContentPane().setBackground(Color.WHITE);
//        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setTitle("Emirates");
        frame4.setLayout(null);

        name.setText("Flight:");
        name.setFont(f1);
        name.setBounds(130, 100, 70, 20);
        this.add(name);
        frame4.add(name);

        info.setText("FLIGHT INFORMATION");
        info.setFont(f1);
        info.setForeground(Color.red);
        info.setBackground(Color.black);
        info.setBounds(140, 30, 300, 30);
        this.add(info);
        frame4.add(info);

        route.setText("Route:");
        route.setFont(f1);
        route.setBounds(130, 140, 150, 20);
        this.add(route);
        frame4.add(route);

        dur.setText("Duration:");
        dur.setFont(f1);
        dur.setBounds(130, 180, 150, 20);
        this.add(dur);
        frame4.add(dur);

        price.setText("Ticket Price:");
        price.setFont(f1);
        price.setBounds(130, 220, 150, 20);
        this.add(price);
        frame4.add(price);
        
        dt.setText("Departure:");
        dt.setFont(f1);
        dt.setBounds(130, 260, 150, 20);
        this.add(dt);
        frame4.add(dt);
        
        n.setText("");
        n.setFont(f);
        n.setBounds(250, 100, 130, 20);
        this.add(n);
        frame4.add(n);

        fn.setText("");
        fn.setFont(f);
        fn.setBounds(250, 140, 130, 20);
        this.add(fn);
        frame4.add(fn);

        pas.setText("");
        pas.setFont(f);
        pas.setBounds(250, 180, 130, 20);
        this.add(pas);
        frame4.add(pas);

        ag.setText("");
        ag.setFont(f);
        ag.setBounds(250, 220, 130, 20);
        this.add(ag);
        frame4.add(ag);
        
        dt1.setText("");
        dt1.setFont(f);
        dt1.setBounds(250, 260, 130, 20);
        this.add(dt1);
        frame4.add(dt1);
        
        sub.setText("Submit");
        sub.setBackground(Color.WHITE);
        sub.setForeground(Color.BLACK);
        sub.setFocusable(false);
        sub.setFont(f1);
        sub.setBounds(200, 350, 100, 40);
        this.add(sub);
        sub.addActionListener(this);
        frame4.add(sub);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         String op=e.getActionCommand();
            if(op.compareTo("Submit")==0)
            {
                
                
                try
                {
//                file=Flight.txt;
                FileWriter file=new FileWriter("Flight.txt",true);
                file.write(n.getText()+"      "+fn.getText()+"        "+pas.getText()+"            "+dt1.getText()+"              "+ag.getText()+"\n");
                JOptionPane.showMessageDialog(sub, "Record Added","Information", JOptionPane.INFORMATION_MESSAGE);
                file.close();
                }
                catch(Exception ex)
                {
                   System.out.println(ex.getMessage());
                }
            }
            else
            {
                System.out.println("Wrong");
            }
                }
}
