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
public class Carpenter extends Worker implements IRunner {
    
    @Override
    public void doWork() {
        System.out.println("I create table");
    }

    @Override
    public void run() {
        System.out.println("Carpenter is running");
    }
    
    
}
