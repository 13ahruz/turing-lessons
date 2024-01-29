package edu.lesson9;

import java.util.Scanner;

public class FunctionsApp {
        public static void main(String[] args) {

            int tile = new Scanner(System.in).nextInt();

            System.out.println(Area(tile));
            System.out.println(Perimeter(tile));
        }

        public static int Area (int tile){
            return tile*tile;
        }

        public static int Perimeter (int tile){
            return tile * 4;
        }

    }

