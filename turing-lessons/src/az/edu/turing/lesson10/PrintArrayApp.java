package az.edu.turing.lesson10;

import java.util.Scanner;

public class PrintArrayApp {
    public static void main(String[] args) {
       int s = new Scanner(System.in).nextInt();
       int n = 1;
       int counter = 1;
       while (n < s){
           n += 2*n + counter;
           counter++;
       }
        System.out.println(counter);
    }
}

/*
Çatmış bahar bayramı, əlində hədiyyələrlə,


*/
