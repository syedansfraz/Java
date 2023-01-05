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
import javax.swing.JTable;
import javax.swing.JTextField;

public class Update extends JFrame implements ActionListener {

    JFrame frame7 = new JFrame();

    public Update() {

    }
    JTable table=new JTable();
    JLabel nam = new JLabel();
    JButton upd = new JButton();
    JTextField put = new JTextField();
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
    Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        Font f = new Font("Times New Roman", Font.PLAIN, 15);


    public void initilizer() {
        frame7.setVisible(true);
        frame7.setSize(500, 678);
        frame7.getContentPane().setBackground(Color.WHITE);
//        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame7.setTitle("Emirates");
        frame7.setLayout(null);

        nam.setText("Flight to Update");
        nam.setBounds(170, 320, 400, 40);
        nam.setBackground(Color.white);
        nam.setForeground(Color.red);
        this.add(nam);
        nam.setFont(f1);
        frame7.add(nam);

        put.setText("");
        put.setBounds(140, 360, 195, 40);
        put.setBackground(Color.white);
        put.setForeground(Color.black);
        this.add(put);
        put.setFont(f);
        frame7.add(put);
        
        name.setText("Flight:");
        name.setFont(f1);
        name.setBounds(130, 100, 70, 20);
        this.add(name);
        frame7.add(name);

        info.setText("FLIGHT INFORMATION");
        info.setFont(f1);
        info.setForeground(Color.red);
        info.setBackground(Color.black);
        info.setBounds(140, 30, 300, 30);
        this.add(info);
        frame7.add(info);

        route.setText("Route:");
        route.setFont(f1);
        route.setBounds(130, 140, 150, 20);
        this.add(route);
        frame7.add(route);

        dur.setText("Duration:");
        dur.setFont(f1);
        dur.setBounds(130, 180, 150, 20);
        this.add(dur);
        frame7.add(dur);

        price.setText("Ticket Price:");
        price.setFont(f1);
        price.setBounds(130, 220, 150, 20);
        this.add(price);
        frame7.add(price);
        
        dt.setText("Departure:");
        dt.setFont(f1);
        dt.setBounds(130, 260, 150, 20);
        this.add(dt);
        frame7.add(dt);
        
        n.setText("");
        n.setFont(f);
        n.setBounds(250, 100, 130, 20);
        this.add(n);
        frame7.add(n);

        fn.setText("");
        fn.setFont(f);
        fn.setBounds(250, 140, 130, 20);
        this.add(fn);
        frame7.add(fn);

        pas.setText("");
        pas.setFont(f);
        pas.setBounds(250, 180, 130, 20);
        this.add(pas);
        frame7.add(pas);

        ag.setText("");
        ag.setFont(f);
        ag.setBounds(250, 220, 130, 20);
        this.add(ag);
        frame7.add(ag);
        
        dt1.setText("");
        dt1.setFont(f);
        dt1.setBounds(250, 260, 130, 20);
        this.add(dt1);
        frame7.add(dt1);
        
//        table.setBackground(Color.red);
//        table.setBounds(120, 300, 200, 100);
//        this.add(table);
//        frame7.add(table);
        

        upd.setText("Update");
        upd.setBounds(175, 420, 120, 40);
        upd.setBackground(Color.white);
        upd.setForeground(Color.red);
        this.add(upd);
        upd.setFont(f1);
        upd.setFocusable(false);
        upd.addActionListener(this);
        frame7.add(upd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                 String op=e.getActionCommand();

        if(op.compareTo("Update")==0)
        {
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
//                        FileWriter file=new FileWriter("frtemp.txt",true);
                        
                        frtemp.write(ln+"\n");
                    }
                }
                frtemp.write(n.getText()+"      "+fn.getText()+"        "+pas.getText()+"            "+dt1.getText()+"              "+ag.getText()+"\n");
                frtemp.close();
                input.close();
                if(flg==0)
                {
                     
                    JOptionPane.showMessageDialog(upd, "Record Updated","Information", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Record Updated");
                }
                else
                {
                    JOptionPane.showMessageDialog(upd, "Record Not Found","Information", JOptionPane.INFORMATION_MESSAGE);
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

}
