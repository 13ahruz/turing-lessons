package az.edu.turing.lesson2;

import java.util.Scanner;

public class EachConditionApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        boolean print = num % 2 == 0 && num > 0;

        if (num % 2 != 0 && num < 0) {
            print = true;
        }
        if (!print) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

