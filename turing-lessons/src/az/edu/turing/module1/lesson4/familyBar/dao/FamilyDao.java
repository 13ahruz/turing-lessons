package az.edu.turing.module1.lesson4.familyBar.dao;

import az.edu.turing.module1.lesson4.familyBar.Family;

import java.util.List;

public interface FamilyDao {
    List <Family> getAllFamilies();
    Family getFamilyByIndex (int index);
    boolean deleteFamilyByIndex (int index);
    boolean deleteFamilyByFamily (Family family);
    void saveFamily (Family family);
}
