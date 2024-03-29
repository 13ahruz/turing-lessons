package az.edu.turing.module1.lesson15;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class MentorLapApp {
    public static void main(String[] args) {
        String textLine;
        int testNum;

        try {
            textLine = inputString ();
            System.out.println(textLine);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found ...");
        }
        finally {
            //blablabla
        }

        testNum = computeSequence ("58437");
        System.out.println(testNum);


    }

    public static String inputString() throws FileNotFoundException {
        File file = new File
                ("C:\\Users\\ROMedia\\Desktop\\Turing\\turing-lessons\\src\\az\\edu\\turing\\module1\\lesson15\\test.txt");
        Scanner sc = new Scanner(file);
        String a = sc.nextLine();
        return a;
    }

    public static int computeSequence(String a){
        int b;
        int sum = 0;
        int lastNum = 0;

        try {
            b = Integer.parseInt(a);
            lastNum = b % 10;
            b = b / 10;
            while (b > 0){
                sum = b % 10;
                b = b/ 10;
            }
            return sum / lastNum;
        }
        catch (IllegalArgumentException | ArithmeticException e){
            return -1;
        }
    }
}
