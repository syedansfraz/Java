package a2q1;
import java.util.Scanner;
public class A2Q1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Circle cal=new Circle();
        Circle cal2 = new Circle();
        System.out.println("Enter Radius:");
        double c1=input.nextDouble();
        cal.setRadius(c1);
        System.out.println("Area:"+cal.getArea()+"\nCIrcumfrence:"+cal.getCir());
        System.out.println("Enter Radius:");
        double c2=input.nextDouble();
        cal2.setRadius(c2);
        System.out.println("Area:"+cal2.getArea()+"\nCircumfrence:"+cal2.getCir());
        
       
        
        
    }
    
}
