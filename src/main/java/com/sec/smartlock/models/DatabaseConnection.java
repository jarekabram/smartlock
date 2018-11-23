package com.sec.smartlock.models;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private Connection connection;

    static
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Unable to load MySQL Driver");
        }
    }

    public void Init() {
        // TODO: do configuration file and insert encryption of password (BCrypt)
        String url = "jdbc:mysql://54.37.232.177/SMART_LOCK";
        try
        {
            connection = DriverManager.getConnection(url, "jarek", "jarek");
            System.out.println ("Database connection established");
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        System.out.println ("fin");
    }
    public void printData()
    {
        try {
            Statement statement = connection.createStatement();
            String command = "SELECT * FROM SMART_LOCK.GUESTS";
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertData(String name, String email, String password)
    {
        System.out.println("name: " + name + " | email: " +  email + " | password: " + password);
        try {
            Statement statement = connection.createStatement();
            String command = "INSERT INTO SMART_LOCK.GUESTS(ID,GUEST_NAME,EMAIL,PASSWORD,LOCK_ID) VALUES (1, \""+name+"\",\""+email+"\",\""+password+"\",1)";
            statement.executeUpdate(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
