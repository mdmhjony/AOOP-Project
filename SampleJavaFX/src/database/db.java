package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    String url = "jdbc:mysql://localhost:3306/pos";
    String username = "root";
    String password = "";

    public Connection connect(){
        Connection myConn = null;
        try {
            myConn = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            //throw new IllegalStateException("Cannot connect the database!", e);
            System.out.println("Can't Connect to database!!");
        }
        return myConn;
    }



}
