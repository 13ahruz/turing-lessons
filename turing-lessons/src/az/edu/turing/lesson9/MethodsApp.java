package az.edu.turing.lesson9;

import java.util.Random;

public class MethodsApp {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] = new Random().nextInt(100);
            }
            printArray(arr);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " -> " + array[i]);
        }
    }
}
