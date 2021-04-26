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
public class Programmer {
    String name;
    String address;
    String phoneNumber;
    String [] programmingLanguages;
    
    public Programmer(String name, String address, String phoneNumber, String[] programmingLanguages) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.programmingLanguages = programmingLanguages;
    }
    
    void work() {
        System.out.println("I am a programmer, i code...");
    }
    
}
