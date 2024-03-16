package az.edu.turing.module1.lesson5;

import java.util.Random;

public class RandomSeatApp {
    public static void main(String[] args) {
        //Description
        // I used Fisher-Yates shuffle algorithm for random seats

        String[] names = {
                "Ali", "Aybaniz", "Aydan", "Bahruz", "Bashir",
                "Eldar", "Farid H.", "Fariz K.", "Ilham", "Kanan",
                "Nazrin", "Nurlan", "Selen", "Taleh", "Vusal", "Leyla"
        };
        int[] seats = new int[names.length];

        fillArray(seats);
        shuffleSeats(seats);
        printResult(names, seats);
    }

    public static void shuffleSeats(int[] seats) {
        Random rnd = new Random();
        for (int i = seats.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = seats[index];
            seats[index] = seats[i];
            seats[i] = temp;
        }
    }


    public static void printResult(String[] students, int[] seats) {
        for (int i = 0; i < students.length; i++) {
            String student = students[i];
            int seat = seats[i];
            System.out.printf("%s\t->\tSeat %d\n", student, seat);
        }
    }


    public static void fillArray(int[] array) {
        // If you want, we can fill the array manually,
        // but I write it with for loop for any count of students and seats
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}