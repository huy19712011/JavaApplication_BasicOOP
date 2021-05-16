/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee p1 = new Programmer("John", "Address 1", "Phone 1", new String[] {"Java"});
        p1.work();
        
        
        Employee m1 = new Manager("Mike", "Address 2", "Phone 2", 4);
        m1.work();
        
        IDancer d1 = new Programmer("Mary", "Address 3", "Phone 3", new String[] {"Java"});
        d1.dancer();
        
        IRunner r1 = new Programmer("Jack", "Address 4", "Phone 4", new String[] {"Java"});
        r1.run();
        r1.show();
        
        r1 = new Carpenter();
        r1.run();
        System.out.println(r1.i);
        
    }
    
}
