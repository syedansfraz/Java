/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2q3;

/**
 *
 * @author ans shah55
 */
public class Date {
    private int month;
    private int day;
    private int year;
    public Date(int month,int day,int year)
    {
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public void setMonth(int str)
    {
        this.month=str;
    }
    public int getMonth()
    {
        return this.month;
        }
    public void setDay(int str)
    {
        this.day=str;
    }
    public int getDay()
    {
        return this.day;
    }
    public void setYear(int str)
    {
        this.year=str;
    }
    public int getYear()
    {
        return this.year;
    }
    public void DisplayDate()
    {
        System.out.println(""+this.day+"/"+this.month+"/"+this.year);
    }
    
}

