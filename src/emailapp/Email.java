/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author huynq
 */
public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    
    // Constructor for firstName, lastName
    public Email(String firstName, String lastName) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        
        // call a method asking for the department -- return the department
        this.department = this.inputDepartment();
        System.out.println("Department: " + this.department);
        
    }
    // Ask for the department
    private String inputDepartment() {
        
        System.out.println("Choose Department\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter: ");
        
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        if (dep == 1) { return "sales"; }
        else if (dep == 2) { return "development"; }
        else if (dep == 3) { return "accounting"; }
        else { return "";}
    }
    
    // Generate a random password
    
    // Set the mailbox capacity
    
    // Set the alternate email
    
    // Change the password
    
    
            
    
}
