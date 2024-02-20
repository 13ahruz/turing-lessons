package az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class SumOfDigitsApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(num / 1000 + num % 10);
        System.out.println(Method2 (num));
    }


    public static int Method2 (int number){
        number += 5;
        return number;
    }

    public static void Method3 (int hello){
        int abc = 3;
        System.out.println(Method2(abc));
    }
}
