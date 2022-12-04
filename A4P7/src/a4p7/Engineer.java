package a4p7;
public class Engineer extends Empolyee
{
    private double traffichours;
    public Engineer( String fname, String lname, double bpay, double whours) {
        super(fname, lname, bpay, whours);
        this.traffichours =0.0;
    }
    public void addTraffichours(double hours)
    {
        this.traffichours=hours;
        super.setWhours(this.getWhours()-hours);
        System.out.println("Golf Hours:"+this.traffichours);
    }
    public double getTraffichours() {
        return traffichours;
    }
    public void setTraffichours(double traffichours) {
        this.traffichours = traffichours;
    }
    @Override
    public String toString() {
        return (""+super.toString());
    }
}
