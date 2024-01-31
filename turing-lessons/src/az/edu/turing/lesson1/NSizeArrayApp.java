package az.edu.turing.lesson1;

import java.util.Scanner;

public class NSizeArrayApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int counter = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= counter; j++) {
                System.out.print("#");
            }
            counter++;
            System.out.println();
        }
    }
}

