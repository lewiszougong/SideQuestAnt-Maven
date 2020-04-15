package com.quiz;

import java.sql.*;

public class CRUD {
    public static void insert(int id, String name, int days){
        Connection con = DbConnect.connect();
        PreparedStatement ps =null;
        try {
            String sql= "INSERT INTO users(id, name, days) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,days);
            ps.execute();
            System.out.println("inserted");
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    public static Employees retrieve(int ID) throws SQLException{
        Connection con = DbConnect.connect();
        Employees employees =  new Employees();
        ResultSet ps =null;

        String sql= "SELECT * FROM users WHERE id = "+ID;
        Statement stat= con.createStatement();
        ps = stat.executeQuery(sql);
        ps.next();
        //ps.getInt("id");
        employees.setId(ID);
        employees.setName(ps.getString("name"));
        employees.setDays(ps.getString("days"));
        ps.close();
        return employees;
    }
    public static void modify(int ID, String name , int days)throws SQLException{
        String sql = "UPDATE users SET name ='"+name+
                "', days='"+days+"' WHERE id = "+ID;
        Statement stat= DbConnect.connect().createStatement();
        stat.executeUpdate(sql);
        System.out.println("Updated");
    }
    public static void remove(int ID)throws SQLException{
        String sql= "DELETE FROM users WHERE id IN ("+ID+")";
        Statement stat= DbConnect.connect().createStatement();
        stat.executeUpdate(sql);
        System.out.println("Deleted");
    }
    public static void removeAll()throws SQLException{
        String sql= "DELETE FROM users";
        Statement stat= DbConnect.connect().createStatement();
        stat.executeUpdate(sql);
    }
}
