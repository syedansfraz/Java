package a4p7;
public class Empolyee {
    private String fname;
    private String lname;
    private int id;
    private double bpay;
    private double whours;
    private static int count;
    private static double pay;
    public Empolyee(String fname, String lname, double bpay, double whours) {
        this.setWhours(0.0);
        this.fname = fname;
        this.lname = lname;
        this.bpay = bpay;
        this.whours = whours;
        this.setCount(++count);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Empolyee.count = count;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getBpay() {
        return bpay;
    }

    public void setBpay(double bpay) {
        this.bpay = bpay;
    }

    public double getWhours() {
        return whours;
    }

    public void setWhours(double whours) {
        this.whours = whours;
    }
    public double weeklypay()
    {
        System.out.println("Worked hours without Additional Hours:"+this.whours);
        pay= this.bpay*this.whours;
        return pay;
    }
    @Override
    public String toString() {
        return ("Id:"+this.count+"\nFirst Name:"+this.fname+"\nLast Name:"+this.lname+"\nPay/Hour:"+this.bpay+"\nWorked hours with Additional Hours:"+this.whours);
    }
    
}
