package com.quiz;

import java.util.Scanner;

public class InputConverter {

    public static String[] input(){
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        String[] split=command.split("\\s");
        return split;

    }
}
