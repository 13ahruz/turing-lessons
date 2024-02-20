package az.edu.turing.module0.lesson1;

import java.util.Scanner;

public class DividendApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input ur first number: ");
        int a = sc.nextInt();

        System.out.println("Input ur second number: ");
        int b = sc.nextInt();

        System.out.print("Reminder of your numbers is: " + a % b);

    }
}
