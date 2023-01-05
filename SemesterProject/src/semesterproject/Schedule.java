package semesterproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Schedule extends JFrame implements ActionListener {

    public Schedule() {
        initilizer();

    }
    JLabel lab = new JLabel();
    Font f = new Font("Times New Roman", Font.BOLD, 15);
    Border b = BorderFactory.createLineBorder(Color.red, 2);

    public void initilizer() {
        get();
    }
    File file = new File("Flight.txt");
    public void get() {
try
{
Container pane = getContentPane();
JLabel label;
        lab.setText("     Name      Route     Durat.     Departure     Ticket");
        lab.setBounds(50, 50, 400, 100);
        lab.setBackground(Color.white);
        lab.setForeground(Color.red);
        this.add(lab);
        lab.setFont(f);
        pane.add(lab);
BufferedReader reader = new BufferedReader(new FileReader("Flight.txt"));
String str = "";
pane.setLayout(new FlowLayout());
while((str=reader.readLine())!=null)
{
label = new JLabel(str);
pane.add(label);
}
reader.close();
//setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(400,300);
setVisible(true);
}
catch(Exception e)
{e.printStackTrace();}
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           }
}
