package az.edu.turing.module1.lesson5;

import java.util.Random;

public class RandomSeatApp2 {
    public static void main(String[] args) {
        //Description
        // I also used Fisher-Yates shuffle algorithm for random seats here

        String[] names = {
                "Ali", "Aybaniz", "Aydan", "Bahruz", "Bashir",
                "Eldar", "Farid H.", "Fariz K.", "Ilham", "Kanan",
                "Nazrin", "Nurlan", "Selen", "Taleh", "Vusal", "Leyla"
        };

        shuffleSeats(names);
    }

    public static void shuffleSeats(String [] students) {
        Random rnd = new Random();
        for (int i = students.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String temp = students[index];
            students[index] = students[i];
            students[i] = temp;
        }
        printResult(students);
    }

    public static void printResult(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Seat %d\t->\t %s\n", i, students[i]);
        }
    }
}
