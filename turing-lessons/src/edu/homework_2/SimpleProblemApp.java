package edu.homework_2;

import java.util.Scanner;

public class SimpleProblemApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.print(number / 10 + " " + number % 10);
    }
}
