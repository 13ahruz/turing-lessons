package az.edu.turing.module1.lesson4.familyBar.controller;

import az.edu.turing.module1.lesson4.familyBar.Family;
import az.edu.turing.module1.lesson4.familyBar.Human;
import az.edu.turing.module1.lesson4.familyBar.Pet;
import az.edu.turing.module1.lesson4.familyBar.service.FamilyService;

import java.util.List;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies(int count) {
        familyService.displayAllFamilies(count);
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        return familyService.getFamiliesBiggerThan(size);
    }

    public List<Family> getFamiliesLessThan(int size) {
        return familyService.getFamiliesLessThan(size);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human father, Human mother) {
        familyService.createNewFamily(father, mother);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamilyByIndex(index);
    }

    public boolean deleteFamilyByFamily(Family family) {
        return familyService.deleteFamilyByFamily(family);
    }

    public void saveFamily(Family family) {
        familyService.saveFamily(family);
    }

    public Family bornChild(Family family, String masculine, String feminine) {
        // Implementation
        return null;
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    public List<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
}
