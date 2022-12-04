package a4p3;
public class HourlyEmployee extends Employee{
    private double hours;
    private double wages;

public HourlyEmployee(String firstname, String lastname, String ssn, double hours, double wages){
super.setFn(firstname);
super.setLn(lastname);
super.setId(ssn);
this.hours=hours;
this.wages=wages;
}

public double getHours() {
return hours;
}

public void setHours(double hours) {
if(hours>=0 || hours <= 168) {
this.hours = hours;
}
}

public double getWages() {
return wages;
}

public void setWages(double wages) {
if(wages>=0) {
this.wages = wages;
}
}

public double totalEarning(){
if(this.getHours()<=40){
return (this.getHours() * this.getWages());
}else{
double hour = this.getHours() - 40;
double total = (40 * this.getWages()) + hour * (this.wages * 1.5);
return total;
}
}

@Override
public String toString() {
return String.format(""+super.toString()+"\nHours Worked:"+ this.getHours() + "\nWages per hour: " + this.getWages() + "\nTotal wages: " + this.totalEarning());
}
}
