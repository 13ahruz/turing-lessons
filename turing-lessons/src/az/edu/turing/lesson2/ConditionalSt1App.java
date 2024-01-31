package az.edu.turing.lesson2;

import java.util.Scanner;

public class ConditionalSt1App {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num >= 5) {
            System.out.println(num + 7);
        } else {
            System.out.println(num * num - 3 * num + 4);
        }
    }
}
