package az.edu.turing.lesson11;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        String myStr = new Scanner(System.in).nextLine();

        System.out.println(myStr.toLowerCase());
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.trim());
        System.out.println(myStr.split(" "));
        System.out.println(myStr.replace('a', 'z'));
        System.out.println(myStr.indexOf('a'));
    }


}
