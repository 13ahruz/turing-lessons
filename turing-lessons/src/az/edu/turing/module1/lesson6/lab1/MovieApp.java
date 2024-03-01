package az.edu.turing.module1.lesson6.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie [] movies = new Movie[3];

        System.out.println("""
                Press '1': Input movies.
                Press '2': Display movies and ratings.
                Press '0': Exit.""");

        while (true) {
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    inputMovies(sc, movies);
                    break;
                case 2:
                    printMovies(movies);
                    break;
                case 0:
                    sc.close();
                    break;
            }
        }
    }

    public static void inputMovies (Scanner sc, Movie [] array){
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of movie " + i+1 + ": ");
            String name = sc.nextLine();
            System.out.println("Enter rating of movie " + i+1 + ": ");
            double rating = sc.nextDouble();
            array [i] = new Movie(name, rating);
        }
    }

    public static void printMovies (Movie [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
        }
    }


}
