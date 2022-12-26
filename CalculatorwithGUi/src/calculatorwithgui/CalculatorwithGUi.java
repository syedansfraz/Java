package calculatorwithgui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CalculatorwithGUi {

    public static void main(String[] args) {
        Theme one = new Theme();
        one.getContentPane().setBackground(Color.DARK_GRAY);
        one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        one.setTitle("Calculator");
        one.setSize(340, 500);
        one.setLayout(null);
        one.Initilizer();
    }

}
