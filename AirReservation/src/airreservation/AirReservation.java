package airreservation;

import java.util.Scanner;

public class AirReservation {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Booking pass = new Booking();
        while (true) {
            System.out.println("Press 1 for Seat in First Class and 2 for Economy Class");
            int inp = input.nextInt();
            switch (inp) {
                case 1:
                    pass.first_class();
                    continue;
                case 2:
                    pass.economy_class();
                    continue;
            }
        }
    }
}
