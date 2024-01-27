package edu.homework_2;

import java.util.Scanner;

public class SeassonApp {
    public static void main(String[] args) {
        int monthNum = new Scanner(System.in).nextInt();

        switch (monthNum) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            default -> System.out.println("Autumn");
        }
    }
}
