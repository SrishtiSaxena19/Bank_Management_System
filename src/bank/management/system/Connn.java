package bank.management.system;
//import java.sql.Connection;
//
//import java.sql.DriverManager;
//import java.sql.Statement;

import java.sql.*;


public class Connn {
    Connection connection;
    Statement statement;

    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "12345678");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
