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

public class adminside extends JFrame implements ActionListener {
    JFrame frame3=new JFrame();
    public adminside()
    {
    }
    public static String announcment;
    JButton add=new JButton();
    JButton del=new JButton();
    JButton view=new JButton();
    JButton upd=new JButton();
    JLabel ann=new JLabel();
    JButton done=new JButton();
    JTextField field=new JTextField();
    Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    Font f = new Font("Times New Roman", Font.PLAIN, 15);
    
    public void initilizer()
    {
        frame3.setVisible(true);
        frame3.setSize(500, 678);
        frame3.getContentPane().setBackground(Color.WHITE);
//        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setTitle("Emirates");
        frame3.setLayout(null);
        
        add.setText("New Flight");
        add.setBackground(Color.white);
        add.setForeground(Color.BLACK);
        add.setBounds(180, 120, 130, 50);
        add.setFont(f1);
        add.setFocusable(false);
        this.add(add);
        add.addActionListener(this);
        frame3.add(add);
        
        view.setText("Schedules");
        view.setBackground(Color.white);
        view.setForeground(Color.BLACK);
        view.setBounds(180, 180, 130, 50);
        view.setFont(f1);
        view.setFocusable(false);
        this.add(view);
        view.addActionListener(this);
        frame3.add(view);
        
        del.setText("Remove");
        del.setBackground(Color.white);
        del.setForeground(Color.BLACK);
        del.setBounds(180, 240, 130, 50);
        del.setFont(f1);
        del.setFocusable(false);
        this.add(del);
        del.addActionListener(this);
        frame3.add(del);
        
        upd.setText("Update");
        upd.setBackground(Color.white);
        upd.setForeground(Color.BLACK);
        upd.setBounds(180, 300, 130, 50);
        upd.setFont(f1);
        upd.setFocusable(false);
        this.add(upd);
        upd.addActionListener(this);
        frame3.add(upd);
        
        ann.setText("Announcements");
        ann.setBackground(Color.white);
        ann.setForeground(Color.red);
        ann.setBounds(180, 360, 180, 50);
        ann.setFont(f1);
        ann.setFocusable(false);
        this.add(ann);
        frame3.add(ann);
        
        field.setText("Announce here!");
        field.setBackground(Color.white);
        field.setForeground(Color.BLACK);
        field.setBounds(155, 420, 180, 40);
        field.setFont(f);
//        field.setFocusable(false);
        this.add(field);
        frame3.add(field);
        
        done.setText("Post");
        done.setBounds(200,470,80,40);
        done.setBackground(Color.white);
        done.setForeground(Color.black);
        this.add(done);
        done.setFocusable(false);
        done.addActionListener(this);
        frame3.add(done);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String op=e.getActionCommand();
        if(op.compareTo("Post")==0)
        {
             try
                {
            FileWriter file=new FileWriter("announcements.txt",false);
                file.write(field.getText()+"\n");
                JOptionPane.showMessageDialog(done, "Record Added","Information", JOptionPane.INFORMATION_MESSAGE);
                file.close();
        }
             catch(Exception ex)
                {
                   System.out.println(ex.getMessage());
                }
    }
        else if (op.compareTo("New Flight")==0)
        {
            AddFlight ans=new AddFlight();
        }
        else if (op.compareTo("Schedules")==0)
        {
            Schedule ans =new Schedule();
        
        }
        else if(op.compareTo("Remove")==0)
        {
            Remove ans=new Remove();
            ans.initilizer();
        }
        else if (op.compareTo("Update")==0)
        {
            Update ans= new Update();
            ans.initilizer();
        }
}
}
