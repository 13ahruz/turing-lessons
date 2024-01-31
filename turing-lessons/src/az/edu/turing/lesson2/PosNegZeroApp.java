package az.edu.turing.lesson2;

import java.util.Scanner;

public class PosNegZeroApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        String output = "Zero";
        if (num > 0) {
            output = "Positive";
        } else if (num < 0) {
            output = "Negative";
        }
        System.out.println(output);
    }
}
