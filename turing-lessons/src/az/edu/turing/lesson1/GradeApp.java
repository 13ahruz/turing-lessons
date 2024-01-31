package az.edu.turing.lesson1;

import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input grade: ");
        double grade = sc.nextDouble();

        if (grade >= 91 && grade <= 100) {
            System.out.println("Your point is A.");
        } else if (grade >= 81 && grade <= 90) {
            System.out.println("Your point is B.");
        } else if (grade >= 71 && grade <= 80) {
            System.out.println("Your point is C.");
        } else if (grade >= 61 && grade <= 90) {
            System.out.println("Your point is D.");
        } else if (grade >= 51 && grade <= 60) {
            System.out.println("Your point is E.");
        } else if (grade >= 1 && grade <= 50) {
            System.out.println("Your point is F.");
        } else {
            System.out.println("U f. up");
        }
    }
}
