package az.edu.turing.lesson5;

import java.util.Scanner;

public class ArrayBeginingApp {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int sumEven = 0;
        int productOdd = 1;
        int largest = 0;
        int smallest = 0;

        System.out.println("Enter the length: ");
        int num = new Scanner(System.in).nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Import " + i + ". element.");
            nums[i] = new Scanner(System.in).nextInt();
            smallest = nums[i];
        }
        for (int i = 0; i < num; i++) {
            System.out.println(nums[i] * 2);
            sum += nums[i];
            product *= nums[i];
            if (i % 2 == 0) {
                sumEven += nums[i];
            } else {
                productOdd *= nums[i];
            }
            if (nums[i] > largest) {
                largest = nums[i];
            }

        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        System.out.println("Sum of evens is: " + sumEven);
        System.out.println("Product of odds is: " + productOdd);
        System.out.println("Largest is: " + largest);
        System.out.println("Smallest is: " + smallest);
    }
}
