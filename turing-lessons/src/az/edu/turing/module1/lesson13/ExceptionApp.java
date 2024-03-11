package az.edu.turing.module1.lesson13;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input ur 1st number: ");
        String a = sc.nextLine();
        System.out.print("Input ur 2nd number: ");
        String b = sc.nextLine();
        try {
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
            System.out.println((double) c / d);
        } catch (Exception e) {
            System.out.println("Your input is not a valid number!");
        }
    }
}
