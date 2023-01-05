
package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class App1 extends JFrame implements ItemListener {
    JLabel sel=new JLabel();
    public App1()
    {
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public JLabel lbIcon=new JLabel();
    public JRadioButton admin=new JRadioButton("Admin",false);
    public JRadioButton pass=new JRadioButton("Passenger",false);
    Font f=new Font("Times New Roman",Font.BOLD,15);
    Font f1=new Font("Times New Roman",Font.BOLD,25);
    public void Initilizer()
    {
                deletion();
        Image icon = new ImageIcon(this.getClass().getResource("/front.png")).getImage();
        this.setIconImage(icon);
        
        Icon ic=new ImageIcon(this.getClass().getResource("done.png"));
        lbIcon.setBounds(40,20,600,400);
        lbIcon.setIcon(ic);
        this.add(lbIcon);
        sel.setText("Who are you?");
        sel.setBounds(185, 400, 250, 100);
        sel.setFont(f1);
        this.add(sel);
        
        admin.setText("Admin");
        admin.setBounds(205, 480, 100, 30);
        admin.setBackground(Color.WHITE);
        admin.setFont(f);
        admin.setFocusable(false);
        admin.setForeground(Color.BLACK);
        admin.addItemListener(this);
        this.add(admin);
        
        
        pass.setText("Passenger");
        pass.setBounds(205, 510, 100, 30);
        pass.setBackground(Color.WHITE);
        pass.setFont(f);
        pass.setFocusable(false);
        pass.setForeground(Color.BLACK);
        pass.addItemListener(this);
        this.add(pass);
        
    }
        public void deletion()
    {
        try
                {
//                file=Flight.txt;
                File file=new File("Filled.txt");
                File file2 = new File("seats.txt");
                File file3 = new File("User.txt");
                File file4 = new File("price.txt");
                file4.deleteOnExit();
                file.deleteOnExit();
                file3.deleteOnExit();
                file2.deleteOnExit();
                }
                catch(Exception ex)
                {
                   System.out.println(ex.getMessage());
                }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(admin.isSelected())
        {
//            this.dispose();
            new SecondPage();

        }
        else if(pass.isSelected())
        {
//            this.dispose();
            App a=new App();
        }
        else
        {
            
        }
    }
    
}
