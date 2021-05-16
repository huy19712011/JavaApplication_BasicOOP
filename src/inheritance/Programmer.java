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
public class Programmer extends Employee implements IRunner, IDancer {

    // Programmer specific fields
    String [] programmingLanguages;
    
    // Constructor
    public Programmer(String name, String address, String phoneNumber, String[] programmingLanguages) {
        
        super(name, address, phoneNumber);
        
        this.programmingLanguages = programmingLanguages;
    }
    
    // Overridden method
    public void work() {
        System.out.println("I am a programmer, i code...");
    }

    @Override
    public void run() {
        System.out.println("Programmer is running");
    }

    @Override
    public void dancer() {
        System.out.println("Programmer is dancing");
    }

    int i = 20;
    
}
