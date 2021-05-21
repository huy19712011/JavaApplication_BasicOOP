/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcConnectionPool;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
       
        try {
            System.out.println("Ok");
            
            Connection connection = DatabaseConnectionPoolManager.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
            }
            
            
        } catch (Exception ex) {
            System.out.println("error...");
        }
    }
}
