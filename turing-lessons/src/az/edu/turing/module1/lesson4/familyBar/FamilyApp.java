package az.edu.turing.module1.lesson4.familyBar;

import az.edu.turing.module1.lesson4.familyBar.controller.FamilyController;
import az.edu.turing.module1.lesson4.familyBar.dao.FamilyDao;
import az.edu.turing.module1.lesson4.familyBar.dao.impl.CollectionFamilyDao;
import az.edu.turing.module1.lesson4.familyBar.service.FamilyService;

import java.util.Scanner;

public class FamilyApp {

    private static final Scanner scanner = new Scanner(System.in);
    public static FamilyDao familyDao = new CollectionFamilyDao();
    public static FamilyService familyService = new FamilyService(familyDao);
    public static FamilyController familyController = new FamilyController(familyService);
    public static void main(String[] args) {

        while (true) {
            displayMenu();
            int choice = readChoice();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    familyController.displayAllFamilies();
                    break;
                case 3:
                    displayFamiliesWithMoreMembers();
                    break;
                case 4:
                    displayFamiliesWithFewerMembers();
                    break;
                case 5:
                    calculateNumberOfFamilies();
                    break;
                case 6:
                    createNewFamily();
                    break;
                case 7:
                    deleteFamilyByIndex();
                    break;
                case 8:
                    break;
                case 9:
                    removeChildrenOverAgeOfMajority();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Fill with test data");
        System.out.println("2. Display the entire list of families");
        System.out.println("3. Display a list of families where the number of people is greater than the specified number");
        System.out.println("4. Display a list of families where the number of people is less than the specified number");
        System.out.println("5. Calculate the number of families where the number of members is");
        System.out.println("6. Create a new family");
        System.out.println("7. Delete a family by its index in the general list");
        System.out.println("8. Edit a family by its index in the general list");
        System.out.println("9. Remove all children over the age of majority");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int readChoice() {
        return scanner.nextInt();
    }

    private static void displayFamiliesWithMoreMembers() {
        System.out.print("Enter the number of members: ");
        int size = scanner.nextInt();
        familyController.getFamiliesBiggerThan(size).forEach(System.out::println);
    }

    private static void displayFamiliesWithFewerMembers() {
        System.out.print("Enter the number of members: ");
        int size = scanner.nextInt();
        familyController.getFamiliesLessThan(size).forEach(System.out::println);
    }

    private static void calculateNumberOfFamilies() {
        System.out.print("Enter the number of members: ");
        int number = scanner.nextInt();
        int count = familyController.countFamiliesWithMemberNumber(number);
        System.out.println("Number of families with " + number + " members: " + count);
    }

    private static void createNewFamily() {
        System.out.print("Enter mother's name: ");
        String motherName = scanner.next();
        System.out.print("Enter mother's surname: ");
        String motherSurname = scanner.next();
        // Complete other details for mother
        System.out.print("Enter father's name: ");
        String fatherName = scanner.next();
        System.out.print("Enter father's surname: ");
        String fatherSurname = scanner.next();

        Human mother = new Human(motherName, motherSurname);
        Human father = new Human(fatherName, fatherSurname);
        familyController.createNewFamily(father, mother);
        System.out.println("New family created successfully.");
    }

    private static void deleteFamilyByIndex() {
        System.out.print("Enter the index of the family to delete: ");
        int index = scanner.nextInt();
        boolean deleted = familyController.deleteFamilyByIndex(index);
        if (deleted) {
            System.out.println("Family at index " + index + " deleted successfully.");
        } else {
            System.out.println("Family deletion failed. Invalid index or other error occurred.");
        }
    }

    private static void removeChildrenOverAgeOfMajority() {
        System.out.print("Enter the age of majority: ");
        int age = scanner.nextInt();
        familyController.deleteAllChildrenOlderThan(age);
        System.out.println("Children older than " + age + " removed from all families.");
    }
}
