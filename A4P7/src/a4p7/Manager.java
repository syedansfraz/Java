package a4p7;
public class Manager extends Empolyee 
{
    private double golfhours=0.0;

    public Manager(String fname, String lname, double bpay, double whours) {
        
        super(fname, lname, bpay, whours);
        this.golfhours=0.0;
    }
    
    public double getGolfhours() {
        return golfhours;
    }

    public void setGolfhours(double golfhours) {
        this.golfhours = golfhours;
    }
    public void addGolfhours(double hours)
    {
        this.golfhours=hours;
        super.setWhours(this.getWhours()-hours);
        System.out.println("Golf Hours:"+this.golfhours);
    }
}
