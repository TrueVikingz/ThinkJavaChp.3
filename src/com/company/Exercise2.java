package com.company;

//Scanner files
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        //intro
        System.out.println("\nHello, and welcome back. \nThis is an converter between Fahrenheit and Celsius.");

        converter();

    }

    public static void converter() {

        Scanner in = new Scanner(System.in);
        int number;
        int result = 0;


            while (true) {

                int operation;

                System.out.println("What do you want calculated?\n" +
                        "1. Celsius to Fahrenheit\n" +
                        "2. Fahrenheit to Celsius");


                operation = in.nextInt();

                if (operation < 1 || operation > 2) {
                    System.out.println("What will you need off me?");

                }

                    System.out.println("What temperature do you need converted?");
                    number = in.nextInt();


                switch (operation) {
                    case 1:
                        result = number * 9 / 5 + 32;
                        break;
                    case 2:
                        result = ((number - 32)* 5) / 9;
                        break;
                    default:
                        result = 0;
                }
                        System.out.println("The temperature of the opposite scale is: " + result + "\n");


            }

    }
}
