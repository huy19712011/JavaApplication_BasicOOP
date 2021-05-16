/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcConnection;
import java.sql.*;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Connecting to MySQL");
        
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost:3306", "web_student_tracker", "root", "123456");
        
        try {
            
            Connection connection = dcm.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
