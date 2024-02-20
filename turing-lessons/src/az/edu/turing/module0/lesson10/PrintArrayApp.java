package az.edu.turing.module0.lesson10;

import java.util.Scanner;

public class PrintArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        int counter = 1;
        for (int i = 0; i < 2; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums[0]; i++) {
            for (int j = 0; j < nums[1]; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}


