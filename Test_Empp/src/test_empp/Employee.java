/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_empp;

/**
 *
 * @author ans shah55
 */
public class Employee {
     private String fName;
    private String lName;
    private Date dob;
    private Date doj;

    public Employee(String fn, String ln, Date db, Date dj)
    {
        this.setfName(fn);
        this.setlName(ln);
        this.setDob(db);
        this.setDoj(dj);
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public String toString()
    {
        return String.format("First Name: %s\nLast Name: %s\nDate of Birth: %s\nDate of Joining: %s", this.getfName(),this.getlName(),this.getDob().toString(),this.getDoj().toString());
    }
}
