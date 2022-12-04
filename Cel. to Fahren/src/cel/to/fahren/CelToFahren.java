/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cel.to.fahren;
import java.util.Scanner;
/**
 *
 * @author ans shah55
 */
public class CelToFahren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double a,F;
        System.out.println("Temperature in Celsius");
        a=input.nextDouble();
        F = 1.8 * a +32;
        System.out.printf("Temperature in Fahrenheit = %.2f",F);
        
        
        
    }
    
}
