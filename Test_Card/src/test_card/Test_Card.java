/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_card;

/**
 *
 * @author ans shah55
 */
public class Test_Card {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckofCards d=new DeckofCards();
        d.shuffle();
        for(int i=1; i<=52; i++)
        {
        System.out.print(d.dealCard()+"    ");
        if(i%5==0)
        {
           System.out.println();
        }
        }
}
}