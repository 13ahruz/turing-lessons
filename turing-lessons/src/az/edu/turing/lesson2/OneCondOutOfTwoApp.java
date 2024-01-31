package az.edu.turing.lesson2;

import java.util.Scanner;

public class OneCondOutOfTwoApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        boolean yeap = num % 2 == 0;

        if (num % 3 == 0 && num < 0) {
            yeap = !yeap;
        }
        if (yeap) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

