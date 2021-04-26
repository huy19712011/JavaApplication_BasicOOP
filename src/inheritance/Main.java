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
        Programmer p1 = new Programmer("John", "Address 1", "Phone 1", new String[] {"Java"});
        p1.work();
        
        Manager m1 = new Manager("Mike", "Address 2", "Phone 2", 4);
        m1.work();
    }
    
}
