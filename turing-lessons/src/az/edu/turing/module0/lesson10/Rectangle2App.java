package az.edu.turing.module0.lesson10;

import java.util.Scanner;

public class Rectangle2App {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

