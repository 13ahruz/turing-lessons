package edu.homework_2;

import java.util.Scanner;

public class PreviousEvenApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0) {
            System.out.println(num - 2);
        } else {
            System.out.println(num - 1);
        }
    }
}
