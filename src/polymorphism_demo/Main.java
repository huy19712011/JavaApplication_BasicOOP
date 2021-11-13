/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_demo;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Polymorphism");
        
        LibraryManager lib = new LibraryManager();
        lib.getReaders();
        System.out.println(lib.calculate());
        System.out.println("Hello");
    }
    
}
