package az.edu.turing.module1.lesson13;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input ur 1st number: ");
        String line1 = sc.nextLine();
        System.out.print("Input ur 2nd number: ");
        String line2 = sc.nextLine();
        try {
            int number1 = Integer.parseInt(line1);
            int number2 = Integer.parseInt(line2);
            double result = (double) number1 / number2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Your input is not a valid number!");
        }
    }
}
