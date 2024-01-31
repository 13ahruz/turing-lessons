package az.edu.turing.lesson2;

import java.util.Scanner;

public class MinAndMaxApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int num1 = Integer.parseInt(input.split(" ")[0]);
        int num2 = Integer.parseInt(input.split(" ")[1]);

        System.out.println(num1 < num2 ? (num1 + " " + num2) : (num2 + " " + num1));
    }
}
