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
public interface IRunner {
    void run();
    
    default void show() {
        System.out.println("I show code");
    }
}
