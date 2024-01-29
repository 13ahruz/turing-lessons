package az.edu.turing.lesson8;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ShipBattleApp {
    public static void main(String[] args) {
        boolean won = false;
        String[][] table = new String[6][6];
        String[] shipCoordinates = new String[3];

        for (int i = 0; i < 6; i++) {
            table[0][i] = String.valueOf(i);
            table[i][0] = String.valueOf(i);
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                table[i][j] = "-";
            }
        }
        System.out.println("All set. Get ready to rumble!");
        PrintTable(table);
        boolean isHorizontal = new Random().nextBoolean();
        while (!won) {
            try {
                if (isHorizontal) {
                    int hCoordinate = new Random().nextInt(5) + 1;
                    int vCoordinate = new Random().nextInt(3) + 1;

                    int c1 = vCoordinate + 1;
                    int c2 = vCoordinate + 2;

                    shipCoordinates[0] = hCoordinate + "-" + vCoordinate;
                    shipCoordinates[1] = hCoordinate + "-" + c1;
                    shipCoordinates[2] = hCoordinate + "-" + c2;

                    while (!Objects.equals(table[hCoordinate][vCoordinate], "o") ||
                            !Objects.equals(table[hCoordinate][vCoordinate + 1], "o") ||
                            !Objects.equals(table[hCoordinate][vCoordinate + 2], "o")) {
                        TryToFind(shipCoordinates, table);
                    }
                    System.out.println("YOU WON");
                    won = true;
                } else {
                    int hCoordinate = new Random().nextInt(3) + 1;
                    int vCoordinate = new Random().nextInt(5) + 1;

                    int c1 = hCoordinate + 1;
                    int c2 = hCoordinate + 2;
                    shipCoordinates[0] = hCoordinate + "-" + vCoordinate;
                    shipCoordinates[1] = c1 + "-" + vCoordinate;
                    shipCoordinates[2] = c2 + "-" + vCoordinate;

                    while (!Objects.equals(table[hCoordinate][vCoordinate], "o") ||
                            !Objects.equals(table[hCoordinate + 1][vCoordinate], "o") ||
                            !Objects.equals(table[hCoordinate + 2][vCoordinate], "o")) {
                        TryToFind(shipCoordinates, table);
                    }
                    System.out.println("YOU WON");
                    won = true;
                }
            } catch (Exception e) {
                System.out.println("Not a valid coordinate, try again!");
            }
        }
    }

    public static void PrintTable(String[][] table) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void TryToFind(String[] shipCoordinates, String[][] table) {
        System.out.print("Enter your coordinates like x-y: ");
        String input = new Scanner(System.in).nextLine();
        int x = Integer.parseInt(input.split("-")[0]);
        int y = Integer.parseInt(input.split("-")[1]);
        if (input.equals(shipCoordinates[0]) ||
                input.equals(shipCoordinates[1]) ||
                input.equals(shipCoordinates[2])) {
            table[x][y] = "o";
        } else {
            table[x][y] = "*";
        }
        PrintTable(table);
    }
}
