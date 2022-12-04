package a4p1;
public class A4P1 {
    public static void main(String[] args) {
        ComissionEmployee a=new ComissionEmployee("Ans","Shah","BCS445",60000.0,0.07);
        BaseplusComissionEmployee b= new BaseplusComissionEmployee(a,10000.0);
        System.out.println(a.toString());
        System.out.println("Earning:"+a.Earning());
        System.out.println("---------------");
        System.out.println(b.toString());
        b.earning();
    }
    
}
