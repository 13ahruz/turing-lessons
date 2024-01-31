package az.edu.turing.lesson2;

import java.util.Scanner;

public class SameSignApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int num1 = Integer.parseInt(input.split(" ")[0]);
        int num2 = Integer.parseInt(input.split(" ")[1]);

        if (num1 * num2 > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
