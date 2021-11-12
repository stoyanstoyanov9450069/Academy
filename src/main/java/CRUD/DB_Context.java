package CRUD;

import Operators.Connector;
import Entities.*;

import java.sql.*;
import java.util.ArrayList;

public class DB_Context {

    public static void insertStudentsRecords(ArrayList<Student> students) {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@92.247.131.11:41521", "BKOSTOV_SCHOOLDB"
                    , "123456");
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO Students " +
                    "(FirstName, MiddleName, LastName, Email, TelephoneNumber, Age) "
                    + "VALUES (?,?,?,?,?,?)");

            for(Student student : students){
                preparedStatement.setString(1, student.getFirstName());
                preparedStatement.setString(2, student.getMiddleName());
                preparedStatement.setString(3, student.getLastName());
                preparedStatement.setString(4, student.getEmail());
                preparedStatement.setString(5, "+359884225252");
                preparedStatement.setInt(6, student.getAge());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            Connector.disconnectFromDB();
        }

    }

    public static void slectStudentsRecords() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@92.247.131.11:41521", "BKOSTOV_SCHOOLDB"
                    , "123456");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while(rs.next()){
                //Display values
                System.out.print(rs.getString("FirstName") + " ");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            Connector.disconnectFromDB();
        }

    }


}

