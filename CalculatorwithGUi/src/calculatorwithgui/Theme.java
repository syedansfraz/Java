package calculatorwithgui;

import java.lang.Math;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Theme extends JFrame implements ItemListener {

    public int op;
    public int d = 0;
    public JTextField mtxt = new JTextField();
    public JTextField ptxt = new JTextField();
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
    JButton reset = new JButton("C");
    JButton sq = new JButton("a²");
    JButton sr = new JButton("√");
    JButton back = new JButton("←");
    JButton e = new JButton("e");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    private JToggleButton toggle_btn;
    Font f = new Font("Times New Roman", Font.BOLD, 25);
    Font f1 = new Font("Times New Roman", Font.BOLD, 35);
    public JLabel label = new JLabel();
    Border b = BorderFactory.createLineBorder(Color.WHITE, 2);

    public void Initilizer() {
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);

        mtxt.setToolTipText("Enter for solution");
        mtxt.setBounds(5, 80, 315, 70);
        mtxt.setFont(f);
        mtxt.setBackground(Color.DARK_GRAY);
        mtxt.setBorder(b);
        mtxt.setForeground(Color.WHITE);
        mtxt.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(mtxt);

        ptxt.setToolTipText("Pervious calculations");
        ptxt.setBounds(5, 155, 315, 40);
        ptxt.setFont(f);
        ptxt.setBackground(Color.DARK_GRAY);
        ptxt.setBorder(b);
        ptxt.setForeground(Color.WHITE);
        this.add(ptxt);

        b0.setBounds(5, 200, 70, 50);
        b0.setBackground(Color.GRAY);
        b0.setForeground(Color.WHITE);
        b0.setFocusable(false);
        b0.addActionListener(new Btn_Even_Handling());
        this.add(b0);

        b1.setBounds(86, 200, 70, 50);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(new Btn_Even_Handling());
        this.add(b1);

        b2.setBounds(167, 200, 70, 50);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(new Btn_Even_Handling());
        this.add(b2);

        back.setBounds(248, 200, 70, 50);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.addActionListener(new Btn_Even_Handling());
        this.add(back);

        multi.setBounds(248, 251, 70, 50);
        multi.setBackground(Color.GRAY);
        multi.setForeground(Color.WHITE);
        multi.setFocusable(false);
        multi.addActionListener(new Btn_Even_Handling());
        this.add(multi);

        b3.setBounds(5, 251, 70, 50);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setFocusable(false);
        b3.addActionListener(new Btn_Even_Handling());
        this.add(b3);

        b4.setBounds(86, 251, 70, 50);
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b4.setFocusable(false);
        b4.addActionListener(new Btn_Even_Handling());
        this.add(b4);

        b5.setBounds(167, 251, 70, 50);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b5.setFocusable(false);
        b5.addActionListener(new Btn_Even_Handling());
        this.add(b5);

        divid.setBounds(248, 302, 70, 50);
        divid.setBackground(Color.GRAY);
        divid.setForeground(Color.WHITE);
        divid.setFocusable(false);
        divid.addActionListener(new Btn_Even_Handling());
        this.add(divid);

        b6.setBounds(5, 302, 70, 50);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b6.setFocusable(false);
        b6.addActionListener(new Btn_Even_Handling());
        this.add(b6);

        b7.setBounds(86, 302, 70, 50);
        b7.setBackground(Color.GRAY);
        b7.setForeground(Color.WHITE);
        b7.setFocusable(false);
        b7.addActionListener(new Btn_Even_Handling());
        this.add(b7);

        b8.setBounds(167, 302, 70, 50);
        b8.setBackground(Color.GRAY);
        b8.setForeground(Color.WHITE);
        b8.setFocusable(false);
        b8.addActionListener(new Btn_Even_Handling());
        this.add(b8);

        plus.setBounds(248, 353, 70, 50);
        plus.setBackground(Color.GRAY);
        plus.setForeground(Color.WHITE);
        plus.setFocusable(false);
        plus.addActionListener(new Btn_Even_Handling());
        this.add(plus);

        b9.setBounds(86, 353, 70, 50);
        b9.setBackground(Color.GRAY);
        b9.setForeground(Color.WHITE);
        b9.setFocusable(false);
        b9.addActionListener(new Btn_Even_Handling());
        this.add(b9);

        sr.setBounds(86, 404, 70, 50);
        sr.setBackground(Color.GRAY);
        sr.setForeground(Color.WHITE);
        sr.setFocusable(false);
        sr.addActionListener(new Btn_Even_Handling());
        this.add(sr);

        minus.setBounds(248, 404, 70, 50);
        minus.setBackground(Color.GRAY);
        minus.setForeground(Color.WHITE);
        minus.setFocusable(false);
        minus.addActionListener(new Btn_Even_Handling());
        this.add(minus);

        equal.setBounds(248, 455, 70, 50);
        equal.setBackground(Color.GRAY);
        equal.setForeground(Color.WHITE);
        equal.setFocusable(false);
        equal.addActionListener(new Btn_Even_Handling());
        this.add(equal);

        dot.setBounds(167, 353, 70, 50);
        dot.setBackground(Color.GRAY);
        dot.setForeground(Color.WHITE);
        dot.setFocusable(false);
        dot.addActionListener(new Btn_Even_Handling());
        this.add(dot);

        per.setBounds(5, 353, 70, 50);
        per.setBackground(Color.GRAY);
        per.setForeground(Color.WHITE);
        per.setFocusable(false);
        per.addActionListener(new Btn_Even_Handling());
        this.add(per);

        e.setBounds(5, 404, 70, 50);
        e.setBackground(Color.GRAY);
        e.setForeground(Color.WHITE);
        e.setFocusable(false);
        e.addActionListener(new Btn_Even_Handling());
        this.add(e);

        reset.setBounds(167, 455, 70, 50);
        reset.setBackground(Color.GRAY);
        reset.setForeground(Color.WHITE);
        reset.setFocusable(false);
        reset.addActionListener(new Btn_Even_Handling());
        this.add(reset);

        sq.setBounds(167, 404, 70, 50);
        sq.setBackground(Color.GRAY);
        sq.setForeground(Color.WHITE);
        sq.setFocusable(false);
        sq.addActionListener(new Btn_Even_Handling());
        this.add(sq);

        label.setText("Standard");
        label.setToolTipText("This Calculator will solve simple problem");
        label.setBounds(7, 18, 150, 65);
        label.setFont(f1);
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        this.add(label);

        toggle_btn = new JToggleButton("OFF");
        toggle_btn.setBounds(5, 455, 151, 50);
        toggle_btn.setBackground(Color.GRAY);
        toggle_btn.setForeground(Color.WHITE);
        toggle_btn.setFocusable(false);
        this.setJToggle();
        this.add(toggle_btn);

    }

    private void setJToggle() {
        this.setAction();
    }

    private void setAction() {
        toggle_btn.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (toggle_btn.isSelected()) {
            toggle_btn.setText("ON");
            mtxt.setText("0");
            ptxt.setText(" 0");

            toggle_btn.setBackground(Color.LIGHT_GRAY);

        } else {
            toggle_btn.setText("OFF");
            mtxt.setText("");
            ptxt.setText("");

        }

    }

    public class Btn_Even_Handling implements ActionListener {

        public static double val;
        public static String vol;

        @Override
        public void actionPerformed(ActionEvent e) {
            String txt = e.getActionCommand().trim();
            if (toggle_btn.isSelected()) {

                if (txt.compareTo("C") == 0) {
                    mtxt.setText("0");
                    ptxt.setText("0");
                } else if (txt.compareTo("+") == 0) {
                    op = 1;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("-") == 0) {
                    op = 2;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("*") == 0) {
                    op = 3;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("/") == 0) {
                    op = 4;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("%") == 0) {
                    op = 5;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("a²") == 0) {
                    op = 6;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("√") == 0) {
                    op = 7;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("e") == 0) {
                    op = 8;
                    val = Double.parseDouble(mtxt.getText());
                    mtxt.setText("0");
                } else if (txt.compareTo("←") == 0) {
                    op = 9;
                    val = Double.parseDouble(mtxt.getText());
                    String a = mtxt.getText().substring(0, mtxt.getText().length() - 1);
                    mtxt.setText((a));
                } else if (txt.compareTo(".") == 0) {
                    vol = mtxt.getText();
                    String input = mtxt.getText();
                    char search = '.';
                    int count = 0;
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == search) {
                            count++;
                        }
                    }
                    if (count > 0) {
                        mtxt.setText(vol);
                    } else {
                        mtxt.setText(vol + txt);
                    }

                } else if (txt.compareTo("=") == 0) {
                    if (op == 1) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (v + this.val);
                        ptxt.setText(" " + this.val + "+" + v + " =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 2) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (this.val - v);
                        ptxt.setText(" " + this.val + "-" + v + " =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 3) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (this.val * v);
                        ptxt.setText(" " + v + "*" + this.val + " =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 4) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (this.val / v);
                        ptxt.setText(" " + this.val + "/" + v + " =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 5) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (this.val % v);
                        ptxt.setText(" " + this.val + "%" + v + " =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 6) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (this.val * this.val);
                        ptxt.setText(" " + this.val + "² =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 7) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = (Math.sqrt(this.val));
                        ptxt.setText(" √" + this.val + " =");
                        mtxt.setText(Double.toString(res));
                    } else if (op == 8) {
                        double v = Double.parseDouble(mtxt.getText());
                        double res = this.val * 2.718;
                        ptxt.setText(" " + this.val + "e =");
                        mtxt.setText(Double.toString(res));
                    }
                } else if (mtxt.getText().compareTo("0") == 0) {

                    mtxt.setText(txt);
                } else {
                    mtxt.setText(mtxt.getText() + txt);
                }

            }

        }
    }
}
