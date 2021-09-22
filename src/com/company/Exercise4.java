package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println("\nHello, and welcome back.\n");
        converter();

    }

    public static void converter(){

        Scanner in = new Scanner(System.in);
        int input;

        System.out.println("Guess a number between 1 and 100 including both: ");
        input = in.nextInt();
        System.out.println("You have guessed: " + input);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number to guess was " + number);
        System.out.println("You were off by: " + Math.abs(number - input));
    }
}
