package edu.arrayTasks;

import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int[][] rect = new int[num][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
