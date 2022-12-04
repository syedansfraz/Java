/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testingcards;

/**
 *
 * @author ans shah55
 */
public class TestingCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShuffDistri a = new ShuffDistri();
        a.shuffle();
        for(int i=1; i<=52; i++)
        {
        System.out.print(a.distribute()+"        ");
        if(i%5==0)
        {
           System.out.println();
        }
        }
    }
    
}
