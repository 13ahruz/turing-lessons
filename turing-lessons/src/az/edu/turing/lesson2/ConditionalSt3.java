package az.edu.turing.lesson2;

import java.util.Scanner;

public class ConditionalSt3 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num < -4) {
            System.out.println(num + 5);
        } else if (num <= 7) {
            System.out.println(num * num - 3 * num);
        } else {
            System.out.println(num * num * num + 2 * num);
        }
    }
}
