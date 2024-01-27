package edu.tasks;

import java.util.Scanner;

public class AllDivisorsApp {
    public static void main(String[] args) {
        System.out.print("Input ur number: ");
        int number = new Scanner(System.in).nextInt();
        boolean simple = true;

        System.out.println("All Divisors:");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(number + "\nComplex Divisors:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        System.out.println("Simple Divisors: ");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        simple = false;
                    }
                }
                if (simple) {
                    System.out.println(i);
                }
                simple = true;
            }
        }
    }
}
