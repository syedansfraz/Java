/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradebookwitharraylist;
import java.util.ArrayList;
/**
 *
 * @author ans shah55
 */
public class GradeBookwithArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> list1= new ArrayList<Double>();
        ArrayList<Double> list2= new ArrayList<Double>();
        list1.add(22.4);
        list1.add(44.4);
        list1.add(77.6);
        list2.add(33.0);
        list2.add(49.0);
        Student [] arr=new Student[5];
        arr[0]= new Student ("Ans",list1);
        arr[1]=new Student ("Ali",list1);
        arr[2]=new Student ("Hassan",list1);
        arr[3]=new Student ("Zawar",list2);
        arr[4]=new Student ("Hamza",list2);
        GradeBook b=new GradeBook("CSC-103 PF",arr);
        b.processGrade();

    }
    
}
