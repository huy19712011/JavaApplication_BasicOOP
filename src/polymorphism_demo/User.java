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
public abstract class User {

    private int id;
    private String name;
    private String email;

    public User() {
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String email) {

    }

    public abstract float calculateFee();

    public abstract User fillData(ResultSet resultSet); // read data from database, fill into object

}
