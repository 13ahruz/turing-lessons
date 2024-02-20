package az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class ConditionalSt2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y;

        if (x >= 10) {
            y = x * x * x + 5 * x;
        } else {
            y = x * x - 2 * x + 4;
        }

        System.out.println(y);
    }
}

