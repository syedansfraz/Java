package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class User extends JFrame implements ActionListener {

    public User() {
        initilizer();
    }
    JLabel info = new JLabel();
    JTextField n = new JTextField();
    JTextField fn = new JTextField();
    JTextField pas = new JTextField();
    JTextField ag = new JTextField();
    JFrame frame2 = new JFrame();
    JLabel name = new JLabel();
    JLabel fname = new JLabel();
    JLabel pass = new JLabel();
    JLabel age = new JLabel();
    JLabel gen = new JLabel();
    JRadioButton male = new JRadioButton();
    JRadioButton female = new JRadioButton();
    JButton sub=new JButton("Submit");
    Border b = BorderFactory.createLineBorder(Color.WHITE, 2);
    Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    Font f = new Font("Times New Roman", Font.PLAIN, 15);

    public void initilizer() {
        frame2.setVisible(true);
        frame2.setSize(500, 678);
        frame2.getContentPane().setBackground(Color.WHITE);
//        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setTitle("Emirates");
        frame2.setLayout(null);

        name.setText("Name:");
        name.setFont(f1);
        name.setBounds(130, 100, 70, 20);
        this.add(name);
        frame2.add(name);
        
        info.setText("INFORMATION");
        info.setFont(f1);
        info.setForeground(Color.red);
        info.setBackground(Color.black);
        info.setBounds(180, 30, 150, 30);
        this.add(info);
        frame2.add(info);

        fname.setText("Father Name:");
        fname.setFont(f1);
        fname.setBounds(130, 140, 150, 20);
        this.add(fname);
        frame2.add(fname);

        pass.setText("Passport #:");
        pass.setFont(f1);
        pass.setBounds(130, 180, 150, 20);
        this.add(pass);
        frame2.add(pass);

        age.setText("Age:");
        age.setFont(f1);
        age.setBounds(130, 220, 150, 20);
        this.add(age);
        frame2.add(age);

        gen.setText("Gender:");
        gen.setFont(f1);
        gen.setBounds(130, 260, 150, 20);
        this.add(gen);
        frame2.add(gen);

        n.setText("");
        n.setFont(f);
        n.setBounds(250, 100, 130, 20);
        this.add(n);
        frame2.add(n);

        fn.setText("");
        fn.setFont(f);
        fn.setBounds(250, 140, 130, 20);
        this.add(fn);
        frame2.add(fn);

        pas.setText("");
        pas.setFont(f);
        pas.setBounds(250, 180, 130, 20);
        this.add(pas);
        frame2.add(pas);

        ag.setText("");
        ag.setFont(f);
        ag.setBounds(250, 220, 130, 20);
        this.add(ag);
        frame2.add(ag);

        male.setText("male");
        male.setBackground(Color.WHITE);
        male.setForeground(Color.BLACK);
        male.setBounds(250, 260, 70, 20);
        this.add(male);
        male.setFocusable(false);
        frame2.add(male);

        female.setText("female");
        female.setBackground(Color.WHITE);
        female.setForeground(Color.BLACK);
        female.setBounds(325, 260, 70, 20);
        this.add(female);
        female.setFocusable(false);
        frame2.add(female);

        ButtonGroup grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);
        
        sub.setText("Submit");
        sub.setBackground(Color.WHITE);
        sub.setForeground(Color.BLACK);
        sub.setFocusable(false);
        sub.setFont(f1);
        sub.setBounds(200, 300, 100, 40);
        this.add(sub);
        sub.addActionListener(this);
        frame2.add(sub);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String op=e.getActionCommand();
            if(op.compareTo("Submit")==0)
            {
                try
                {
                 String gen="";
                 if(female.isSelected())
                 {
                     gen="Female";
                 }
                 else
                 {
                     gen="Male";
                 }
                 
                FileWriter file=new FileWriter("User.txt",false);
                file.write(n.getText()+"    "+fn.getText()+"             "+pas.getText()+"               "+ag.getText()+"            "+gen+"\n");
                JOptionPane.showMessageDialog(sub, "Thank You!","Information", JOptionPane.INFORMATION_MESSAGE);
                file.close();
                userside ans=new userside();
                ans.initilizer();
                        
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
