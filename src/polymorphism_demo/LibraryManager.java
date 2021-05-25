/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_demo;

import JdbcConnection.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynq
 */
public class LibraryManager {

    private final List<User> listReaders = new ArrayList<>();

    public List<User> getReaders() {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost:3306", "web_student_tracker", "root", "123456");

        try ( Connection connection = dcm.getConnection();  Statement statement = connection.createStatement();) {

            String sql = "SELECT * FROM student";

            try ( ResultSet resultSet = statement.executeQuery(sql);) {
                while (resultSet.next()) {
                    int c = resultSet.getInt("type");

                    if (c == 1) {

                        User user = new Student();
                        user.fillData(resultSet);
                        this.listReaders.add(user);

                    }

                    if (c == 2) {

                        int duration = resultSet.getInt("duration");
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("first_name");
                        String email = resultSet.getString("email");
                        Adult adult = new Adult(duration, id, name, email);

                        this.listReaders.add(adult);

                    }
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listReaders;
    }

    public float calculate() {
        float sum = 0.0f;

        for (User user : this.listReaders) {
            sum = sum + user.calculateFee();
        }

        return sum;

    }

    public void show() {

    }

}
