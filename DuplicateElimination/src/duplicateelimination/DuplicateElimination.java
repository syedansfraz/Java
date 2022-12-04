/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicateelimination;
import java.util.Scanner;
/**
 *
 * @author ans shah55
 */
public class DuplicateElimination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int [] inputs= new int[10];
//        for(int i = 0; i < inputs.length; i++){
//			inputs[i] = -1;}
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            inputs[i]=input.nextInt();
        }
        for(int i = 0; i < 10; i++){
            for(int j=i+1;j<10;j++){
				if(inputs[i] == inputs[j])
					inputs[j] = -1;
			}
        }
		// Displaying array with removed duplicates
		for(int value : inputs){
			if(value != -1)
				System.out.print(value + " ");
    }
    
    }
}
