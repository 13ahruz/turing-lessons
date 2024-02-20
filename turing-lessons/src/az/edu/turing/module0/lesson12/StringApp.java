package az.edu.turing.module0.lesson12;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        String eMail = new Scanner(System.in).nextLine();

        System.out.println(takeNameFromMail(eMail));
        System.out.println(printLengthOfName(takeNameFromMail(eMail)));
    }

    public static String takeNameFromMail(String eMail) {
        return eMail.split("@")[0];
    }

    public static int printLengthOfName(String name) {
        return name.length();
    }
}
