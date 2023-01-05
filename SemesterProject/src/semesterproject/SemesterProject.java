package semesterproject;

import java.awt.Color;
import javax.swing.JFrame;

public class SemesterProject {
    public static void main(String[] args) {
//         userside ok=new userside();
//        ok.initilizer();
        App1 one1 = new App1();
        one1.setSize(500, 678);
        one1.getContentPane().setBackground(Color.WHITE);
        one1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        one1.Initilizer();
        one1.setTitle("Emirates");
        one1.setLayout(null);
        one1.setVisible(true);
    }   
}