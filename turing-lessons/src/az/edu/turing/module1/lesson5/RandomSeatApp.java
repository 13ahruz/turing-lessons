package az.edu.turing.module1.lesson5;

import java.util.Random;

public class RandomSeatApp {
    public static void main(String[] args) {
        String[] names = {
                "Ali", "Aybaniz", "Aydan", "Bahruz", "Bashir",
                "Eldar", "Farid H.", "Fariz K.", "Ilham", "Kanan",
                "Nazrin", "Nurlan", "Selen", "Taleh", "Vusal", "Leyla"
        };
        int[] seats = new int[names.length];

        // If you want, we can fill the array manually,
        // but I write it with for loop for any count of students and seats
        for (int i = 0; i < seats.length; i++) {
            seats[i] = i;
        }

        shuffleSeats(seats);

        for (int i = 0; i < names.length; i++) {
            String student = names[i];
            int seat = seats[i];
            System.out.println(student + " -> Seat " + seat);
        }
    }

    public static void shuffleSeats(int[] seat) {
        Random rnd = new Random();
        for (int i = seat.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = seat[index];
            seat[index] = seat[i];
            seat[i] = temp;
        }
    }
}
