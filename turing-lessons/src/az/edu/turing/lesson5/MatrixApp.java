package az.edu.turing.lesson5;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int[] nums = new int[2];
        int counter = 1;
        for (int i = 0; i < 2; i++) {
            nums[i] = Integer.parseInt(input.split(" ")[i]);
        }

        for (int i = 0; i < nums[0]; i++) {
            for (int j = 0; j < nums[1]; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
