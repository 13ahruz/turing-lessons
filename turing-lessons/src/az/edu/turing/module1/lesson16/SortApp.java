package az.edu.turing.module1.lesson16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert array length: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        Random rd = new Random();
        for (int i = 0; i < len; i++) {
            nums[i] = rd.nextInt(100);
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ", ");
        }


        String[] sts = {"\nSalam", "Qaqa", "AyQaqa", "Necesen"};
        Arrays.sort(sts);
        for (int i = 0; i < sts.length; i++) {
            System.out.println(sts[i]);
        }
    }
}
