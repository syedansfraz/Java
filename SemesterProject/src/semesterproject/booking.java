package semesterproject;

import java.awt.Color;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import static semesterproject.flight.seats;

public class booking extends JFrame{
    public booking()
    {
        
        
    }
    static boolean[] seats = new boolean[20];
          JLabel label1;
    ImageIcon image;
      private int count_2;
     public void first_class() {
        if (checkSeats()) {
            count_2 = 0;
            for (int i = 0; i < 10; i++) // in index 0-9 first class and 10-19 econmy class
            {
                if (seats[i] == true)
                    count_2++;

            }
            if (count_2 == 10) {
                JOptionPane.showMessageDialog(null, "First class is full");

                int accept_choice = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Enter 2 to book in economy class."));
                if (accept_choice == 2) {
                    econmy_class();
                }
            } else {

                int seat_no = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter seat no."));
                if (seat_no >= 1 && seat_no <= 10) {
                    if (seats[seat_no - 1] == true) {
                        JOptionPane.showMessageDialog(null, "The seat is already Booked");

                    } else {
                        seats[seat_no - 1] = true;
                    }
                } else
                    JOptionPane.showMessageDialog(null, "Enter correct seat no.");

            }
        }
    }

    public void econmy_class() {
        if (checkSeats()) {
            count_2 = 0;
            for (int i = 10; i < seats.length; i++) // in index 0-9 econmy class and 10-19 first class
            {
                if (seats[i] == true)
                    count_2++;
            }
            if (count_2 == 10) {
                JOptionPane.showMessageDialog(null, "Econmy class is full");

                int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to book in first class."));
                if (choice == 1) {
                    first_class();
                }
            } else {

                int seat_no = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter seat no."));
                if (seat_no >= 11 && seat_no <= 20) {
                    if (seats[seat_no - 1] == true) {
                        JOptionPane.showMessageDialog(null, "The seat is already Booked");

                    } else {
                        seats[seat_no - 1] = true;

                    }
                } else
                    JOptionPane.showMessageDialog(null, "Enter correct seat no.");

            }
        }

    }
    public boolean checkSeats() {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == true)
                count++;
        }
        if (count == 20) {
            JOptionPane.showMessageDialog(null, "Next flight leaves in 3 hours");
            return false;
        } else
            return true;
    }
    public void display_info() {

        
        ImageIcon img;
          img = new ImageIcon("image/seatsBG.jpg");
        
        image = new ImageIcon("images/seat.png");
        JFrame ff = new JFrame("Seats");
        JLabel seatsBG = new JLabel();
        seatsBG.setBounds(0,0,300,700);
        seatsBG.setIcon(img);
        seatsBG.setOpaque(false);
        ff.setBounds(500, 50, 200, 550);
        ff.getContentPane().setBackground(Color.WHITE);
        
        
        ff.setVisible(true);
        ff.setResizable(false);

        for (int i = 0; i < 20; i++) {

            label1 = new JLabel();

            label1.setBounds(10, i* 25, 60, 40);
            label1.setForeground(Color.red);
//            label1.setForeground(Color.BLACK);
            label1.setLayout(null);
            label1.setIcon(image);
            ff.add(label1);
            if (seats[i] == true) {

                label1.setText((i+1)+"B");
                 try
                {
//                file=Flight.txt;
                FileWriter file=new FileWriter("Filled.txt",true);
                file.write(label1.getText()+" ");
                file.close();
                }
                catch(Exception ex)
                {
                   System.out.println(ex.getMessage());
                }

            } else if (seats[i] == false) {
                label1.setText((i+1)+"A");
//                 try
//                {
////                file=Flight.txt;
//
//                FileWriter file=new FileWriter("unfilled.txt",true);
//                file.close();
//                }
//                catch(Exception ex)
//                {
//                   System.out.println(ex.getMessage());
//                }

            }
            ff.add(seatsBG);
        }

    }
    
}
