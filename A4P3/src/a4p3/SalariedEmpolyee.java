/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4p3;

/**
 *
 * @author ans shah55
 */
public class SalariedEmpolyee extends Employee
{
    private double weeklysal;

    public SalariedEmpolyee(double weeklysal, String fn, String ln, String id) {
        super(fn, ln, id);
        this.weeklysal = weeklysal;
    }

    public double getWeeklysal() {
        return weeklysal;
    }

    public void setWeeklysal(double weeklysal) {
        if(weeklysal>0.0)
        this.weeklysal = weeklysal;
        else
            this.weeklysal=0.0;
    }
    public String toString()
{
return String.format( "%s\nWeekly Salaray:%f",super.toString(),this.getWeeklysal());
}
    
    
}
