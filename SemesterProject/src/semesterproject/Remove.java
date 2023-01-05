package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Remove extends JFrame implements ActionListener {
    JFrame frame6 = new JFrame();
    public Remove(){
        
    }
    JLabel name= new JLabel();
    JButton del= new JButton();
    JTextField put= new JTextField();

        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    public void initilizer()
    {
        frame6.setVisible(true);
        frame6.setSize(500, 678);
        frame6.getContentPane().setBackground(Color.WHITE);
//        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setTitle("Emirates");
        frame6.setLayout(null);
        
        name.setText("Name of Flight");
        name.setBounds(175, 100, 400, 40);
        name.setBackground(Color.white);
        name.setForeground(Color.red);
        this.add(name);
        name.setFont(f1);
        frame6.add(name);
        
        put.setText("");
        put.setBounds(140, 150, 195, 40);
        put.setBackground(Color.white);
        put.setForeground(Color.black);
        this.add(put);
        put.setFont(f1);
        frame6.add(put);
        
         del.setText("Remove");
        del.setBounds(175, 210, 120, 40);
        del.setBackground(Color.white);
        del.setForeground(Color.red);
        this.add(del);
        del.setFont(f1);
        del.setFocusable(false);
        del.addActionListener(this);
        frame6.add(del);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        String op=e.getActionCommand();
        if(op.compareTo("Remove")==0)
             try
                {
                String str=put.getText();
                File f=new File("Flight.txt");
                File ftemp=new File("temp.txt");
                FileWriter frtemp=new FileWriter(ftemp);
                Scanner input=new Scanner(f);
                int flg=1;
                while(input.hasNext())
                {
                    String ln=input.nextLine();
                    String[] arr=ln.split(" ");
                    if(str.compareTo(arr[0])==0)
                    {
                        flg=0;
                    }
                    else
                    {
                        frtemp.write(ln+"\n");
                    }
                }
                frtemp.close();
                input.close();
                if(flg==0)
                {
                    JOptionPane.showMessageDialog(del, "Record Deleted","Information", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Record Deleted");
                }
                else
                {
                    JOptionPane.showMessageDialog(del, "Record Not Found","Information", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Record Not Found");
                }
                f.delete();
                ftemp.renameTo(new File("Flight.txt"));
                //System.out.println("Record Deleted");
                }
                catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }


    }
    
}
