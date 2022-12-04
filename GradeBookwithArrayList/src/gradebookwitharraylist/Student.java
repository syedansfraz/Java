/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradebookwitharraylist;
import java.util.ArrayList;
/**
 *
 * @author ans shah55
 */
public class Student {
   private String name;
   private ArrayList<Double> marks;
   
   public Student(String a,ArrayList<Double> b)
   {
       this.setName(a);
       this.setMarks(b);
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }
   public String toString()
    {
        String str="";
        str+=this.getName()+"    ";
        for(int i=0 ; i<this.marks.size(); i++)
        {
            str+=this.marks.get(i)+"    ";
        }
        return str;
    }
}
