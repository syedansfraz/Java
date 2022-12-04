/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtime;

/**
 *
 * @author ans shah55
 */
public class Time {
private int minutes;
private int hours;

 public void setTime(int h, int m){
hours = (h>=0 && h<=24 ? h : 0);
minutes = (m>=0 && m<=60 ? m : 0);
 }
 public void displayTime(){
 System.out.printf("\nCurrent time is: " + "%02d:%02d",hours,minutes);
 } 
 public void displayMinutes(){
hours = hours*60; 
minutes= minutes + hours;
System.out.printf("\nTime in minutes is: %d" , minutes);
} 
}
