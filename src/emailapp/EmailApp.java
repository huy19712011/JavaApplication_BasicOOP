/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

/**
 *
 * @author huynq
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Email em1 = new Email("John", "Doe");
        
        em1.setAlternateEmail("new@gmail.com");
        System.out.println(em1.getAlternateEmail());
    }

}
