package az.edu.turing.homework_2;

import java.util.Scanner;

public class EducationalLevelApp {
    public static void main(String[] args) {
        int grade = new Scanner(System.in).nextInt();

        String level = "Initial";
        if (grade >= 10) {
            level = "High";
        } else if (grade >= 7) {
            level = "Sufficient";
        } else if (grade >= 4) {
            level = "Average";
        }
        System.out.println(level);
    }
}
