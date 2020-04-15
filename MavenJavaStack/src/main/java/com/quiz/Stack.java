package com.quiz;


import java.sql.SQLException;

import static com.quiz.CRUD.*;

public class Stack {
    int top=0;

    public void push(int id , String name, int dayLeft){
        // add new employees with number of annual leave left

        insert(id, name, dayLeft);
        top++;

    }

    public void pop() throws SQLException {
        //delete employee
        if (top==0)
            System.out.println("No Data");
        else {
            remove(top);
            top--;
        }
    }
    public void peek() throws SQLException {
        if (top == 0)
            System.out.println("No Data");
        else
            System.out.println(retrieve(top));

    }
    public void pose(String name, int days) throws SQLException {
        if (top == 0)
            System.out.println("No Data");
        else
            modify(top, name, days);
    }

}
