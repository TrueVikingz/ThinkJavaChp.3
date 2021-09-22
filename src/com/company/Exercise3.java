package com.company;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[]args) {

        System.out.println("\nHello, and welcome back.\n");

        converter();

    }

    public static void converter(){

        Scanner in = new Scanner(System.in);
        int input;
        int result;

        System.out.println("Please specify the amount of seconds you need converted:");
        input = in.nextInt();
        int hour = input / 3600;
        int minutes = input % 3600 / 60;
        int seconds = input % 3600 % 60;

        System.out.printf("%d seconds = %d hour, %d minutes, %d seconds", input, hour, minutes, seconds);
    }
}
