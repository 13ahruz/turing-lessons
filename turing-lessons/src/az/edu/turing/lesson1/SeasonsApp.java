package az.edu.turing.lesson1;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input ur month number: ");
        int a = sc.nextInt();

        String monthName = (a == 1 || a == 2 || a == 12) ? "Your month is in winter."
                : (a == 3 || a == 4 || a == 5) ? "Your month is in spring." : (a == 6 || a == 7 || a == 8) ? "Your month is in autumn."
                : "Your month is in summer.";

        System.out.print(monthName);
    }
}