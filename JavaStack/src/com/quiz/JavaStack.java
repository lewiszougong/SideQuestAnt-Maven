package com.quiz;

import java.sql.SQLException;

import static com.quiz.CRUD.removeAll;
import static com.quiz.InputConverter.input;
import static java.lang.Integer.parseInt;

public class JavaStack {

    public static void main(String[] args) throws SQLException{
        removeAll();
        Stack stack = new Stack();
        boolean condition=true;
        while (condition) {
            String[] split = input();
            //input format: "push" 3
            switch (split[0]) {
                case "push":
                    int id = parseInt(split[1]);
                    int days = parseInt(split[3]);
                    stack.push(id, split[2], days);
                    //stack.peek();
                    break;
                case "peek":
                    stack.peek();
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "pose":
                    stack.pose(split[1],parseInt(split[2]));
                    break;
                case "stop":
                    condition=false;
                    break;

                default:
                    System.out.println("Wrong input");
            }

        }

    }

}
