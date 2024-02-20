package az.edu.turing.module0.lesson5;

import java.util.Scanner;

public class SumSquareApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        System.out.println((num / 10 + num % 10) * (num / 10 + num % 10));
    }
}
