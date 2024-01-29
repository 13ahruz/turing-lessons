package az.edu.turing.lesson8;

import java.util.Objects;

public class DiamondSharpsApp {
    public static void main(String[] args) {
        String[][] sharps = new String[10][10];

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                sharps[i][5 - j] = " ";
                sharps[i][4 + j] = " ";
                sharps[9 - i][5 - j] = " ";
                sharps[9 - i][4 + j] = " ";
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!Objects.equals(sharps[i][j], " ")) {
                    sharps[i][j] = "#";
                }
                System.out.print(sharps[i][j]);
            }
            System.out.println();
        }
    }
}
