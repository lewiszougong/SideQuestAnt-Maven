package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static Connection connect() {
        Connection con=null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:testlitedb.db");
            System.out.println("Connected!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
        }
        return con;
    }

}
