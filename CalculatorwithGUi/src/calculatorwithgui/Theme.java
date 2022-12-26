package calculatorwithgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class Theme extends JFrame implements ItemListener,ActionListener
{

    private JToggleButton toggle_btn;

    public Theme() {

        this.setVisible(true);
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        this.setJToggle();
    }
    public JTextField txt = new JTextField();
    Font f = new Font("Times New Roman", Font.BOLD, 20);
    Font f1 = new Font("Times New Roman", Font.BOLD, 35);
    public JLabel label = new JLabel();
    Border b = BorderFactory.createLineBorder(Color.WHITE, 2);

    public void Initilizer() {

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton multi = new JButton("*");
        JButton divid = new JButton("/");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton equal = new JButton("=");
        JButton per = new JButton("%");
        JButton dot = new JButton(".");
        JButton reset = new JButton("Reset");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        b0.setBounds(5, 200, 70, 50);
        b0.setBackground(Color.GRAY);
        b0.setForeground(Color.WHITE);
        b0.setFocusable(false);
        this.add(b0);
        b1.setBounds(86, 200, 70, 50);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        this.add(b1);
        b2.setBounds(167, 200, 70, 50);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        this.add(b2);
        multi.setBounds(248, 200, 70, 50);
        multi.setBackground(Color.GRAY);
        multi.setForeground(Color.WHITE);
        multi.setFocusable(false);
        this.add(multi);
        b3.setBounds(5, 251, 70, 50);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setFocusable(false);
        this.add(b3);
        b4.setBounds(86, 251, 70, 50);
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b4.setFocusable(false);
        this.add(b4);
        b5.setBounds(167, 251, 70, 50);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b5.setFocusable(false);
        this.add(b5);
        divid.setBounds(248, 251, 70, 50);
        divid.setBackground(Color.GRAY);
        divid.setForeground(Color.WHITE);
        divid.setFocusable(false);
        this.add(divid);
        b6.setBounds(5, 302, 70, 50);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b6.setFocusable(false);
        this.add(b6);
        b7.setBounds(86, 302, 70, 50);
        b7.setBackground(Color.GRAY);
        b7.setForeground(Color.WHITE);
        b7.setFocusable(false);
        this.add(b7);
        b8.setBounds(167, 302, 70, 50);
        b8.setBackground(Color.GRAY);
        b8.setForeground(Color.WHITE);
        b8.setFocusable(false);
        this.add(b8);
        plus.setBounds(248, 302, 70, 50);
        plus.setBackground(Color.GRAY);
        plus.setForeground(Color.WHITE);
        plus.setFocusable(false);
        this.add(plus);
        b9.setBounds(86, 353, 70, 50);
        b9.setBackground(Color.GRAY);
        b9.setForeground(Color.WHITE);
        b9.setFocusable(false);
        this.add(b9);
        minus.setBounds(248, 353, 70, 50);
        minus.setBackground(Color.GRAY);
        minus.setForeground(Color.WHITE);
        minus.setFocusable(false);
        this.add(minus);
        equal.setBounds(248, 404, 70, 50);
        equal.setBackground(Color.GRAY);
        equal.setForeground(Color.WHITE);
        equal.setFocusable(false);
        this.add(equal);
        dot.setBounds(167, 353, 70, 50);
        dot.setBackground(Color.GRAY);
        dot.setForeground(Color.WHITE);
        dot.setFocusable(false);
        this.add(dot);
        per.setBounds(5, 353, 70, 50);
        per.setBackground(Color.GRAY);
        per.setForeground(Color.WHITE);
        per.setFocusable(false);
        this.add(per);
        reset.setBounds(167, 404, 70, 50);
        reset.setBackground(Color.GRAY);
        reset.setForeground(Color.WHITE);
        reset.setFocusable(false);
        this.add(reset);

        txt.setText("DROP NUMBERS..");
        txt.setToolTipText("Enter for solution");
        txt.setBounds(5, 90, 315, 80);
        txt.setFont(f);
        txt.setBackground(Color.DARK_GRAY);
        txt.setBorder(b);
        txt.setForeground(Color.WHITE);
        this.add(txt);
        label.setText("Standard");
        label.setToolTipText("This Calculator will solve simple problem");
        label.setBounds(7, 18, 150, 65);
        label.setFont(f1);
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        this.add(label);
        
    }

    private void setJToggle() {
        toggle_btn = new JToggleButton("OFF");
        toggle_btn.setBounds(5, 404, 151, 50);
        toggle_btn.setBackground(Color.GRAY);
        toggle_btn.setForeground(Color.WHITE);
        toggle_btn.setFocusable(false);
        this.add(toggle_btn);
        this.setAction();

    }

    private void setAction() {
        toggle_btn.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (toggle_btn.isSelected()) {
            toggle_btn.setText("ON");
            
        } else {
            toggle_btn.setText("OFF");
        }

    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
          JButton pb=(JButton)ae.getSource();
          
    }

}
