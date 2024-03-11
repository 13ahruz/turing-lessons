package az.edu.turing.module1.lesson13;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input ur input: ");
        String a = sc.nextLine();
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
