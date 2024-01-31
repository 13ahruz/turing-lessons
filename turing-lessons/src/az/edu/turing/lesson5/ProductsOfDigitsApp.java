package az.edu.turing.lesson5;

import java.util.Scanner;

public class ProductsOfDigitsApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        System.out.println((num % 10) * (num / 100) * (num % 100 - num % 10) / 10);
    }
}
