package edu.homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxOfFourApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        List<Integer> nums = new ArrayList<>();
        nums.add(Integer.parseInt(input.split(" ")[0]));
        nums.add(Integer.parseInt(input.split(" ")[1]));
        nums.add(Integer.parseInt(input.split(" ")[2]));
        nums.add(Integer.parseInt(input.split(" ")[3]));

        int maxNum = nums.get(0);
        for (int i = 0; i < 4; i++) {
            maxNum = maxNum > nums.get(i) ? maxNum : nums.get(i);
        }
        System.out.println(maxNum);
    }
}
