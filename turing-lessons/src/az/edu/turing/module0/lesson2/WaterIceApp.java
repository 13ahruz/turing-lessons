package az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class WaterIceApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}

