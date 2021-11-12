package Operators;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
   private static Connection conn;


    public static void connectToDB (String url, String username, String pass){


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, username, pass);
            System.out.println("Connected");

        } catch (SQLException e) {
            throw new Error("Invalid parameters", e);

        }
    }


    public static void disconnectFromDB(){
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Disconnected");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
