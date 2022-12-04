package a4p1;
public class ComissionEmployee extends Employee
{
    private String firstName;
    private String lastName;
    private String empID;
    private double grossSale;
    private double commRate;
    public ComissionEmployee(String fn, String ln, String id, double gs, double cr)
    {
       super(fn,ln,id);
       this.grossSale=gs;
       this.commRate=cr;
    }
    @Override
    public String toString()
    {
           return String.format("%s\nGross Scale:%f\nComission Rate:%f",super.toString(),this.grossSale,this.commRate);
    }
    public double Earning()
    {
        return this.grossSale*this.commRate;
    }
}
