package a4p3;
public class Employee extends Object{
    private String fn;
    private String ln;
    private String id;

    public Employee(String fn, String ln, String id) {
        this.fn = fn;
        this.ln = ln;
        this.id = id;
    }
    public Employee()
    {
        
    }
    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String toString()
    {
        return String.format("First Name:%s\nLast Name:%s\nId:%s", this.getFn(),this.getLn(),this.getId());
    }
}
