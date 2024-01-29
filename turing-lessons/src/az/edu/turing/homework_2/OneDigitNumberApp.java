package az.edu.turing.homework_2;

import java.util.Scanner;

public class OneDigitNumberApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        if (number / 10 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Ok");
        }
    }
}
