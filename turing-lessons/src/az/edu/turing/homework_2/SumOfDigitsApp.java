package az.edu.turing.homework_2;

import java.util.Scanner;

public class SumOfDigitsApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        System.out.println(num / 1000 + num % 10);
    }
}
