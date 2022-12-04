package rna.to.dna;
import java.util.Scanner;
public class RNAToDNA {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Rna");
        String s1=input.nextLine();
        String replaceString=s1.replace('a','U')
                .replace('t', 'A')
                .replace('c','G')
                .replace('g', 'C')
                .replace('A','U')
                .replace('T', 'A')
                .replace('C','G')
                .replace('G', 'C'); 
        System.out.println(replaceString);  
}
} 
