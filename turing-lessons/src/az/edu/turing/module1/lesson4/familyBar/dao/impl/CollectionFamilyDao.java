package az.edu.turing.module1.lesson4.familyBar.dao.impl;

import az.edu.turing.module1.lesson4.familyBar.model.Family;
import az.edu.turing.module1.lesson4.familyBar.dao.FamilyDao;

import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    public static List <Family> allFamilies;
    @Override
    public List<Family> getAllFamilies() {
        try {
            return allFamilies;
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try{
            return allFamilies.get(index);
        }
        catch (Exception e){
            return null;
        }

    }

    @Override
    public boolean deleteFamilyByFamily(Family family) {
        try{
        allFamilies.remove(family);
        return true;
        }
        catch (Exception e){
           return false;
        }
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        try{
            allFamilies.remove(index);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public void saveFamily(Family family) {
        if (allFamilies.contains(family)){
            int index = allFamilies.indexOf(family);
            allFamilies.set(index, family);
        }
        else {
            allFamilies.add(family);
        }
    }
}
