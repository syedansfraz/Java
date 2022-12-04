package a4p1;
public class BaseplusComissionEmployee {
    private ComissionEmployee info;
    private ComissionEmployee earning;
    public BaseplusComissionEmployee(ComissionEmployee info, double bs)
    {
        this.setInfo(info);
        this.setBaseSale(bs);
    }
    public ComissionEmployee getInfo() {
        return info;
    }

    public void setInfo(ComissionEmployee info) {
        this.info = info;
    }
    private double baseSale;

    public double getBaseSale() {
        return baseSale;
    }
    public void setBaseSale(double bs) {
        if(bs>0)
        this.baseSale = bs;
        else
        this.baseSale=0;
    }
    @Override
    public String toString()
    {
        return String.format("%s\nBase Sale:%.2f", this.getInfo(),this.baseSale);
 
    }
     public void earning()
    {
        System.out.println("Earning with Basic Salary:"+(this.baseSale+(this.getInfo().Earning())));
    }

}
