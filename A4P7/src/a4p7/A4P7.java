package a4p7;
public class A4P7 {
    public static void main(String[] args) {
        Manager a=new Manager ("John","McMillan",120,45);
        System.out.println(a.toString());
        a.addGolfhours(10.0);
        System.out.println("Weekly Pay without additional Hours:"+a.weeklypay());
        Manager b=new Manager ("Melissa","Montero",255,55);
        System.out.println(b.toString());
        b.addGolfhours(5.0);
        System.out.println("Weekly Pay without additional Hours:"+b.weeklypay());
        Engineer c=new Engineer ("Eddy","Lehman",220,70);
        System.out.println(c.toString());
        c.addTraffichours(8.0);
        System.out.println("Weekly Pay without additional Hours:"+c.weeklypay());
        Engineer d=new Engineer ("Philip","Smith",124.50,42.0);
        System.out.println(d.toString());
        d.addTraffichours(12.0);
        System.out.println("Weekly Pay without additional Hours:"+d.weeklypay());
        Engineer e=new Engineer ("Adam","Spencer",248,38);
        System.out.println(e.toString());
        e.addTraffichours(5.0);
        System.out.println("Weekly Pay without additional Hours:"+e.weeklypay());
        Engineer f=new Engineer ("Sofia","Stevenson ",320,44);
        System.out.println(f.toString());
        f.addTraffichours(7.0);
        System.out.println("Weekly Pay without additional Hours:"+f.weeklypay());
        FooCorporation January= new FooCorporation(a,b,c,d,e,f);
        January.totalCost(); 
    }
    
}
