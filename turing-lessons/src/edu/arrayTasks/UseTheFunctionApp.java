package edu.arrayTasks;

import java.util.Scanner;

public class UseTheFunctionApp {
    public static void main(String[] args) {
        String numsLine = new Scanner(System.in).nextLine();
        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = Double.parseDouble(numsLine.split(" ")[i]);
        }

        System.out.println(Math.min(Math.min(Math.max(numbers[0], numbers[1]),
                Math.max(numbers[1], numbers[2])), (numbers[0] + numbers[1] + numbers[2])));
    }
}
