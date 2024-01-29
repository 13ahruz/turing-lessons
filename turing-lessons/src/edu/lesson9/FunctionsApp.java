package edu.lesson9;

import java.util.Scanner;

public class FunctionsApp {
        public static void main(String[] args) {
            System.out.print("Enter tile of square: ");
            int tile = new Scanner(System.in).nextInt();


            System.out.println("Enter radius of circle: ");
            int radius = new Scanner(System.in).nextInt();

            System.out.println(AreaOfSquare(tile));
            System.out.println(PerimeterOfSquare(tile));
        }

        public static int AreaOfSquare (int tile){
            return tile*tile;
        }

        public static int PerimeterOfSquare (int tile){
            return tile * 4;
        }

        public static double AreaOfCircle (int radius){
            return Math.PI * radius * radius;
        }

        public static double LengthOfCircle (int radius){
            return 2 * Math.PI * radius;
        }

    }

