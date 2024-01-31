package az.edu.turing.lesson5;

import java.util.Scanner;

public class SnakeMatrixApp {
    public static void main(String[] args) {
        int length = new Scanner(System.in).nextInt();
        int[][] nums = new int[length][length];
        int addNum = 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                nums[i][j] = addNum++;
            }
        }


        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = length - 1; j >= 0; j--) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


