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
public class Student extends User {

    private String studentId;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, int id, String name, String email) {
        super(id, name, email);
        this.studentId = studentId;
    }

    public Student(String studentId, String name, String email) {
        super(name, email);
        this.studentId = studentId;
    }

    @Override
    public float calculateFee() {

        return 20_000f;
    }

    @Override
    public User fillData(ResultSet resultSet) {
        Student student = new Student();
        try {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("first_name");
            String email = resultSet.getString("email");

            student = new Student(email, name, email);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;

    }

}
