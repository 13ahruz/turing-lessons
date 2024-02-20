package az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class EvenOrOddApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        String type = num % 2 == 0 ? "EVEN" : "ODD";
        System.out.println(type);
    }
}
