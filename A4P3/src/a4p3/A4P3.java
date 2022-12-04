package a4p3;
public class A4P3 {
    public static void main(String[] args) {
        HourlyEmployee e1= new HourlyEmployee("Ans","Shah","BCS45",41.0,120.0);
        System.out.println(e1.toString());
        SalariedEmpolyee e2= new SalariedEmpolyee(13000.0,"Ans","Shah","BCS45");
        System.out.println(e2.toString());
    }
    
}
