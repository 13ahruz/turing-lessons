package az.edu.turing.module0.lesson11;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        String sentence = new Scanner(System.in).nextLine();

        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.trim());
        System.out.println(sentence.split(" "));
        System.out.println(sentence.replace('a', 'z'));
        System.out.println(sentence.indexOf('a'));
    }
}
