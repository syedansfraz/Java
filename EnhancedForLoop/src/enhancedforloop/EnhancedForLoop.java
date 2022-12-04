/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enhancedforloop;

/**
 *
 * @author ans shah55
 */
public class EnhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                sumValue(6.6);
        sumValue(6.7,66.5);
        sumValue(56.8,88.8,66.7,55.6);
        sumValue(56.8,88.8,66.7,55.6,56.8,88.8,66.7,55.6,56.8,88.8,66.7,55.6,56.8,88.8,66.7,55.6,56.8,88.8,66.7,55.6,56.8,88.8,66.7,55.6);

           }
    
    public static void sumValue(double... var)
    {
        double s=0.0;
        for(double itm:var)
        {
            s+=itm;
        }
        System.out.println("Sum  "+s);
    }
    public static void printArray(int [] t)
    {
        int s=0;
        for(int itm:t)
        {
            s+=itm;
            System.out.printf("%d ",itm);
        }
        System.out.println("Sum  "+s);
     /*   for(int i=0; i<t.length; i++)
        {
            System.out.printf("%d  ",t[i]);
        }*/}
    

    }
    
