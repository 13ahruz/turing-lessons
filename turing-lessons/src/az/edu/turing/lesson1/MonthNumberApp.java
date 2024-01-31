package az.edu.turing.lesson1;

import java.util.Scanner;

public class MonthNumberApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input ur number: ");
        int monthNum = sc.nextInt();

        if (monthNum == 1) {
            System.out.println("Your month is January.");
        } else if (monthNum == 2) {
            System.out.println("Your month is February.");
        } else if (monthNum == 3) {
            System.out.println("Your month is March.");
        } else if (monthNum == 4) {
            System.out.println("Your month is April.");
        } else if (monthNum == 5) {
            System.out.println("Your month is May.");
        } else if (monthNum == 6) {
            System.out.println("Your month is June.");
        } else if (monthNum == 7) {
            System.out.println("Your month is July.");
        } else if (monthNum == 8) {
            System.out.println("Your month is August.");
        } else if (monthNum == 9) {
            System.out.println("Your month is September.");
        } else if (monthNum == 10) {
            System.out.println("Your month is October.");
        } else if (monthNum == 11) {
            System.out.println("Your month is November.");
        } else if (monthNum == 12) {
            System.out.println("Your month is December.");
        } else {
            System.out.println("Not valid month!");
        }
    }
}

