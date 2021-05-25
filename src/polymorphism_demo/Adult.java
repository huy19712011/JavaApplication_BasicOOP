/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_demo;

import java.sql.ResultSet;

/**
 *
 * @author huynq
 */
public class Adult extends User {

    private int duration;
    private float unitPrice = 50_000f;

    public Adult(int duration, int id, String name, String email) {
        super(id, name, email);
        this.duration = duration;
    }

    @Override
    public float calculateFee() {

        return this.duration * this.unitPrice;

    }

    @Override
    public User fillData(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
