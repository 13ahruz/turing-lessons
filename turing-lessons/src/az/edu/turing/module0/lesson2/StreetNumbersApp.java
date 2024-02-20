package az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class StreetNumbersApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int num1 = Integer.parseInt(input.split(" ")[0]);
        int num2 = Integer.parseInt(input.split(" ")[1]);

        if ((num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 != 0 && num2 % 2 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
