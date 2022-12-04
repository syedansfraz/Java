/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_empp;

/**
 *
 * @author ans shah55
 */
public class Test_Empp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date db=new Date(12,12,1980);
        Date dj=new Date(4,4,2002);
        Employee e=new Employee("Ali","Khan",db,dj);
        System.out.println(e);
    }
   
}
