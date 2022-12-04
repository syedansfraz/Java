package a4p4;
public class A4P4 {
    public static void main(String[] args) {
        PrintBook a =new PrintBook("E-Books","Poetry 19A4","GHUMAN",2007,"John Elia");
        System.out.println(a.toString());
        AudioBook b=new AudioBook("14.6 MB","3.13 Sec","Mustansar Ali","SHAYAD",2007,"John Elia");
        System.out.println(b.toString());
    }
    
}
