package az.edu.turing.homework_2;

import java.util.Scanner;

public class DivisibilityByDigitsApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int digit0 = number / 1000;
        int digit1 = (number % 1000 - number % 100) / 100;
        int digit2 = (number % 100 - number % 10) / 10;
        int digit3 = number % 10;

        if (digit0 == 0 || digit1 == 0 || digit2 == 0 || digit3 == 0) {
            System.out.println("NO");
        } else if (number % digit0 == 0 && number % digit1 == 0 && number % digit2 == 0 && number % digit3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
