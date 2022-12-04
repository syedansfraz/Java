package a4p7;
public class FooCorporation {
    private Manager m1;
    private Manager m2;
    private Engineer e1;
    private Engineer e2;
    private Engineer e3;
    private Engineer e4;
    public FooCorporation(Manager m1, Manager m2, Engineer e1, Engineer e2, Engineer e3, Engineer e4) {
        this.m1 = m1;
        this.m2 = m2;
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
        this.e4 = e4;
    }
    public void totalCost()
    {
        System.out.println("---------------------------------------");
        System.out.println("    \t    Information Cell");
        System.out.println("---------------------------------------");
        double cost= m1.weeklypay()+m2.weeklypay()+e1.weeklypay()+e2.weeklypay()+e3.weeklypay()+e4.weeklypay();
        System.out.println("***Total Expenses of Corporation Per Week***");
        System.out.println("\t\t="+cost);
    }
}
