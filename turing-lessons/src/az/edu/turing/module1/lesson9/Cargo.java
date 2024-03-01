package az.edu.turing.module1.lesson9;

import java.util.Scanner;

public class Cargo {
    public static void main(String[] args) {
        String status = new Scanner(System.in).nextLine();

        switch (status) {
            case "Prepearing" -> System.out.println("Your order is prepearing ...");
            case "On the way" -> System.out.println("Your order is on the way ...");
            case "Delivered" -> System.out.println("Your order is delivered ...");
            case "Cancelled" -> System.out.println("Please, write your reason ...");
        }
    }
}
