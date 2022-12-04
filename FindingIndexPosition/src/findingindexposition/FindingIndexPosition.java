/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findingindexposition;

/**
 *
 * @author ans shah55
 */
public class FindingIndexPosition {
    public static int findIndex(int []my_array,int a)
    {
        for (int i =0;i<my_array.length;i++)
        {
            if(my_array[i]==a)
            {
                return i;
            }
            
               
            
        }
        return -1;
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        int[] my_array = {25, 14, 59, 15, 36, 56, 77, 18, 29, 49,50};
      System.out.println("Index position of 25 is: " + findIndex(my_array, 99));
      System.out.println("Index position of 77 is: " + findIndex(my_array, 50));
       }
    }
