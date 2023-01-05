package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SecondPage extends JFrame implements ActionListener {
            JFrame frame = new JFrame();
            

        public SecondPage()
    {
        
        initilizer2();
    }

    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    public JLabel lbIcon=new JLabel();
    Font f=new Font("Times New Roman",Font.BOLD,50);
    public JLabel fly =new JLabel();

    public void initilizer2()
    {
        Image icon = new ImageIcon(this.getClass().getResource("/front.png")).getImage();
        this.setIconImage(icon);
        
        fly.setText("Fly Emirates");
        fly.setBackground(Color.WHITE);
        fly.setForeground(Color.red);
        fly.setBounds(120,50,300,200);
        fly.setFont(f);
        frame.add(fly);
        frame.setSize(500, 678);
        frame.getContentPane().setBackground(Color.WHITE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Emirates");
        frame.setLayout(null);

        frame.setVisible(true);


        userLabel.setBounds(150, 270, 100, 30);
        userLabel.setForeground(Color.black);
        frame.add(userLabel);
        
        passwordLabel.setBounds(150, 320, 100, 30);
        passwordLabel.setForeground(Color.black);
        frame.add(passwordLabel);
        
        
        userTextField.setBounds(225, 270, 150, 30);
        frame.add(userTextField);
        passwordField.setBounds(225, 320, 150, 30);
        frame.add(passwordField);


        showPassword.setBounds(230, 360, 150, 30);
        showPassword.setForeground(Color.black);
        showPassword.setOpaque(false);
        showPassword.setFocusable(false);
        frame.add(showPassword);
        

        loginButton.setBounds(150, 420, 100, 30);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(Color.BLACK);
        loginButton.setFocusable(false);
        frame.add(loginButton);

        resetButton.setBounds(270, 420, 100, 30);
        resetButton.setForeground(Color.white);
        resetButton.setBackground(Color.black);
        resetButton.setFocusable(false);
        frame.add(resetButton);
        
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//       try {
            if (e.getSource() == loginButton) {
                String userText = userTextField.getText();
                String pwdText = String.valueOf(passwordField.getPassword());
                if (userText.equals("admin") && pwdText.equals("admin")) {
                    JOptionPane.showMessageDialog(loginButton, "Login Successful");
                    frame.dispose();
                  adminside b=new adminside();
                  b.initilizer();

                  

                } else {
                    JOptionPane.showMessageDialog(loginButton, "Invalid Username or Password");
                }

            }
//        } catch (Exception f) {
//            System.out.println(f.getMessage());
//        }
        // Coding Part of RESET button
            else if (e.getSource() == resetButton)

        {
            userTextField.setText("");
            passwordField.setText("");
        }
        // Coding Part of showPassword JCheckBox
       else if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
    
}
