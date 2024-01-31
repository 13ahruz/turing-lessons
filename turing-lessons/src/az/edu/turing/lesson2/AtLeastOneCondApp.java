package az.edu.turing.lesson2;

import java.util.Scanner;

public class AtLeastOneCondApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num % 2 != 0) {
            System.out.println("YES");
        } else if (num / 10 > 9 && num / 10 < 99 && num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

