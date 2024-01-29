package az.edu.turing.homework_2;

import java.util.Scanner;

public class SgnApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num > 0) {
            System.out.println(1);
        } else if (num < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
