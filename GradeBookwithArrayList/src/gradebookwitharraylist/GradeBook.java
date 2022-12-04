/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradebookwitharraylist;

/**
 *
 * @author ans shah55
 */
public class GradeBook {
     private String courseTitle;
    private Student [] std;

    public GradeBook(String courseTitle, Student[] std) {
        this.courseTitle = courseTitle;
        this.std = std;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Student[] getStd() {
        return std;
    }

    public void setStd(Student[] std) {
        this.std = std;
    }
    public void processGrade()
             {
        System.out.println("Welcome to the GradeBook of "+this.getCourseTitle());
        printMarks();
    }
    public void printMarks()
    {
        for(int i=0; i<this.std.length; i++)
        System.out.println(this.std[i].toString());
    }

}
