package edu.lesson9;

import java.util.Random;

public class MethodsApp {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = new Random().nextInt(100);
        }

        PrintArray(arr);
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " -> " + array[i]);
        }
    }
}
