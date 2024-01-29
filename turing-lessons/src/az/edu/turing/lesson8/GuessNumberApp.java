package az.edu.turing.lesson8;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        System.out.print("Please, enter your name: ");
        String name = new Scanner(System.in).nextLine();
        boolean won = false;

        System.out.println("Let the game begin!");
        System.out.print("Guess the number: ");

        int randomNum = new Random().nextInt(100);

        while (!won) {
            try {
                int guessNum = new Scanner(System.in).nextInt();
                if (guessNum > randomNum) {
                    System.out.print("Your number is too big. Please, try again: ");
                } else if (guessNum < randomNum) {
                    System.out.print("Your number is too small. Please, try again: ");
                } else {
                    System.out.print("Congratulations, " + name + ", you won! ");
                    won = true;
                }
            } catch (Exception e) {
                System.out.print("Not a valid integer, try again: ");
            }
        }
    }
}
