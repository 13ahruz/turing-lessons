package edu.homework_2;

import java.util.Scanner;

public class NextOddIntApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0) {
            System.out.println(num + 1);
        } else {
            System.out.println(num + 2);
        }
    }
}

