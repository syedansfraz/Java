/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_empp;

/**
 *
 * @author ans shah55
 */
public class Date {
    private int day, month, year; 
    public Date(int d, int m, int y)
    {
        this.setDay(d);
        this.setMonth(m);
        this.setYear(y);
    }
    public Date ()
    {
        this(1,1,1);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
public int getMonth() {
        return month;
    }

    public void setMonth(int month) 
    {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString()
    {
        return String.format("%02d / %02d / %04d", this.getDay(),this.getMonth(),this.getYear());
    }
}
