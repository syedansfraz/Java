package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class userside extends JFrame implements ActionListener {

    JFrame frame8 = new JFrame();
//     JPanel panel=new JPanel();

    public userside() {
        
    }
    JButton view=new JButton();
    JButton book=new JButton();
    JButton print=new JButton();
    JButton about=new JButton();
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);

    public void initilizer() {
//        panel.setVisible(true);
        frame8.setVisible(true);
        frame8.setSize(500, 678);
        frame8.getContentPane().setBackground(Color.WHITE);
//        deletion();
//        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame8.setTitle("Emirates");
        frame8.setLayout(null);
        
        view.setText("Booking");
        view.setBackground(Color.white);
        view.setForeground(Color.black);
        view.setBounds(190, 180, 120, 40);
        view.setFont(f1);
        view.setFocusable(false);
        this.add(view);
        view.addActionListener(this);
        frame8.add(view);
        
//        book.setText("Booking");
//        book.setBackground(Color.white);
//        book.setForeground(Color.black);
//        book.setBounds(190, 180, 120, 40);
//        book.setFont(f1);
//        book.setFocusable(false);
//        this.add(book);
//        book.addActionListener(this);
//        frame8.add(book);
//        
        print.setText("Print");
        print.setBackground(Color.white);
        print.setForeground(Color.black);
        print.setBounds(190, 230, 120, 40);
        print.setFont(f1);
        print.setFocusable(false);
        this.add(print);
        print.addActionListener(this);
        frame8.add(print);
        
        about.setText("About us");
        about.setBackground(Color.white);
        about.setForeground(Color.black);
        about.setBounds(190, 280, 120, 40);
        about.setFont(f1);
        about.setFocusable(false);
        this.add(about);
        about.addActionListener(this);
        frame8.add(about);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String op=e.getActionCommand();
                if(op.compareTo("Booking")==0)
                {
                    
//                    ans.display_info();
                    seats ans2 =new seats();
                    ans2.initilizer();
                    
      
                    
                }
                else if(op.compareTo("Print")==0)
                {
                 print ans1 =new print();
                 ans1.initlizer();
                }
                else if(op.compareTo("About us")==0)
                {
                    about ans2=new about();
                    ans2.initilizer();
                }
    }
    
}
