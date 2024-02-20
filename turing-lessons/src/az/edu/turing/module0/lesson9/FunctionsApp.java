package az.edu.turing.module0.lesson9;

import java.util.Scanner;

public class FunctionsApp {
    public static void main(String[] args) {
        System.out.print("Enter tile of square: ");
        int tile = new Scanner(System.in).nextInt();

        System.out.println("Enter radius of circle: ");
        int radius = new Scanner(System.in).nextInt();

        System.out.println("Area of square is: " + AreaOfSquare(tile));
        System.out.println("Perimeter of square is: " + PerimeterOfSquare(tile));
        System.out.println("Area of circle is: " + AreaOfCircle(radius));
        System.out.println("Length of circle is: " + LengthOfCircle(radius));
    }

    public static int AreaOfSquare(int tile) {
        return tile * tile;
    }

    public static int PerimeterOfSquare(int tile) {
        return tile * 4;
    }

    public static double AreaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }

    public static double LengthOfCircle(int radius) {
        return 2 * Math.PI * radius;
    }
}

