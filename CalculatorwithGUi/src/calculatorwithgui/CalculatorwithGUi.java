package calculatorwithgui;

import java.awt.Color;
import javax.swing.JFrame;

public class CalculatorwithGUi {

    public static void main(String[] args) {
        Theme one1 = new Theme();
        one1.getContentPane().setBackground(Color.DARK_GRAY);
        one1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        one1.Initilizer();
        one1.setTitle("Calculator");
        one1.setSize(340, 548);
        one1.setLayout(null);
        one1.setVisible(true);

    }

}
