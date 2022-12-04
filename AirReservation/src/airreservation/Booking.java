package airreservation;
import java.util.Scanner;
public class Booking {
    boolean seats[] = new boolean[10];
    Scanner inp = new Scanner(System.in);
    public void first_class() {
        int count2 = 0;
        if (checkseats()) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i]) {
                    count2++;
                }
            }
        }
        if (count2 == 5) {
            System.out.println("First Class is full");
            System.out.println("Press 2 to go on econmy class");
            int accept_choice = inp.nextInt();
            if (accept_choice == 2) {
                economy_class();
            }
        } else {
            System.out.println("Selecct Seat from 1-5");
            int seat = inp.nextInt();
            if (seats[seat - 1]) {
                System.out.println("This seat is already booked");
                return;
            } else {
                seats[seat - 1] = true;
                display_info();
            }
        }
    }
    public void economy_class() {
        if (checkseats()) {
            int count2 = 4;
            for (int i = 5; i < seats.length; i++) {
                if (seats[i]) {
                    count2++;
                }
            }
            if (count2 == 10) {
                System.out.println("Econmy class is full");
                System.out.println("Press 1 to book in firstclass");
                int choice = inp.nextInt();
                if (choice == 1) {
                    first_class();
                }
            } else {
                System.out.println("Enter the seat no from 6-10 in econmy class");
                int seat_no = inp.nextInt();
                if (seats[seat_no - 1]) {
                    System.out.println("The seat is already Booked");
                    return;
                } else {
                    seats[seat_no - 1] = true;
                    display_info();
                }
            }
        }
    }

    public void display_info() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i]);
        }
    }

    public boolean checkseats() {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                count++;
            }
        }
        if (count == 10) {
            System.out.println("Next flight leaves in 3 hours");
            return false;
        } else {
            return true;
        }
    }
}
