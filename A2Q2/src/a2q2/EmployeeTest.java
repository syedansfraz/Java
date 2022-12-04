package a2q2;
public class EmployeeTest {
    private String First;
    private String Last;
    private double Salary;
    public EmployeeTest(String First,String Last,double Salary)
    {
        this.First=First;
        this.Last=Last;
        this.Salary=Salary;
    }
    public void setFrist(String Frist)
    {
        this.First=Frist;
    }
    public String getFirst(String First)
    {
        return this.First;
    }
    public void setLast(String Last)
    {
        this.Last=Last;
    }
    public String getlast(String Last)
    {
        return this.Last;
    }
    public void setSalary(double Salary)
    {
        this.Salary=Salary;
    }
    public double getSalary()
    {
        return this.Salary;
    }
    
}
