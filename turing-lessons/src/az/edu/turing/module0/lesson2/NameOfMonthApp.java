package az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class NameOfMonthApp {
    public static void main(String[] args) {
        int monthNum = new Scanner(System.in).nextInt();

        switch (monthNum) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            default -> System.out.print("December");
        }
    }
}
