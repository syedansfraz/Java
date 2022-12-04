package a2q1;
public class Circle {
    private double radius;
    public void setRadius(double str)
    {
        radius = str;
    }
//    public double getRadius()
//    {
//        return radius;
//    }
    public double getArea()
    {
//        double a;
//        a=(3.14 * radius) * radius;
//        System.out.println("Area"+a);
        return (3.14 * radius) * radius;
    }
    public double getCir()
    {
        return (2*3.14)*radius;
    }
}