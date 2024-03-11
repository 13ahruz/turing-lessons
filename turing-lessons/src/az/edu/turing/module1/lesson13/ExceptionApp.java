package az.edu.turing.module1.lesson13;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input ur 1st input: ");
        String a = sc.nextLine();
        System.out.print("Input ur 2nd input: ");
        String b = sc.nextLine();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.println(c/d);
    }
}
