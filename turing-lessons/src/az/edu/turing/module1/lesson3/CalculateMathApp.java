package az.edu.turing.module1.lesson3;

import java.util.Scanner;

public class CalculateMathApp {
    public static void main(String[] args) {

        int [] dig3 = new int[2];
        int [] dig4 = new int[2];
        int [] dig5 = new int[2];
        int dig6 = 0;
        int counter = 0;
        int dig3c = 0;
        int dig4c = 0;
        int dig5c = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            int tempNum = num;
            while (tempNum > 0){
                counter ++;
                tempNum /= 10;
            }
            switch (counter){
                case 3:
                    dig3[dig3c] = num;
                    dig3c++;
                    break;
                case 4:
                    dig4[dig4c] = num;
                    dig4c++;
                    break;
                case 5:
                    dig5[dig5c] = num;
                    dig5c++;
                    break;
                default:
                    dig6 = num;
            }
            counter = 0;
        }
    }
}
