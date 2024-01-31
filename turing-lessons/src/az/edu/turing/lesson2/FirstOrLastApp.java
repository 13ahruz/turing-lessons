package az.edu.turing.lesson2;

import java.util.Scanner;

public class FirstOrLastApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num / 100 > num % 10) {
            System.out.println(num / 100);
        } else if (num / 100 < num % 10){
            System.out.println(num % 10);
        }
        else {
            System.out.println("=");
        }
    }
}

