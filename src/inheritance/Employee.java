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
public class Employee {
    String name;
    String address;
    String phoneNumber;

    public Employee(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public void work() {
        System.out.println("I am an Employee, i do something");
    }
}
