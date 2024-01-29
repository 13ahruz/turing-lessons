package az.edu.turing.homework_2;

import java.util.Scanner;

public class TwoDigitNumberApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        if (number / 10 > -10 && number / 10 < 10 && number / 10 != 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}

