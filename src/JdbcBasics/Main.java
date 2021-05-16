/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello JDBC");
        loadData();
    }

    public static void loadData() {

        String url = "jdbc:mysql://localhost:3306/web_student_tracker";
        String user = "root";
        String password = "123456";

//        try {
//            Class.forName("com.mysql.cj.jdbc.Drive");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        try {

            Connection myConn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM student";

            Statement mySttm = myConn.createStatement();

            ResultSet myRs = mySttm.executeQuery(sql);

            while (myRs.next()) {
                String email = myRs.getString("email");
                System.out.println(email);
            }

        } catch (SQLException ex) {
            System.out.println("Can not connect to database");
        }
    }

}
