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
public class Manager {
    String name;
    String address;
    String phoneNumber;
    int teamSize;
    
    public Manager(String name, String address, String phoneNumber, int teamSize) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.teamSize = teamSize;
    }
    
    void work() {
        System.out.println("I am a manager, i manage team of " + teamSize);
    }
}
