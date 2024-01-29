package az.edu.turing.arrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int[] nums = new int[2];
        for (int i = 0; i < 2; i++) {
            nums[i] = Integer.parseInt(input.split(" ")[i]);
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[1]);
    }
}
