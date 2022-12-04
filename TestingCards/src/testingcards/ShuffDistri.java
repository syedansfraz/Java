/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testingcards;
import java.util.Random;
/**
 *
 * @author ans shah55
 */
public class ShuffDistri {
    private final int size=52;
    private Card2 []deck= new Card2[size];
    private int currentcard;
    private Random r = new Random();
    public ShuffDistri()
    {
        String [] face={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String [] suit= {"Hearts","Diamond","Spade","Club"};
        for(int i =0;i<this.size;i++)
        {
            this.deck[i]=new Card2(face[i%13],suit[i/13]);
        }
    }
        public void shuffle()
        {
            for(int i =0;i<this.size;i++)
            {
                int index= r.nextInt(52);
                Card2 temp=this.deck[i];
                this.deck[i]=this.deck[index];
                this.deck[index]=temp;
            }
        }
        public Card2 distribute()
        {
            return this.deck[this.currentcard++];
        }
    }
