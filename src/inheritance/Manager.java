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
public class Manager extends Employee {

    int teamSize;
    
    public Manager(String name, String address, String phoneNumber, int teamSize) {

        super(name, address, phoneNumber);
        
        this.teamSize = teamSize;
    }
    
    public void work() {
        System.out.println("I am a manager, i manage team of " + teamSize);
    }
}
