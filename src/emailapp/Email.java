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
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySufix = "bkacad.edu.vn";
    
    // Constructor for firstName, lastName
    public Email(String firstName, String lastName) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        
        // call a method asking for the department -- return the department
        this.department = this.inputDepartment();
        System.out.println("Department: " + this.department);
        
        // call a method that returns a random password
        this.password = randomPassword(10);
        System.out.println("Your password is: " + this.password);
        
        // combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySufix;
        System.out.println("Your email: " + email);
        
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
    private String randomPassword(int length) {
        
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789!@#$%";
        
        char[] password = new char[length];
        for (int i = 0; i < length; ++i) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    // Set the mailbox capacity
    
    // Set the alternate email
    
    // Change the password
    
    
            
    
}
